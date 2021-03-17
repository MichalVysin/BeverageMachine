package com.company;

public class Coffee implements Preparable{

    @Override
    public String getName(){
        return "Coffee";
    }

    @Override
    public String getIngredients(){
        return "coffee powder and hot water";
    }
}
