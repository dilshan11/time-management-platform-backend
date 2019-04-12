package lk.hackthon.calender.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    String fullname;
    String password;
    @Id
    String email;
    @OneToMany(mappedBy = "user")
    List<Orders> orders;
    @OneToMany(mappedBy = "user1")
    List<User_day> user_days;

    public User() {
    }

    public User(String fullname, String password, String email) {
        this.fullname = fullname;
        this.password = password;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public List<User_day> getUser_days() {
        return user_days;
    }

    public void setUser_days(List<User_day> user_days) {
        this.user_days = user_days;
    }

    @Override
    public String toString() {
        return "User{" +
                ", fullname='" + fullname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", orders=" + orders +
                ", user_days=" + user_days +
                '}';
    }
}
