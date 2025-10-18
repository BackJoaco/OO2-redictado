package com.patterns;

public class TopografiaMixta implements InterTopo{
    private InterTopo[] topografia = new InterTopo[4];

    public TopografiaMixta(InterTopo t1, InterTopo t2, InterTopo t3, InterTopo t4){
        topografia[0] = t1;
        topografia[1] = t2;
        topografia[2] = t3;
        topografia[3] = t4;
    }

    public double calcularProporcion(){
        return (topografia[0].calcularProporcion() + topografia[1].calcularProporcion() + topografia[2].calcularProporcion() + topografia[3].calcularProporcion()) / 4 ;
    }
}
