package com.patterns;

public class Tweet extends AbstractTweet{
    @SuppressWarnings("unused")
    private String texto;

    public Tweet(Usuario usuario, String texto){
        super(usuario);
        this.texto = texto;
    }
}
