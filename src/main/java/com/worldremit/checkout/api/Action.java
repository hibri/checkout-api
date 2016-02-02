package com.worldremit.checkout.api;

/**
 * Created by hmarzook on 01/02/2016.
 */
public class Action {

    public  String link;
    public  String method;
    private final String rel;

    public Action(String link, String method, String rel){


        this.link = link;
        this.method = method;
        this.rel = rel;
    }
}
