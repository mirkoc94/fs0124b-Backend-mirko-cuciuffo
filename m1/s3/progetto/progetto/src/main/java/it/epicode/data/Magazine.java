package it.epicode.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Magazine extends Item {
    private Frequency frequency;

    public Magazine() {
    }

    public Magazine(int isbn, String title, Date year, int pages, Frequency frequency) {
        super(isbn, title, year, pages);
        this.frequency = frequency;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "frequency=" + frequency +
                '}';
    }
}
