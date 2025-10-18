package com.patterns;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private List<Usuario> inscriptos;
    private List<Usuario> listaEspera;
    private Estado estado;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
            int cupoMinimo, int cupoMaximo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.estado = new Provisoria(this);
        this.inscriptos = new ArrayList<>();
        this.listaEspera = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public double getCosto() {
        return costo;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public List<Usuario> getInscriptos() {
        return inscriptos;
    }

    public List<Usuario> getListaEspera() {
        return listaEspera;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public void agregarInscripto(Usuario u){
        this.inscriptos.add(u);
    }

    public void agregarListaEspera(Usuario u){
        this.listaEspera.add(u);
    }

    public void inscribir(Usuario u){
        estado.inscribir(u);
    }

    public String obtenerInformacion(){
        return "Nombre: " + this.getNombre() 
        + "; Costo: " + this.getCosto() 
        + "; Fechas: " + this.getFechaInicio().toString() + " - " + this.getFechaFin().toString() 
        + "; Punto de encuentro: " + this.getPuntoEncuentro() +"\n"
        + estado.obtenerInformacion();
    }
}
