package com.pattern.Coseguro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class AbsCoseguro {
    private String nombre;
    private LocalDate ingreso;
    private int descuento;
    private double montoCoberturaViajes;
    
    public AbsCoseguro(String nombre, LocalDate ingreso, int descuento, double montoCoberturaViajes) {
        this.nombre = nombre;
        this.ingreso = ingreso;
        this.descuento = descuento;
        this.montoCoberturaViajes = montoCoberturaViajes;
    }
    public int getDescuento() {
        return descuento;
    }
    public double getMontoCoberturaViajes() {
        return montoCoberturaViajes;
    }
    public boolean tiene(){
        return true;
    }
    public int getAntiguedad(){
        return (int) ChronoUnit.YEARS.between(ingreso, LocalDate.now());
    }
}
