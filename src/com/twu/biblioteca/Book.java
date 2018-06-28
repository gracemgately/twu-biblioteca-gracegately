package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {

    String title, author;
    ArrayList<String> owners = new ArrayList<String>();
    int quantityInStock;

    Book(String title, String author, ArrayList<String> owners, int quantityInStock){
        this.title = title;
        this.author = author;
        this.owners = owners;
        this.quantityInStock = quantityInStock;
    }
}
