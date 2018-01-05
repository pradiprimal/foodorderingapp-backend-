package com.foodorderingapp.daoImpl;

import com.foodorderingapp.config.DBConnection;
import com.foodorderingapp.dao.OrderDetailDAO;
import com.foodorderingapp.dto.OrderDetailDto;
import com.foodorderingapp.model.OrderDetail;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository("orderDetailDAO")
@Transactional
public class OrderDetailDaoImpl implements OrderDetailDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addOrderDetail(OrderDetail orderDetail) {
        try {
            sessionFactory.getCurrentSession().save(orderDetail);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<OrderDetailDto> getOrderDetail() {

        try {

            Connection con = DBConnection.getConnection();
            List<OrderDetailDto> orderDetailDtoList = new ArrayList<OrderDetailDto>();

            String sql = " SELECT tbl_users.first_name,tbl_users.middle_name,tbl_users.last_name,tbl_order_detail.restaurant_name, tbl_order_detail.food_name ,tbl_order_detail.quantity FROM ((tbl_order_detail INNER join tbl_order ON tbl_order.order_id = tbl_order_detail.order_id) INNER JOIN tbl_users on tbl_users.user_id = tbl_order.user_id)";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                OrderDetailDto orderDetailDto = new OrderDetailDto();
                orderDetailDto.setFoodName(rs.getString("food_name"));
                orderDetailDto.setQuantity(rs.getInt("quantity"));
                orderDetailDto.setRestaurantName(rs.getString("restaurant_name"));
                orderDetailDto.setFirstName(rs.getString("first_name"));
                orderDetailDto.setMiddleName(rs.getString("middle_name"));
                orderDetailDto.setLastName(rs.getString("last_name"));
                orderDetailDtoList.add(orderDetailDto);

            }
            return orderDetailDtoList;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return null;

    }


    public List<OrderDetail> getOrderDetailByUser(int userId) {

        return sessionFactory.getCurrentSession().createQuery("FROM OrderDetail o where o.orders.user.userId=:userId", OrderDetail.class).
                setParameter("userId", userId).
                getResultList();

    }
}
