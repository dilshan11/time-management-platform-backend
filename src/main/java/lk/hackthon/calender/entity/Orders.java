package lk.hackthon.calender.entity;

import javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int oid;
    @ManyToOne(cascade = CascadeType.ALL)
    User user;
    public Orders() {
    }

    public Orders(int oid) {
        this.oid = oid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
