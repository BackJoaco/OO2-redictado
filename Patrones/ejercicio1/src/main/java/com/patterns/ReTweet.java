package com.patterns;

public class ReTweet extends AbstractTweet{
    private Tweet origen;

    public ReTweet(Usuario usuario, Tweet origen){
        super(usuario);
        this.origen = origen;
    }

    public Tweet getOrigen(){
        return this.origen;
    }
}
