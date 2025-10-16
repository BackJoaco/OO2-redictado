package com.patterns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Similitud implements Criterio{
    public Pelicula[] sugerirPeliculas(Set<Pelicula> grilla, HashSet<Pelicula> vistas){
        List<Set<Pelicula>> elementos = new ArrayList<>();
        elementos = vistas.stream()
            .forEach(p -> p.getSimilares())
            .collect(Collectors.toList());
        return null;
    }
}
