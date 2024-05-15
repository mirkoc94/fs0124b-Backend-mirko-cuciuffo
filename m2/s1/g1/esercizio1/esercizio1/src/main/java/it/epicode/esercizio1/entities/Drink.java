package it.epicode.esercizio1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString(callSuper = true)
public class Drink extends Item{

    public Drink(String name, int calories, double price) {
        super(name, calories, price);
    }

}
