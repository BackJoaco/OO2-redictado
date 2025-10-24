package com.patterns.Decorator;

import com.patterns.FileOO2;

public abstract class BaseDecorator implements FileOO2{
    protected FileOO2 envuelto;

    public BaseDecorator(FileOO2 e){
        this.envuelto = e;
    }

    public String getNombre() {
        return envuelto.getNombre();
    }
    public String getExtension() {
        return envuelto.getExtension();
    }
    public double getTamaño() {
        return envuelto.getTamaño();
    }
    public String getFechaCreacion() {
        return envuelto.getFechaCreacion();
    }
    public String getFechaModificacion() {
        return envuelto.getFechaModificacion();
    }
    public String getPermisos() {
        return envuelto.getPermisos();
    }
    public void agregarPermisos(String permiso){
        envuelto.agregarPermisos(permiso);
    }
    public abstract String prettyPrint();
}
