package lk.hackthon.calender.repositery.impl;

import lk.hackthon.calender.Dto.LogDto;
import lk.hackthon.calender.Dto.UserDetails;
import lk.hackthon.calender.Dto.UserDto;
import lk.hackthon.calender.Dto.User_dayDto;
import lk.hackthon.calender.entity.Days;
import lk.hackthon.calender.entity.Orders;
import lk.hackthon.calender.entity.User;
import lk.hackthon.calender.entity.User_day;
import lk.hackthon.calender.repositery.CalanderRepositery;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CalanderRepositeryImpl implements CalanderRepositery {
    @Autowired
    private SessionFactory sf;
    @Override
    public void saveUser(User user) {
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    @Override
    public void saveOrders(Orders orders) {
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(orders);
        session.getTransaction().commit();
    }

    @Override
    public void saveday_days(User_day user_day) {
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(user_day);
        session.getTransaction().commit();
    }

    @Override
    public void noteday(Days days) {
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(days);
        session.getTransaction().commit();
    }

    @Override
    public User getloguser(LogDto logDto) {
        Session session=sf.openSession();
        session.beginTransaction();
        User user=session.get(User.class,logDto.getEma());
        session.getTransaction().commit();
        if(user != null){
            return user;
        }
        return null;
    }

    @Override
    public List<Object[]> getallUserdetails(UserDetails userDetails) {
        Session session=sf.openSession();
        session.beginTransaction();
        SQLQuery query = session.createSQLQuery("select* from user_day where user1_email='"+userDetails.getEmail()+"'And month='"+userDetails.getMonth()+"'");
        List<Object[]> as = query.list();
        session.getTransaction().commit();
        return as;
    }

    @Override
    public List<Object[]> getallfriends() {
        Session session=sf.openSession();
        session.beginTransaction();
       List<Object[]> as =session.createSQLQuery("select * from user").list();
        session.getTransaction().commit();
        return as;
    }


}
