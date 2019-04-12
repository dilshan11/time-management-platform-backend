package lk.hackthon.calender.service;

import lk.hackthon.calender.Dto.*;
import lk.hackthon.calender.entity.Orders;
import lk.hackthon.calender.entity.User;

import java.util.List;

public interface CalanderService {
    public void saveUser(UserDto userDto);
    public void saveOrder(Orders orders);
    public void saveday_day(User_dayDto user_dayDto);
    public void noteday(DayDto dayDto);
    public UserDto checklog(LogDto logDto);
    public List<User_dayDto> getall(UserDetails userDetails);
    public List<UserDto> getallfriends();
}
