package com.company;

public enum CupSize {

    BIG("big"), SMALL("small");

    private final String description;

    public String getDescription() {
        return description;
    }

    private CupSize(String description){
        this.description = description;
    }
}
