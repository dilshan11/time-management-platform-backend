package lk.hackthon.calender.entity;

import org.springframework.jdbc.core.SqlReturnType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.SplittableRandom;

@Entity
public class Days {
    @Id
    String day;
    @OneToMany(mappedBy = "day")
    List<User_day> user_days;
    String month;
    public Days() {
    }



    public void setUser_days(List<User_day> user_days) {
        this.user_days = user_days;
    }

    public Days(String day, String month) {
        this.day = day;
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<User_day> getUser_days() {
        return user_days;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Days{" +
                "day='" + day + '\'' +
                ", user_days=" + user_days +
                ", month='" + month + '\'' +
                '}';
    }
}
