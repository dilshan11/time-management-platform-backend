package lk.hackthon.calender.controller;

import lk.hackthon.calender.Dto.*;
import lk.hackthon.calender.entity.Orders;
import lk.hackthon.calender.service.CalanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("calander")
public class CalanderController {
    @Autowired
    CalanderService calanderService;
    @PostMapping("/saveUser")
    public void saveCustomer(@RequestBody UserDto userDto){
            calanderService.saveUser(userDto);
    }
    @PostMapping("/saveOrders")
    public void saveOrders(@RequestBody Orders orders){
        calanderService.saveOrder(orders);
    }
    @PostMapping("/saveday")
    public void saveday(@RequestBody User_dayDto user_dayDto){
        System.out.println(user_dayDto);
       calanderService.saveday_day(user_dayDto);
    }
    @PostMapping("/note")
    public void notedays(@RequestBody DayDto dayDto){
        calanderService.noteday(dayDto);
    }
    @PostMapping("/log")
    public UserDto checklog(@RequestBody LogDto logDto){
        return calanderService.checklog(logDto);
    }
    @PostMapping("/getall")
    public List<User_dayDto> getalluser_day(@RequestBody UserDetails userDetails){
        return calanderService.getall(userDetails);
    }
    @GetMapping("/getfriends")
    public List<UserDto> getallfriends(){
         return calanderService.getallfriends();
    }

}
