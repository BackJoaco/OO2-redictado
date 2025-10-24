package com.patterns.Decorator;

import com.patterns.FileOO2;

public class Nombre extends BaseDecorator{
    public Nombre(FileOO2 f){
        super(f);
    }

    public String prettyPrint(){
        return envuelto.prettyPrint() + " - " + envuelto.getNombre();
    }
}
