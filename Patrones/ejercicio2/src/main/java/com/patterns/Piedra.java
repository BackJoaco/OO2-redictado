package com.patterns;

public class Piedra implements Jugada{
    public String jugarContra(Jugada otra){
        return otra.jugarContraPiedra(this);
    }
    public String jugarContraPiedra(Piedra piedra){
        return "Empate";
    }
    public String jugarContraPapel(Papel papel){
        return "Ganaste";
    } 
    public String jugarContraTijera(Tijera tijera) {
        return "Perdiste";
    }
}
