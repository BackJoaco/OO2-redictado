package com.patterns;

public abstract class Estado {
    protected Excursion excursion;

    public Estado(Excursion excursion) {
        this.excursion = excursion;
    }

    public Excursion getExcursion() {
        return excursion;
    }
    
    public abstract void inscribir(Usuario u);

    public abstract String obtenerInformacion();
}
