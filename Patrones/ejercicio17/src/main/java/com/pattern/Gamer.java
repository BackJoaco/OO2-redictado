package com.pattern;

public class Gamer implements Builder{
    private Equipo equipo;

    public void reset(){
        this.equipo = new Equipo();
    }
    public void ponerProcesador(){
        this.equipo.setProcesador("gamer");
    }
    public void ponerRam(){
        this.equipo.setRam("32 GB + 32 GB");
    }
    public void ponerDisco(){
        this.equipo.setDisco("M2 500 GB");
    }
    public void ponerGrafica(){
        this.equipo.setDisco("RTX 4090ti");
    }
    public void ponerGabinete(){
        this.equipo.setGabinete("gamer");
    }
    public Equipo getEquipo() {
        return equipo;
    }
}
