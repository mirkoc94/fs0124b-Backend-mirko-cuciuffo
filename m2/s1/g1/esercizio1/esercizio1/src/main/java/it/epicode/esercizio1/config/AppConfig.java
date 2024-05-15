package it.epicode.esercizio1.config;

import it.epicode.esercizio1.entities.Drink;
import it.epicode.esercizio1.entities.Menu;
import it.epicode.esercizio1.entities.Pizza;
import it.epicode.esercizio1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    //Toppings
    @Bean (name = "topping_tomato")
    public Topping toppingTomatoBean() {
        return new Topping("Tomato",0,0);
    }

    @Bean (name = "topping_cheese")
    public Topping toppingCheeseBean() {
        return new Topping("Cheese",92,0.69);
    }

    @Bean (name = "topping_ham")
    public Topping toppingHamBean() {
        return new Topping("Ham",35,0.99);
    }

    @Bean (name = "topping_onions")
    public Topping toppingOnionsBean() {
        return new Topping("Onions",22,0.69);
    }

    @Bean (name = "topping_pineapple")
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple",24,0.79);
    }

    @Bean (name = "topping_salami")
    public Topping toppingSalamiBean() {
        return new Topping("Salami",86,0.99);
    }

    //Drinks
    @Bean (name = "drink_lemonade")
    public Drink drinkLemonadeBean() {
        return new Drink("Lemonade",128,1.29);
    }

    @Bean (name = "drink_water")
    public Drink drinkWaterBean() {
        return new Drink("Water",0,1.29);
    }

    @Bean (name = "drink_wine")
    public Drink drinkWineBean() {
        return new Drink("Wine",607,7.49);
    }

    //Pizzas
    @Bean (name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizza("Margherita", tList,1104,4.99);
    }

    @Bean (name = "pizza_hawaiian")
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizza("Hawaiian", tList,1024,6.49);
    }

    @Bean (name = "pizza_salami")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami", tList,1160,5.99);
    }

    //Menu
    @Bean (name = "menu")
    public Menu menuBean() {
        List<Pizza> pList = new ArrayList<>();
        List<Topping> tList = new ArrayList<>();
        List<Drink> dList = new ArrayList<>();

        pList.add(pizzaMargheritaBean());
        pList.add(pizzaHawaiianBean());
        pList.add(pizzaSalamiBean());

        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingOnionsBean());
        tList.add(toppingPineappleBean());
        tList.add(toppingSalamiBean());

        dList.add(drinkLemonadeBean());
        dList.add(drinkWaterBean());
        dList.add(drinkWineBean());

        return new Menu(pList, tList, dList);
    }
}
