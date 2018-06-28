package com.twu.biblioteca;

import java.util.TreeMap;

public class BookList extends Message {

    //Object: Book
    //Integer: how many of that book remain available
    private static TreeMap<Object, Integer> bookList = new TreeMap<Object, Integer>();

    static void initializeBookIndex(){
        //TBD: eventually initialize the book index from saved information
        //from previous sessions of Biblioteca


    }

}
