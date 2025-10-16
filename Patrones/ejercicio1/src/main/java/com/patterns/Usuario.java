package com.patterns;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String screenName;
    private List<AbstractTweet> tweets;

    public Usuario(String screenName){
        this.tweets = new LinkedList<>();
        this.screenName = screenName;
    }

    public String getScreenName(){
        return this.screenName;
    }

    public List<AbstractTweet> getTweets(){
        return this.tweets;
    }

    public void eliminarTweets(){
        this.tweets.clear();
    }

    public boolean tweetear(String texto){
        if (!((texto.length() > 0) && (texto.length() < 281))){
            return false;
        }
        this.tweets.add(new Tweet(this,texto));
        return true;
    }

    public void reTweetear(Tweet tweet){
        this.tweets.add(new ReTweet(this, tweet)); 
    }
}
