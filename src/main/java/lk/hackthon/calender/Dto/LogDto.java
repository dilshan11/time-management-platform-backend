package lk.hackthon.calender.Dto;

public class LogDto {
    String ema;
    String password1;

    public LogDto() {
    }

    public LogDto(String ema, String password1) {
        this.ema = ema;
        this.password1 = password1;
    }

    public String getEma() {
        return ema;
    }

    public void setEma(String ema) {
        this.ema = ema;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    @Override
    public String toString() {
        return "LogDto{" +
                "ema='" + ema + '\'' +
                ", password1='" + password1 + '\'' +
                '}';
    }
}
