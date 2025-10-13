package com.patterns;

import java.util.LinkedList;
import java.util.List;

public class Twitter {
    private List<Usuario> usuarios;

    public Twitter(){
        this.usuarios = new LinkedList<>();
    }

    private boolean existeUsuario(String screenName){
        return this.usuarios.stream()
                            .anyMatch(u -> u.getScreenName() == screenName);
    }

    public boolean crearUsuario(String screenName){
        if (this.existeUsuario(screenName)){
            return false;
        }
        usuarios.add(new Usuario(screenName));
        return true;
    }

    public boolean eliminarUsuario(String screenName){
        Usuario u = this.usuarios.stream()
                                .filter(user -> user.getScreenName().contains(screenName))
                                .findFirst().orElse(null);
        if (u == null) {
            return false;
        }
        u.eliminarTweets();
        this.usuarios.remove(u);
        return true;
    }
}
