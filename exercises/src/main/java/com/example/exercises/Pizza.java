package com.example.exercises;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class Pizza extends MenuElement implements MenuItem {
    private String baseName = "Margherita";
    private double basePrice = 5.0;
    private String baseNutritionalInfo = "Pomodoro, Mozzarella";

    private List<Topping> toppings = new ArrayList<>();
    private String customName;

    public Pizza() {
    }

    public Pizza(List<Topping> toppings, String customName) {
        this.toppings = toppings;
        this.customName = customName;
    }

    @Override
    public String getName() {
        if (customName != null && !customName.isEmpty()) {
            return customName;
        }
        return baseName + (toppings.isEmpty() ? "" : " + toppings");
    }

    @Override
    public double getPrice() {
        double toppingsPrice = toppings.stream().mapToDouble(Topping::getPrice).sum();
        return basePrice + toppingsPrice;
    }

    @Override
    public String getNutritionalInfo() {
        StringBuilder sb = new StringBuilder(baseNutritionalInfo);
        for (Topping topping : toppings) {
            sb.append(", ").append(topping.getNutritionalInfo());
        }
        return sb.toString();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
}