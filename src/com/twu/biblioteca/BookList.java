package com.twu.biblioteca;

import java.util.TreeMap;

public class BookList {

    //Object: Book
    //Integer: how many of that book remain available
    private static TreeMap<Book, Integer> bookList = new TreeMap<Book, Integer>();

    static void initializeBookIndex(){
        //TBD: eventually initialize the book index from saved information
        //from previous sessions of Biblioteca

        Book book1 = new Book("Pat the Bunny", "Kunhardt, Dorothy", 3, 1940, 1);
        Book book2 = new Book("A True Novel", "Mizumura, Minae", 1, 2002, 2);
        Book book3 = new Book("Anna Karenina", "Tolstoy, Leo", 5, 1877, 3);

        bookList.put(book1, book1.quantityInStock);
        bookList.put(book2, book2.quantityInStock);
        bookList.put(book3, book3.quantityInStock);
    }

    static TreeMap<Book, Integer> getBookList(){
        return bookList;
    }

}