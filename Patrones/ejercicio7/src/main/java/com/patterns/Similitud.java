package com.patterns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Similitud implements Criterio{
    public Pelicula[] sugerirPeliculas(Set<Pelicula> grilla, Set<Pelicula> vistas){
        List<Set<Pelicula>> elems = vistas.stream()
            .map(p -> p.getSimilares())
            .flatMap();
        return null;
    }
}
