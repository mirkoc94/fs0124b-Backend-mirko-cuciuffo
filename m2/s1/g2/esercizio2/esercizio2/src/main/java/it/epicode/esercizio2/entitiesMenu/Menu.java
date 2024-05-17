package it.epicode.esercizio2.entitiesMenu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Menu {
    List<Pizza> pizzaList;
    List<Topping> toppingList;
    List<Drink> drinkList;

    public void printMenu() {
        System.out.println("***** MENU *****");
        System.out.println("***** Pizzas *****");
        this.pizzaList.forEach(System.out::println);
        System.out.println("***** Toppings *****");
        this.toppingList.forEach(System.out::println);
        System.out.println("***** Drinks *****");
        this.drinkList.forEach(System.out::println);
    }
}
