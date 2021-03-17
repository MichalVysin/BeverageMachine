package com.company;

public class Tea implements Preparable{

    @Override
    public String getName(){
        return "Tea";
    }

    @Override
    public String getIngredients(){
        return "syrup and hot water";
    }
}
