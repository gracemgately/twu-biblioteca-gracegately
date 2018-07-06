package com.twu.biblioteca;

import java.util.Hashtable;
import java.util.TreeMap;

public abstract class ItemList {

    protected static TreeMap<Integer, Item> bookList = new TreeMap<Integer, Item>();
    protected static TreeMap<Integer, Item> movieList = new TreeMap<Integer, Item>();
    protected static Hashtable<String, User> userTable = new Hashtable<String, User>();


    static TreeMap<Integer, Item> getBookList(){
        return bookList;
    }

    static TreeMap<Integer, Item> getMovieList() { return movieList; }

    static Hashtable<String, User> getUserTable() { return userTable; }

    //Overloading
    static Object findItemBasedOnID(TreeMap<Integer, Item> listToSearch, int searchID) {
        return listToSearch.get(searchID);
    }
    static Object findItemBasedOnID(Hashtable<String, User> listToSearch, String libraryNumber){
        return listToSearch.get(libraryNumber);
    }

}
