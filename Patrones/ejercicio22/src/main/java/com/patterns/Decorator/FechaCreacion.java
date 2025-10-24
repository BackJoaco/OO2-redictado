package com.patterns.Decorator;
import com.patterns.FileOO2;

public class FechaCreacion extends BaseDecorator{
    public FechaCreacion(FileOO2 f){
        super(f);
    }
    public String prettyPrint(){
        return envuelto.prettyPrint() + " - " + envuelto.getFechaCreacion();
    }
}
