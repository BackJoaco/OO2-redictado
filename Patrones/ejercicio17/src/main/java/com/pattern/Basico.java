package com.pattern;

public class Basico implements Builder{
    private Equipo equipo;

    public void reset(){
        this.equipo = new Equipo();
    }
    public void ponerProcesador(){
        this.equipo.setProcesador("basico");
    }
    public void ponerRam(){
        this.equipo.setRam("8 GB");
    }
    public void ponerDisco(){
        this.equipo.setDisco("HDD 500 GB");
    }
    public void ponerGrafica(){
        this.equipo.setDisco("integrada");
    }
    public void ponerGabinete(){
        this.equipo.setGabinete("estandar fuente incluida");
    }
    public Equipo getEquipo() {
        return equipo;
    }

    
}
