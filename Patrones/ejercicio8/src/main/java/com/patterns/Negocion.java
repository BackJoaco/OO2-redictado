package com.patterns;

public class Negocion extends Estado{
    public Negocion(Excursion e){
        super(e);
    }
    public String obtenerInformacion(){
        return "";
    }
    public void inscribir(Usuario u){
        excursion.agregarListaEspera(u);
    }
}
