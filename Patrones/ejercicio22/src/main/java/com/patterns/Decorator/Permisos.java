package com.patterns.Decorator;

import com.patterns.FileOO2;

public class Permisos extends BaseDecorator{
    public Permisos(FileOO2 f){
        super(f);
    }

    public String prettyPrint(){
        return envuelto.prettyPrint() + " - " + envuelto.getPermisos();
    }
}
