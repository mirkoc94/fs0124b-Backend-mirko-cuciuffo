package it.epicode.esercizio1.entities;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString(callSuper = true)
public class Topping extends Item{

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }
}
