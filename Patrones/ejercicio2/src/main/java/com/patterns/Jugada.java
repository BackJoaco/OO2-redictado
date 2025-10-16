package com.patterns;

public interface Jugada {
    public String jugarContra(Jugada otra);
    public String jugarContraPiedra(Piedra piedra);
    public String jugarContraPapel(Papel papel);
    public String jugarContraTijera(Tijera tijera);
}
