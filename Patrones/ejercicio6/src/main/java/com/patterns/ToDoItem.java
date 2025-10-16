package com.patterns;
public class ToDoItem {
    private String nombre;
    private int duracion;
    private Estado estado;
    public String comentario;

    public ToDoItem(String name){
        this.nombre = name;
        this.setEstado(new Pending(this));
        this.duracion = 1;
    }

    public void setEstado(Estado estado){
        this.duracion++;
        this.estado = estado;
    }

    public void start(){
        this.estado.start();
    }
    public void togglePause(){
        this.estado.togglePause();
    }
    public void finish(){
        this.estado.finish();
    }
    public int workedTime(){
        return this.estado.workedTime();
    }
    public void addComment(String comment){
        this.estado.addComment(comment);
    }

    public void setComment(String c){
        this.comentario = c;
    }

    public int getDuracion(){
        return duracion;
    }

    public String getNombre(){
        return nombre;
    }
}
