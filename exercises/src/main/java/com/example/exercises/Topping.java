package com.example.exercises;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends MenuElement {
    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping {" + name + ", " + calories + ", " + price + "}";
    }
}
