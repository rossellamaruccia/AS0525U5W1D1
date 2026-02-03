package com.example.exercises;

import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tavolo {
    @Generated
    private long id;
    private long max_coperti;
    @Autowired
    private Ordine ordine;
    private Stato stato;

    public Tavolo() {
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }
}
