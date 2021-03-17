package com.company;

public class ChineseSoup implements Preparable{

    @Override
    public String getName(){
        return "Chinese soup";
    }

    @Override
    public String getIngredients(){
        return "soup powder, chinese noodles and hot water";
    }
}
