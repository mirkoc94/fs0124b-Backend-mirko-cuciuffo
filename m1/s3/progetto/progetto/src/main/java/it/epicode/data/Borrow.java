package it.epicode.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Borrow {
    @Id
    @GeneratedValue
    @JoinColumn(name = "user_id")
    private User user;
    private Item item;
    private Date borrowStart;
    private Date borrowExpected;
    private Date borrowActual;

    public Borrow() {
    }

    public Borrow(User user, Item item, Date borrowStart, Date borrowExpected, Date borrowActual) {
        this.user = user;
        this.item = item;
        this.borrowStart = borrowStart;
        this.borrowExpected = borrowExpected;
        this.borrowActual = borrowActual;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getBorrowStart() {
        return borrowStart;
    }

    public void setBorrowStart(Date borrowStart) {
        this.borrowStart = borrowStart;
    }

    public Date getBorrowExpected() {
        return borrowExpected;
    }

    public void setBorrowExpected(Date borrowExpected) {
        this.borrowExpected = borrowExpected;
    }

    public Date getBorrowActual() {
        return borrowActual;
    }

    public void setBorrowActual(Date borrowActual) {
        this.borrowActual = borrowActual;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "user=" + user +
                ", item=" + item +
                ", borrowStart=" + borrowStart +
                ", borrowExpected=" + borrowExpected +
                ", borrowActual=" + borrowActual +
                '}';
    }
}
