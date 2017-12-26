package com.foodorderingapp.daoImpl;

import com.foodorderingapp.dao.OrderDetailDAO;
import com.foodorderingapp.model.OrderDetail;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

    public List<OrderDetail> getOrderDetail() {
        return  sessionFactory.getCurrentSession().createQuery("FROM OrderDetail", OrderDetail.class).getResultList();
    }
}
