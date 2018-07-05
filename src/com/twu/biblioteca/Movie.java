package com.twu.biblioteca;

public class Movie extends Item {

    String director;
    Movie(String title, String director, int quantityInStock, int year, int ID){
        super(title, director, quantityInStock, year, ID);
        this.director = director;
    }
}
