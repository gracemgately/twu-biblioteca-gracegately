package com.twu.biblioteca;

import java.util.TreeMap;

public class CheckoutValidity {

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

    static void proceedWithValidCheckout(int bookID){
        //decrement amount of in booklist --
        //add owner to book
        //display unsuccessful checkout message
        //return 1;
        //no:
        //add book id to array in user's list of books
        //decrease amount available
        //add user info to owner array in book
    }
}
