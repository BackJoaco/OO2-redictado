package com.patterns;

import java.util.Set;
import java.util.HashSet;

public class Decodificador {
    private Criterio criterio;
    private Set<Pelicula> grilla;
    private Set<Pelicula> vistas;
    public Decodificador(){
        criterio = new Novedad();
        grilla = new HashSet<>();
        vistas = new HashSet<>();
    }

    public Criterio getCriterio() {
        return criterio;
    }


    public Set<Pelicula> getGrilla() {
        return grilla;
    }


    public Set<Pelicula> getVistas() {
        return vistas;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }
    public void agregarPelicula(Pelicula p){
        p.asignarSimilitudes(grilla);
        grilla.add(p);
    }
    public void verPelicula(Pelicula p){
        vistas.add(p);
    }

    public Pelicula[] sugerirPeliculas(){
        return criterio.sugerirPeliculas(grilla, vistas);
    } 
}
