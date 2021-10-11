package com.example.bookshop.model;

public enum Genre {

    ACTION ("Action"),
    BIOGRAPHICAL ("Biographical"),
    CLASSICS ("Classics"),
    DETECTIVE ("Detective"),
    FANTASY ("Fantasy"),
    HISTORICAL ("Historical"),
    HORROR ("Horror"),
    lITERARY ("Literary"),
    ROMANCE ("Romance"),
    SCIENTE_FICTION ("Sciente_Fiction"),
    THRILLER ("Thriller");

    private String genre;

    Genre (String genre){
        this.genre = genre;
    }
}
