package com.patterns;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;

public class Pelicula {
    private String titulo;
    private int anoEstreno;
    private double puntaje;
    private Set<Pelicula> similares;
    private String genero;

    public Pelicula(String titulo, int anoEstreno, double puntaje, String genero) {
        this.titulo = titulo;
        this.anoEstreno = anoEstreno;
        this.puntaje = puntaje;
        this.genero = genero;
        similares = new HashSet<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnoEstreno() {
        return anoEstreno;
    }
    public double getPuntaje() {
        return puntaje;
    }
    public String getGenero(){
        return genero;
    }
    public Set<Pelicula> getSimilares(){
        return similares;
    }
    public void agregarSimilar(Pelicula p){
        similares.add(p);
    }
    public void asignarSimilitudes(Set<Pelicula> grilla){
        similares.addAll(grilla.stream()
            .filter(p -> p.getGenero() == this.getGenero())
            .collect(Collectors.toList()));
        similares.forEach(s -> s.agregarSimilar(this));
    }
    
}
