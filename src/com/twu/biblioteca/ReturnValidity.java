package com.twu.biblioteca;

import java.util.TreeMap;

public class ReturnValidity {

    private static String currentUserHash = User.generateBasicUserHash();

    static boolean runPrelimReturnTests(TreeMap<Integer, Book> bookList, int bookID){
        Object isBook = BookList.findBookBasedOnID(bookList, bookID);

        //if this book does not exist in the database
        if (isBook == null){
            Display.displayInvalidOptionMessage();
            return false;
        }
        else {
            Book book = Book.class.cast(isBook);
            boolean doesUserHaveBook = User.isBookCheckedOutToUser(book.ID);
            boolean doesBookHaveUser = book.doesItemHaveUserInList(currentUserHash);

            //does the user have this book checked out in their list?
            //does the book have this user in its owner list?
            if (doesUserHaveBook == false || doesBookHaveUser == false){
                Display.displayReturnResultMessage(false);
                return false;
            }
            else {
                return true;
            }
        }
    }

    static void proceedWithValidReturn(TreeMap<Integer, Book> bookList, int bookID){
        Object bookObject = BookList.findBookBasedOnID(bookList, bookID);
        Book bookToReturn = Book.class.cast(bookObject);

        //remove book id from user array
        User.returnBookToLibrary(bookID);

        //remove user hash from book array of owners
        bookToReturn.removeOwnerFromList(currentUserHash);

        //increment qty in stock of book
        bookToReturn.incrementQtyInStock();

        //display successful return message
        Display.displayReturnResultMessage(true);

    }
}
