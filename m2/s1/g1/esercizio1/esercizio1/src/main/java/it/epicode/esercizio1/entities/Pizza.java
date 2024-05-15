package it.epicode.esercizio1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@NoArgsConstructor
@ToString
public class Pizza extends Item{
    private List<Topping> toppingList;

    public Pizza(String name, List<Topping> toppingList, int calories, double price) {
        super(name, calories, price);
        this.toppingList = toppingList;
    }

}
