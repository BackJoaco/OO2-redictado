package com.patterns;

public class Topografia implements InterTopo{
    private int valor;

    public Topografia(int valor){
        this.valor = valor;
    }

    public double calcularProporcion(){
        return this.valor;
    }
}
