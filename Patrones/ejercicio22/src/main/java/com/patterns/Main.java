package com.patterns;

import com.patterns.Decorator.Extension;
import com.patterns.Decorator.FechaCreacion;
import com.patterns.Decorator.Nombre;

public class Main {
    public static void main(String[] args) {
        FileOO2 archivo;
        archivo = new Archivo("Gabi", "pdf", 5);
        archivo = new Nombre(archivo);
        archivo = new Extension(archivo);
        archivo = new FechaCreacion(archivo);
        System.out.println(archivo.prettyPrint());
    }
}