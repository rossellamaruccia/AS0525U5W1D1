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

    public void printMenu() {
        System.out.println("---- MENU PIZZERIA ----");
        System.out.println("PIZZE:");
        for (Pizza pizza : pizze) {
            System.out.printf("%s - €%.2f\n", pizza.getName(), pizza.getPrice());
            System.out.println("  Ingredienti: " + pizza.getNutritionalInfo());
        }
        System.out.println("\nBEVANDE:");
        for (Drink drink : drinks) {
            System.out.printf("%s - €%.2f\n", drink.getName(), drink.getPrice());
            System.out.println("  Info nutrizionali: " + drink.getNutritionalInfo());
        }
    }
}