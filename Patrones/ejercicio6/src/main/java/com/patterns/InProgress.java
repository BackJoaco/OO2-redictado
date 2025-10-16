package com.patterns;

public class InProgress extends Estado{
    public InProgress(ToDoItem c){
        super(c);
    }

    public void start(){
        throw new RuntimeException("El ToDoItem ya se encuentra en progreso");
    }
    public void togglePause(){
        this.getContexto().setEstado(new Paused(this.getContexto()));
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
