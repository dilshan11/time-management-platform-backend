package lk.hackthon.calender.Dto;

import lk.hackthon.calender.entity.Days;
import lk.hackthon.calender.entity.User;

public class User_dayDto {
    UserDto userDto;
    DayDto dayDto;
    String month;
    String frist;
    String second;
    String third;

    public User_dayDto() {
    }

    public User_dayDto(String frist, String second, String third,String month) {
        this.month = month;
        this.frist = frist;
        this.second = second;
        this.third = third;
    }

    public User_dayDto(UserDto userDto, DayDto dayDto, String month, String frist, String second, String third) {
        this.userDto = userDto;
        this.dayDto = dayDto;
        this.month = month;
        this.frist = frist;
        this.second = second;
        this.third = third;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public DayDto getDayDto() {
        return dayDto;
    }

    public void setDayDto(DayDto dayDto) {
        this.dayDto = dayDto;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getFrist() {
        return frist;
    }

    public void setFrist(String frist) {
        this.frist = frist;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }
}
