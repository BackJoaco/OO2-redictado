package com.patterns;

public interface FileOO2 {
    public String prettyPrint();
    public String getNombre();
    public String getExtension();
    public double getTamaño();
    public String getFechaCreacion();
    public String getFechaModificacion();
    public String getPermisos();
    public void agregarPermisos(String permiso);
}
