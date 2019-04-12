package lk.hackthon.calender.entity;

import lk.hackthon.calender.Dto.DayDto;
import lk.hackthon.calender.Dto.UserDto;

import javax.persistence.*;

@Entity
public class User_day {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int udId;
    @ManyToOne(cascade = CascadeType.ALL)
    User user1;
    @ManyToOne(cascade = CascadeType.ALL)
    Days day;
    String frist;
    String second;
    String third;
    String month;

    public User_day() {
    }

    public User_day(User user1, Days day, String frist, String second, String third, String month) {
        this.user1 = user1;
        this.day = day;
        this.frist = frist;
        this.second = second;
        this.third = third;
        this.month = month;
    }

    public int getUdId() {
        return udId;
    }

    public void setUdId(int udId) {
        this.udId = udId;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public Days getDay() {
        return day;
    }

    public void setDay(Days day) {
        this.day = day;
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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
