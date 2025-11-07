package com.pattern;

public class Intermedio implements Builder{
    private Equipo equipo;

    public void reset(){
        this.equipo = new Equipo();
    }
    public void ponerProcesador(){
        this.equipo.setProcesador("intermedio");
    }
    public void ponerRam(){
        this.equipo.setRam("16 GB");
    }
    public void ponerDisco(){
        this.equipo.setDisco("SDD 500 GB");
    }
    public void ponerGrafica(){
        this.equipo.setDisco("GTX 1650");
    }
    public void ponerGabinete(){
        this.equipo.setGabinete("intermedio fuente 800 w");
    }
    public Equipo getEquipo() {
        return equipo;
    }
}