package it.epicode.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER)
public class Item {
    @Id
    @Column(length = 13, nullable = false)
    private int isbn;
    @Column(length = 125, nullable = false)
    private String title;
    private Date year;
    private int pages;

    public Item() {
    }

    public Item(int isbn, String title, Date year, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Item{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
