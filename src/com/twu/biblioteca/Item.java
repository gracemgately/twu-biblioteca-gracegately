package com.twu.biblioteca;

import java.util.ArrayList;

public abstract class Item implements Comparable<Item> {

    @Override
    public int compareTo(Item other){
        int compared = this.title.compareTo(other.title);
        return (compared < 0) ? other.title.compareTo(this.title) : compared;
    }


    //TBD: eventually owner should be an object instead of a string (User class?)
    String title, author;
    ArrayList<String> owners;
    int quantityInStock, year;
    final int ID;
    Item(String title, String author, int quantityInStock, int year, int ID){
        this.title = title;
        this.year = year;
        this.owners = new ArrayList<String>();
        this.quantityInStock = quantityInStock;
        this.ID = ID;
    }

    void addOwner(String name){
        this.owners.add(name);
    }

    boolean areCopiesAvailableForCheckout(){
        return (this.quantityInStock == 0) ? false : true;
    }

    void decrementQtyInStock(){
        this.quantityInStock--;
    }

    void incrementQtyInStock(){
        this.quantityInStock++;
    }

    boolean doesItemHaveUserInList(String userName){
        return this.owners.contains(userName);
    }

    void removeOwnerFromList(String userName){
        this.owners.remove(userName);
    }
}
