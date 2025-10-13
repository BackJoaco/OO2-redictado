package com.patterns;

public abstract class AbstractTweet {
    private Usuario usuario;

    public AbstractTweet(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }
}
