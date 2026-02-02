package com.example.exercises;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
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
            System.out.printf("%s - €%.2f\n", pizza.getName(), pizza.getPrice());
            System.out.println("  Ingredienti: " + pizza.getNutritionalInfo());
        }

        System.out.println("\nTOPPINGS:");
        for (Topping topping : toppings) {
            System.out.printf("%s - €%.2f\n", topping.getName(), topping.getPrice());
            System.out.println("  Info nutrizionali: " + topping.getNutritionalInfo());
        }
        System.out.println("\nBEVANDE:");
        for (Drink drink : drinks) {
            System.out.printf("%s - €%.2f\n", drink.getName(), drink.getPrice());
            System.out.println("  Info nutrizionali: " + drink.getNutritionalInfo());
        }
    }
}