package com.example.exercises;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends MenuElement {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink {" + name + ", " + calories + ", " + price + "}";
    }
}