package lk.hackthon.calender.Dto;

public class DayDto {

    String day;
    String month;

    public DayDto() {
    }

    public DayDto(String day, String month) {
        this.day = day;
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "DayDto{" +
                "day='" + day + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}
