package it.epicode.esercizio2.entitiesMenu;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Item {
    private String name;
    private int calories;
    private double price;
}
