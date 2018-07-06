package com.twu.biblioteca;

public class Movie extends Item {

    String director;
    int rating;
    Movie(String title, String director, int quantityInStock, int year, int rating, int ID){
        super(title, director, quantityInStock, year, ID);
        this.director = director;
        this.rating = rating;
    }
}
