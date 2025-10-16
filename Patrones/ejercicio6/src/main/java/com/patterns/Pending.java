package com.patterns;

public class Pending extends Estado{
    public Pending(ToDoItem c){
        super(c);
    }
    public void start(){
        this.getContexto().setEstado(new InProgress(this.getContexto()));
    }
    public void togglePause(){
        throw new RuntimeException("El ToDoItem no se encuentra en pause o in-progress");
    }
    public void finish(){
        throw new RuntimeException("El ToDoItem no se encuentra en pause o in-progress");
    }
    public int workedTime(){
        throw new RuntimeException("El ToDoItem aun no ha iniciado");
    }
    public void addComment(String comment){
        this.getContexto().setComment(comment);
    }
}
