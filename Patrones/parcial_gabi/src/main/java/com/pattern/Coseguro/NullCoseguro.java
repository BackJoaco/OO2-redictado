package com.pattern.Coseguro;

import java.time.LocalDate;

public class NullCoseguro extends AbsCoseguro{
    private String nombre;
    private LocalDate ingreso;
    private int descuento;
    private double montoCoberturaViajes;
    
    public NullCoseguro() {
        super("", null, 1, 0);
    }
    public int getDescuento() {
        return 1;
    }
    public double getMontoCoberturaViajes() {
        return 0;
    }
    public boolean tiene(){
        return false;
    }
    public int getAntiguedad(){
        return 0;
    }
}
