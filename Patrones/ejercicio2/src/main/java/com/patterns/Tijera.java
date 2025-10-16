package com.patterns;

public class Tijera implements Jugada{
    public String jugarContra(Jugada otra){
        return otra.jugarContraTijera(this);
    }
    public String jugarContraPiedra(Piedra piedra){
        return "Ganaste";
    }
    public String jugarContraPapel(Papel papel){
        return "Perdiste";
    }
    public String jugarContraTijera(Tijera tijera){
        return "Empate";
    }
}
