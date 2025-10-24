package com.patterns.Decorator;

import com.patterns.FileOO2;

public class Tamano extends BaseDecorator{
    public Tamano(FileOO2 f){
        super(f);
    }

    public String prettyPrint(){
        return envuelto.prettyPrint() + " - " + envuelto.getTamaño();
    }
}
