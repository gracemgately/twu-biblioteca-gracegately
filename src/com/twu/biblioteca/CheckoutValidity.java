package com.twu.biblioteca;

import java.util.TreeMap;

public class CheckoutValidity {

    private static String currentUserHash = User.generateBasicUserHash();

    static boolean runPrelimCheckoutTests(TreeMap<Integer, Book> bookList, int bookID){
        Object isBook = BookList.findBookBasedOnID(bookList, bookID);

        //if this book does not exist in the database
        if (isBook == null){
            Display.displayInvalidOptionMessage();
            return false;
        }
        //otherwise, check to see if there is at least one in
        //stock to check out to this user
        else {
            Book book = Book.class.cast(isBook);
            if (book.areCopiesAvailableForCheckout()){
                return true;
            }
            else {
                Display.displayCheckoutResultMessage(false);
                return false;
            }
        }
    }

    static void proceedWithValidCheckout(TreeMap<Integer, Book> bookList, int bookID){
        Object bookObject = BookList.findBookBasedOnID(bookList, bookID);
        Book bookToCheckout = Book.class.cast(bookObject);

        //add book id to list of book ids in user array
        User.checkoutBookToUser(bookID);

        //add user hash to book array of owners
        bookToCheckout.addOwner(currentUserHash);

        //decrement amount of in book
        bookToCheckout.decrementQtyInStock();

        //display successful checkout message
        Display.displayCheckoutResultMessage(true);
    }
}
