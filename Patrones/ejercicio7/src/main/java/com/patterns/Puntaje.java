package com.patterns;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Puntaje implements Criterio{
    public Pelicula[] sugerirPeliculas(Set<Pelicula> grilla, Set<Pelicula> vistas){
        List<Pelicula> elementos = grilla.stream()
            .filter(p -> !vistas.contains(p))
            .sorted((p1, p2) -> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
            .collect(Collectors.toList());
        return (Pelicula[]) elementos.toArray();
    }
}
