package com.example.bookshop.model;

public enum CustomerType {

    SILVER("silver"),
    GOLD("gold"),
    PLATINIUM("platinium");

    private String type;

    CustomerType(String type){
        this.type = type;
    }

}
