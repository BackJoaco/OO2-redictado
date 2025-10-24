package com.patterns.Decorator;
import com.patterns.FileOO2;
public class Extension extends BaseDecorator{
    public Extension(FileOO2 f){
        super(f);
    }
    public String prettyPrint(){
        return envuelto.prettyPrint() + " - " +envuelto.getExtension();
    }
}
