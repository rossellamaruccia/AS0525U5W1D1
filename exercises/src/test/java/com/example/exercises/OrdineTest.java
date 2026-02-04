package com.example.exercises;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class OrdineTest {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(As0525U5Wd1Application.class);

    @Test
    void testCostruttoreValido() {
        Tavolo tavolo = new Tavolo(5, 1, true, 1.5);
        Ordine ordine = new Ordine(3, tavolo);
        assertEquals(ordine.getStatoOrdine(), StatoOrdine.pending);
        assertEquals(ordine.getNumeroCoperti(), 3);
        assertNotNull(ordine.getTempoOrdine());
        assertTrue(ordine.getComanda().isEmpty());
        assertEquals(tavolo, ordine.getTavolo());
    }

    @Test
    void testCostruttoreNumeroCopertiSuperiore() {
        Tavolo tavolo = new Tavolo(5, 1, true, 1.5);
        assertThrows(RuntimeException.class, () -> new Ordine(6, tavolo));
    }

    @Test
    void testTotaleComandaSommaPrezzi() {
        Ordine ordine = new Ordine(2, new Tavolo(5, 1, true, 1.5));
        List<Topping> toppings = new ArrayList<>();
        toppings.add(ctx.getBean("peperoni", Topping.class));
        toppings.add(ctx.getBean("funghi", Topping.class));
        toppings.add(ctx.getBean("pomodoro", Topping.class));
        ordine.modificaComanda(new Pizza("Vegana", toppings));
        assertEquals(ordine.totaleComanda(), 10.5);
    }
}