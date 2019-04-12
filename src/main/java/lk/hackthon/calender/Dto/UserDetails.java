package lk.hackthon.calender.Dto;

public class UserDetails {
    String email;
    String month;

    public UserDetails() {
    }

    public UserDetails(String email, String month) {
        this.email = email;
        this.month = month;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
