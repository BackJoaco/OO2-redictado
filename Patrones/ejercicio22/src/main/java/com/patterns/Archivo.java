package com.patterns;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo implements FileOO2{
    private String nombre;
    private String extension;
    private double tamaño;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private List<String> permisos;
    public Archivo(String nombre, String extension, double tamaño) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamaño = tamaño;
        this.fechaCreacion = LocalDate.now();
        this.fechaModificacion = LocalDate.now();
        this.permisos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public String getExtension() {
        return extension;
    }
    public double getTamaño() {
        return tamaño;
    }
    public String getFechaCreacion() {
        return fechaCreacion.toString();
    }
    public String getFechaModificacion() {
        return fechaModificacion.toString();
    }
    public String getPermisos() {
        return permisos.toString();
    }
    public void agregarPermisos(String permiso){
        if (!this.permisos.contains(permiso)){
            this.permisos.add(permiso);
        }
    }
    public String prettyPrint(){
        return "";
    }
}
