package lk.hackthon.calender.service.impl;

import lk.hackthon.calender.Dto.*;
import lk.hackthon.calender.entity.Days;
import lk.hackthon.calender.entity.Orders;
import lk.hackthon.calender.entity.User;
import lk.hackthon.calender.entity.User_day;
import lk.hackthon.calender.repositery.CalanderRepositery;
import lk.hackthon.calender.service.CalanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalanderServiceImpl implements CalanderService {
    @Autowired
    CalanderRepositery calanderRepositery;
    @Override
    public void saveUser(UserDto userDto) {
        User user=new User(userDto.getFullname(),userDto.getPassword(),userDto.getEmail());
        calanderRepositery.saveUser(user);
    }

    @Override
    public void saveOrder(Orders orders) {
        calanderRepositery.saveOrders(orders);
    }

    @Override
    public void saveday_day(User_dayDto user_dayDto) {
        User user=new User(user_dayDto.getUserDto().getFullname(),user_dayDto.getUserDto().getPassword(),user_dayDto.getUserDto().getEmail());
        Days days=new Days(user_dayDto.getDayDto().getDay(),user_dayDto.getDayDto().getMonth());
       User_day user_day=new User_day(user,days,user_dayDto.getFrist(),user_dayDto.getSecond(),user_dayDto.getThird(),user_dayDto.getMonth());
        System.out.println("this is it" + user_day);
        calanderRepositery.saveday_days(user_day);
    }

    @Override
    public void noteday(DayDto dayDto) {
        if(dayDto.getMonth().equals("f")) {
            for (int i = 1; i <= 30; i++) {
                System.out.println("sfgfdgd");
                Days days = new Days("March"+i,"March");
                calanderRepositery.noteday(days);
            }
        }
    }

    @Override
    public UserDto checklog(LogDto logDto) {
        User user = calanderRepositery.getloguser(logDto);
        if(user !=null) {
            if (user.getPassword().equals(logDto.getPassword1())) {
                System.out.println("this this");
                UserDto userDto = new UserDto(user.getFullname(), user.getPassword(), user.getEmail());
                return userDto;
            }
        }
        return null;
    }

    @Override
    public List<User_dayDto> getall(UserDetails userDetails) {
             List<Object[]> as=  calanderRepositery.getallUserdetails(userDetails);
             List<User_dayDto> userDayDtos=new ArrayList<>();
             for(Object[] a: as){
                 User_dayDto user_dayDto=new User_dayDto(a[1].toString(),a[3].toString(),a[4].toString(),a[5].toString());
                 userDayDtos.add(user_dayDto);
             }
        return userDayDtos;
    }

    @Override
    public List<UserDto> getallfriends() {
        List<Object[]> as=calanderRepositery.getallfriends();
        List<UserDto> asd=new ArrayList<>();
        for(Object[]a : as){
            UserDto userDto=new UserDto(a[0].toString(),a[2].toString(),a[1].toString());
            System.out.println(a[0].toString()+" "+a[2].toString()+" "+a[1].toString());
            asd.add(userDto);
        }
        return asd;
    }
}
