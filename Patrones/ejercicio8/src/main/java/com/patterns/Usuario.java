package com.patterns;

public class Usuario {
    private String email;
    private String nombre; 
    private String apellido;
    public Usuario(String email, String nombre, String apellido) {
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    
}
