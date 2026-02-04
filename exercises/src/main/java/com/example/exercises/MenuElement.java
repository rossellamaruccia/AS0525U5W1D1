package com.example.exercises;

import lombok.Getter;

@Getter
public abstract class MenuElement {
    protected int calories;
    protected double price;

    public MenuElement(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
