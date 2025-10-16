package com.patterns;

public class Papel implements Jugada{
    public String jugarContra(Jugada otra){
        return otra.jugarContraPapel(this);
    }
    public String jugarContraPiedra(Piedra piedra){
        return "Perdiste";
    }
    public String jugarContraPapel(Papel papel) {
        return "Empate";
    }
    public String jugarContraTijera(Tijera tijera){
        return "Ganaste";
    }
}
