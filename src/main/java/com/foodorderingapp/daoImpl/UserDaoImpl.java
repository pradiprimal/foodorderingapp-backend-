package com.foodorderingapp.daoImpl;

import com.foodorderingapp.dao.UserDAO;
import com.foodorderingapp.model.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository("userDAO")
@Transactional
public class UserDaoImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addUser(User user) {

        try {

            sessionFactory.getCurrentSession().save(user);

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }

    public List<User> getUsers() {

        return sessionFactory.getCurrentSession().createQuery("FROM User", User.class).getResultList();

    }

    public User getUserByEmailAndPassword(User user) {

        try {

            User user1 = sessionFactory
                    .getCurrentSession()
                    .createQuery("FROM User WHERE email=:email AND userPassword=:userPassword", User.class)
                    .setParameter("email", user.getEmail())
                    .setParameter("userPassword", user.getUserPassword()).getSingleResult();

            return user1;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        return null;
    }
}
