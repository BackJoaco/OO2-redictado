package com.pattern;

public class Tecnico {
    private Builder builder;

    public Tecnico(Builder builder) {
        this.builder = builder;
    }

    public void armarPC(){
        builder.reset();
        builder.ponerProcesador();
        builder.ponerRam();
        builder.ponerDisco();
        builder.ponerGabinete();
        builder.ponerGrafica();
    }

    public Equipo getEquipo(){
        return builder.getEquipo();
    }

    public void cambiarModelo(Builder builder){
        this.builder = builder;
    }
}
