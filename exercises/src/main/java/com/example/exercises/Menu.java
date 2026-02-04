package com.example.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Menu {
    private List<Pizza> pizze;
    private List<Drink> drinks;
    private List<Topping> toppings;

    public void printMenu() {
        System.out.println("---- MENU PIZZERIA ----");
        System.out.println("PIZZE:");
        for (Pizza pizza : pizze) {
            System.out.println(pizza.getName() + ", " + pizza.getPrice() + "€");
            System.out.println("  Ingredienti: " + pizza.getToppings());
        }

        System.out.println("TOPPINGS:");
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + ", " + topping.getPrice() + "€");
            System.out.println("  Info nutrizionali: " + topping.getCalories() + " calorie.");
        }
        System.out.println("BEVANDE:");
        for (Drink drink : drinks) {
            System.out.printf(drink.getName() + ", " + drink.getPrice() + "€");
            System.out.println("  Info nutrizionali: " + drink.getCalories() + " calorie");
        }
    }
}