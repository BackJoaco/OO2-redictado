package com.patterns;

import java.util.stream.Collectors;

public class Definitiva extends Estado{
    public Definitiva(Excursion e){
        super(e);
    }
    public String obtenerInformacion(){
        return excursion.getInscriptos().stream()
            .map(u -> u.getEmail())
            .collect(Collectors.joining("\n"));
    }
    public void inscribir(Usuario u){
        excursion.agregarInscripto(u);
        if (excursion.getInscriptos().size() == excursion.getCupoMaximo()){
            excursion.setEstado(new Negocion(excursion));
        }
    }
}
