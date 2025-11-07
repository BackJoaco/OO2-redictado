package com.pattern;

public interface Builder {
    public void reset();
    public void ponerProcesador();
    public void ponerRam();
    public void ponerDisco();
    public void ponerGrafica();
    public void ponerGabinete();
    public Equipo getEquipo();
}
