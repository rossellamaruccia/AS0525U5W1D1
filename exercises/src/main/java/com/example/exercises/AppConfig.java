package com.example.exercises;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Configuration
@PropertySource("application.properties")
class AppConfig {

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 1.5, "Proteine");
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 1.0, "Vitamine");
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi", 1.2, "Fibre");
    }

    @Bean
    public Topping peperoni() {
        return new Topping("Peperoni", 1.2, "Colore");
    }

    @Bean
    public Pizza margherita() {
        return new Pizza(); // solo base
    }

    @Bean
    public Pizza hawaiianPizza(Topping prosciutto, Topping ananas) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(prosciutto);
        toppings.add(ananas);
        return new Pizza(toppings, "Pizza Hawaii");
    }

    @Bean
    public Pizza doppioProsciutto(Topping prosciutto) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(prosciutto);
        toppings.add(prosciutto);
        return new Pizza(toppings, "Margherita + Doppio Prosciutto");
    }

    @Bean
    public Pizza Ajeje(Topping peperoni) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(peperoni);
        toppings.add(peperoni);
        return new Pizza(toppings, "Peperonata e topi morti");
    }

    @Bean
    @Primary
    public Tavolo tavoloStandard() {
        return new Tavolo();
    }

    @Bean
    @Primary
    public Ordine ordineStandard() {
        return new Ordine(4);
    }

    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 2.0, "Zuccheri");
    }

    @Bean
    public Drink Fanta() {
        return new Drink("Fanta", 2.0, "anni Novanta");
    }

    @Bean
    public Drink acqua() {
        return new Drink("Acqua Naturale", 1.0, "Nessuna Caloria");
    }

    @Bean
    public Drink Birra() {
        return new Drink("Birra", 3.0, "causa e soluzione di tutti i problemi");
    }

    @Bean
    public Menu menu(Pizza margherita, Pizza hawaiianPizza, Pizza doppioProsciutto, Pizza Ajeje, Topping prosciutto, Topping ananas, Topping funghi, Topping peperoni, Drink cocaCola, Drink Fanta, Drink acqua, Drink Birra) {
        return new Menu(
                Arrays.asList(margherita, hawaiianPizza, doppioProsciutto, Ajeje),
                Arrays.asList(cocaCola, Fanta, acqua, Birra),
                Arrays.asList(prosciutto, ananas, funghi, peperoni)
        );
    }
}
