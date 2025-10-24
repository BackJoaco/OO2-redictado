package com.pattern.Coseguro;

import java.time.LocalDate;

public class Coseguro extends AbsCoseguro{

    public Coseguro(String nombre, LocalDate ingreso, int descuento, double montoCoberturaViajes) {
        super(nombre, ingreso, descuento, montoCoberturaViajes);
    }
}
