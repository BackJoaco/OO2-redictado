package com.patterns;

public class Finished extends Estado{
    public Finished(ToDoItem c){
        super(c);
    }
    public void start(){
        throw new RuntimeException("El ToDoItem se encuentra finalizado");
    }
    public void togglePause(){
        throw new RuntimeException("El ToDoItem se encuentra finalizado");
    }
    public void finish(){
        throw new RuntimeException("El ToDoItem ya se encuentra finalizado");
    }
    public int workedTime(){
        return this.getContexto().getDuracion();
    }
    public void addComment(String comment){
        throw new RuntimeException("El ToDoItem ya se encuentra finalizado");
    }
}
