package com.worldremit.checkout.api;


import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class BootStrap {

    private static final String jsonContentType = "application/json";

    public static void main(String[] args){
        new BootStrap().init();
    }

    public void init(){

        get("/status", (req, res) -> {

            res.type(jsonContentType);

            return new Status();

        }, new JsonTransformer());


        get("/", (req, res) -> {
            res.type(jsonContentType);

            return new Start();

        }, new JsonTransformer());

        get("/basket",(req, res) -> {
            res.type(jsonContentType);

            return new Basket();

        } , new JsonTransformer());

        post("/checkout", (req, res) -> {

            res.type(jsonContentType);

            Map<Character, Integer> prices = new HashMap<Character, Integer>();
            prices.put('A', 50);
            prices.put('B', 30);

            Integer total = 0;
            for(Character item : req.body().toCharArray())
               total += prices.get(item);

            return total;

        }, new JsonTransformer());

    }
}
