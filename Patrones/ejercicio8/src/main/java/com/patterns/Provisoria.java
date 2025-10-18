package com.patterns;

public class Provisoria extends Estado{

    public Provisoria(Excursion e){
        super(e);
    }
    public String obtenerInformacion(){
        return "Cantidad de usuarios faltantes para llegar al cupo minimo: " + (excursion.getCupoMinimo() - excursion.getInscriptos().size());
    }
    public void inscribir(Usuario u){
        excursion.agregarInscripto(u);
        if (excursion.getInscriptos().size() == excursion.getCupoMinimo()){
            excursion.setEstado(new Definitiva(excursion));
        }
    }
}
