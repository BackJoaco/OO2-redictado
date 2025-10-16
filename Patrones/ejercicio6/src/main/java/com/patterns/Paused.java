package com.patterns;

public class Paused extends Estado{
    public Paused(ToDoItem c){
        super(c);
    }
    public void start(){
        throw new RuntimeException("El ToDoItem ya se encuentra inicializado para reanudarlo usar togglePause");
    }
    public void togglePause(){
        this.getContexto().setEstado(new InProgress(getContexto()));
    }
    public void finish(){
        this.getContexto().setEstado(new Finished(this.getContexto()));
    }
    public int workedTime(){
        return this.getContexto().getDuracion();
    }
    public void addComment(String comment){
        this.getContexto().setComment(comment);
    }
}
