package com.example.exercises;

import lombok.Generated;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class Ordine {
    @Generated
    private long numeroOrdine;
    private StatoOrdine statoOrdine;
    private long numeroCoperti;
    private LocalDate tempoOrdine;
    private List<MenuElement> comanda;

    public Ordine(long numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
        this.tempoOrdine = LocalDate.now();
    }

    public void setComanda(List<MenuElement> comanda) {
        this.comanda = comanda;
    }
}
