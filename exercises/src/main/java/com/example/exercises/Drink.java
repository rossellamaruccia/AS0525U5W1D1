package com.example.exercises;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Drink implements MenuItem {
    private String name;
    private double price;
    private String nutritionalInfo;
}
