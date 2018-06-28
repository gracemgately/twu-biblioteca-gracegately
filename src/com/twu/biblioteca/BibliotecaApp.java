package com.twu.biblioteca;

import java.util.TreeMap;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        //initialize book list
        BookList.initializeBookIndex();

        //display welcome message
        WelcomeMessage.gameShouldDisplayWelcomeMessageOnStart();
        String hello = WelcomeMessage.getMessage();
        Display.display(hello);

        //display book list
        TreeMap<Book, Integer> listOfBooks = BookList.getBookList();
        Display.display(listOfBooks);

    }
}
