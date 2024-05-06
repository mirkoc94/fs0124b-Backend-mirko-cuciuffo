package it.epicode.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class User {
    private String name;
    private String surname;
    private Date birthday;
    @Id
    @GeneratedValue
    @OneToOne(mappedBy = "user")
    private int cardCode;

    public User() {
    }

    public User(String name, String surname, Date birthday, int cardCode) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.cardCode = cardCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getCardCode() {
        return cardCode;
    }

    public void setCardCode(int cardCode) {
        this.cardCode = cardCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", cardCode=" + cardCode +
                '}';
    }
}
