package com.twu.biblioteca;

public class Book extends Item {

    String author;
    Book(String title, String author, int quantityInStock, int year, int ID){
        super(title, author, quantityInStock, year, ID);
        this.author = author;
    }
}
