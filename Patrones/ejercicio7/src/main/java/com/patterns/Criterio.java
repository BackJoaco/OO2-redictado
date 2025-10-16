package com.patterns;

import java.util.Set;

public interface Criterio {
    public Pelicula[] sugerirPeliculas(Set<Pelicula> grilla, Set<Pelicula> vistas);
}
