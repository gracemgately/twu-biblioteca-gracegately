package com.twu.biblioteca;

import java.util.TreeMap;

public abstract class ItemList {

    protected static TreeMap<Integer, Item> bookList = new TreeMap<Integer, Item>();
    protected static TreeMap<Integer, Item> movieList = new TreeMap<Integer, Item>();

    static TreeMap<Integer, Item> getBookList(){
        return bookList;
    }

    static TreeMap<Integer, Item> getMovieList() { return movieList; }

    static Object findItemBasedOnID(TreeMap<Integer, Item> listToSearch, int searchID){
        return listToSearch.get(searchID);
    }

}
