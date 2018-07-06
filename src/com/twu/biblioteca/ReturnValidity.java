package com.twu.biblioteca;

import java.util.TreeMap;

public class ReturnValidity {

    //TBD: too much repetition!!!
    private static String currentUserHash = User.generateBasicUserHash();

    static boolean runPrelimReturnTests(TreeMap<Integer, Item> itemList, int itemID) {
        Object isItem = ItemList.findItemBasedOnID(itemList, itemID);
        //if this book does not exist in the database
        if (isItem == null) {
            Display.displayInvalidOptionMessage();
            return false;
        } else {

            if (isItem.getClass().toString().equals("class com.twu.biblioteca.Book")) {
                Book book = Book.class.cast(isItem);
                boolean doesUserHaveItem = User.isItemCheckedOutToUser(book);
                boolean doesItemHaveUser = book.doesItemHaveUserInList(currentUserHash);
                if (doesUserHaveItem == true || doesItemHaveUser == true) {
                    return true;
                }
            } else if (isItem.getClass().toString().equals("class com.twu.biblioteca.Movie")) {
                Movie movie = Movie.class.cast(isItem);
                boolean doesUserHaveItem = User.isItemCheckedOutToUser(movie);
                boolean doesItemHaveUser = movie.doesItemHaveUserInList(currentUserHash);
                if (doesUserHaveItem == true && doesItemHaveUser == true) {
                    return true;
                }
            }
        }
        Display.displayReturnResultMessage(false, "item");
        return false;
    }

    static void proceedWithValidReturn(TreeMap<Integer, Item> bookList, int bookID){
        Object bookObject = BookList.findItemBasedOnID(bookList, bookID);
        Book bookToReturn = Book.class.cast(bookObject);

        //remove book id from user array
        User.returnBookToLibrary(bookID);

        //remove user hash from book array of owners
        bookToReturn.removeOwnerFromList(currentUserHash);

        //increment qty in stock of book
        bookToReturn.incrementQtyInStock();

        //display successful return message
        Display.displayReturnResultMessage(true, "book");

    }
}
