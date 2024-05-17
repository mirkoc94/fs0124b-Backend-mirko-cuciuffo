package it.epicode.esercizio2.entitiesMenu;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString(callSuper = true)
public class Topping extends Item{

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }
}
