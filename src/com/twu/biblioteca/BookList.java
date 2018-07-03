package com.twu.biblioteca;

import java.util.TreeMap;

public class BookList {

    //Object: Book
    //Integer: Book id
    private static TreeMap<Integer, Book> bookList = new TreeMap<Integer, Book>();

    static void initializeBookIndex(){
        //TBD: eventually initialize the book index from saved information
        //from previous sessions of Biblioteca

        Book book1 = new Book("Pat the Bunny", "Kunhardt, Dorothy", 3, 1940, 1);
        Book book2 = new Book("A True Novel", "Mizumura, Minae", 1, 2002, 2);
        Book book3 = new Book("Anna Karenina", "Tolstoy, Leo", 5, 1877, 3);
        Book book4 = new Book("Goodnight Moon", "Wise Brown, Margaret", 0, 1947, 4);

        bookList.put(book1.ID, book1);
        bookList.put(book2.ID, book2);
        bookList.put(book3.ID, book3);
        bookList.put(book4.ID, book4);
    }

    static TreeMap<Integer, Book> getBookList(){
        return bookList;
    }

    static Object findBookBasedOnID(TreeMap<Integer, Book> listToSearch, int searchID){
        return listToSearch.get(searchID);
    }

}
