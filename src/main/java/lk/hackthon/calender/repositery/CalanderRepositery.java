package lk.hackthon.calender.repositery;

import lk.hackthon.calender.Dto.*;
import lk.hackthon.calender.entity.Days;
import lk.hackthon.calender.entity.Orders;
import lk.hackthon.calender.entity.User;
import lk.hackthon.calender.entity.User_day;

import java.util.List;

public interface CalanderRepositery {
    public void saveUser(User user);
    public void saveOrders(Orders order);
    public void saveday_days(User_day user_day);
    public void noteday(Days days);
    public User getloguser(LogDto logDto);
    public List<Object[]> getallUserdetails(UserDetails userDetails);
    public List<Object[]> getallfriends();
}
