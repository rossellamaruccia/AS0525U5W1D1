package com.example.exercises;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Ordine {
    private long numeroOrdine;
    private StatoOrdine statoOrdine;
    private long numeroCoperti;
    private LocalDateTime tempoOrdine;
    private List<MenuElement> comanda;
    private Tavolo tavolo;

    public Ordine(long numeroCoperti, Tavolo tavolo) {
        Random rndm = new Random();
        this.numeroOrdine = rndm.nextInt(1000, 10000);
        this.statoOrdine = StatoOrdine.pending;
        if (tavolo.getNumMaxCoperti() <= numeroCoperti)
            throw new RuntimeException("Numero coperti massimo superato");
        this.numeroCoperti = numeroCoperti;
        this.tempoOrdine = LocalDateTime.now();
        this.comanda = new ArrayList<>();
        this.tavolo = tavolo;
    }

    public void modificaComanda(MenuElement e) {
        this.comanda.add(e);
    }

    public double totaleComanda() {
        return this.comanda.stream().mapToDouble(MenuElement::getPrice).sum();
    }

    public void print() {
        System.out.println("id ordine--> " + this.numeroOrdine);
        System.out.println("stato--> " + this.statoOrdine);
        System.out.println("numero coperti--> " + this.numeroCoperti);
        System.out.println("ora acquisizione--> " + this.tempoOrdine);
        System.out.println("numero tavolo--> " + this.tavolo.getNumTavolo());
        System.out.println("Lista: ");
        this.comanda.forEach(System.out::println);
        System.out.println("totale--> " + this.totaleComanda());

    }

}
