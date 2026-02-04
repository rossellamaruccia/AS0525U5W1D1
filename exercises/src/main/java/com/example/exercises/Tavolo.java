package com.example.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tavolo {
    private int numTavolo;
    private int numMaxCoperti;
    private boolean isFree;
    private double costoCoperto;

    public void print() {
        System.out.println("numero tavolo--> " + numTavolo);
        System.out.println("numero massimo coperti--> " + numMaxCoperti);
        System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
    }

}
