package com.patterns;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Novedad implements Criterio{
    public Pelicula[] sugerirPeliculas(Set<Pelicula> grilla, Set<Pelicula> vistas){
        List<Pelicula> elementos = grilla.stream()
            .filter(p -> !vistas.contains(p))
            .sorted((p1, p2) -> Integer.compare(p2.getAnoEstreno(), p1.getAnoEstreno()))
            .limit(3)
            .collect(Collectors.toList());
        return (Pelicula[]) elementos.toArray();
    }
}
