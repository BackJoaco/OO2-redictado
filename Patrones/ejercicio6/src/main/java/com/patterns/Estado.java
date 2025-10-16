package com.patterns;

public abstract class Estado {
    private ToDoItem contexto;
    public Estado(ToDoItem c){
        this.contexto = c;
    }
    protected ToDoItem getContexto(){
        return contexto;
    }
    public abstract void start();
    public abstract void togglePause();
    public abstract void finish();
    public abstract int workedTime();
    public abstract void addComment(String comment);
}
