package com.twu.biblioteca;


import java.util.ArrayList;

public class Book implements Comparable<Book>{

    @Override
    public int compareTo(Book other){
        int compared = this.title.compareTo(other.title);
        return (compared < 0) ? other.title.compareTo(this.title) : compared;
    }

    //TBD: eventually owner should be an object instead of a string (User class?)
    String title, author;
    ArrayList<String> owners;
    int quantityInStock, year;
    Book(String title, String author, int quantityInStock, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        this.owners = new ArrayList<String>();
        this.quantityInStock = quantityInStock;
    }

    public void addOwner(String name){
        this.owners.add(name);
    }
}
