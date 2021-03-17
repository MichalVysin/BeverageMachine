package com.company;

import java.util.ArrayList;
import java.util.List;

public class BeverageMaker {

    private CupSize selectedCupSize = CupSize.SMALL;

    List<Preparable> beverages = new ArrayList<>();

    public void addBeverage(Preparable beverage){
        beverages.add(beverage);
    }

    public void setCupSize(CupSize size){
        selectedCupSize = size;
    }

    public String prepare(int indexOfBeverage){
        String result = "";
        if (indexOfBeverage >= beverages.size())
            return "This beverage is not available";
        Preparable selectedBeverage = beverages.get(indexOfBeverage);
        result += "Preparing " + selectedCupSize.getDescription() + " cup";
        result += " of " + selectedBeverage.getName();
        result += " from " + selectedBeverage.getIngredients();
        return result;
    }

}

