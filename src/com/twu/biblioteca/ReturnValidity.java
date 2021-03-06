package com.twu.biblioteca;

import java.util.TreeMap;

public class ReturnValidity {

    //TBD: too much repetition!!!
    private static User currentUser = UserAccounts.getCurrentUser();
    private static String currentUserHash = currentUser.generateBasicUserHash();
    private static boolean doesUserHaveItem = false, doesItemHaveUser = false;

    static boolean runPrelimReturnTests(TreeMap<Integer, Item> itemList, int itemID) {
        Object isItem = ItemList.findItemBasedOnID(itemList, itemID);
        //if this book does not exist in the database
        if (isItem == null) {
            Display.displayInvalidOptionMessage();
            return false;
        } else {

            if (isItem.getClass().toString().equals("class com.twu.biblioteca.Book")) {
                Book book = Book.class.cast(isItem);
                doesUserHaveItem = currentUser.isItemCheckedOutToUser(book);
                doesItemHaveUser = book.doesItemHaveUserInList(currentUserHash);
                if (doesUserHaveItem == true || doesItemHaveUser == true) {
                    return true;
                }
            } else if (isItem.getClass().toString().equals("class com.twu.biblioteca.Movie")) {
                Movie movie = Movie.class.cast(isItem);
                doesUserHaveItem = currentUser.isItemCheckedOutToUser(movie);
                doesItemHaveUser = movie.doesItemHaveUserInList(currentUserHash);
                if (doesUserHaveItem == true && doesItemHaveUser == true) {
                    return true;
                }
            }
        }

        Display.displayReturnResultMessage(false, "item");
        return false;
    }

    static void proceedWithValidReturn(TreeMap<Integer, Item> itemList, int itemID){
        Object itemObject = ItemList.findItemBasedOnID(itemList, itemID);

        if (itemObject.getClass().toString().equals("class com.twu.biblioteca.Book")) {
            Book bookToReturn = Book.class.cast(itemObject);
            User.returnItemToLibrary(bookToReturn);
            bookToReturn.removeOwnerFromList(currentUserHash);
            bookToReturn.incrementQtyInStock();
            Display.displayReturnResultMessage(true, "book");

        }
        else if (itemObject.getClass().toString().equals("class com.twu.biblioteca.Movie")){
            Movie movieToReturn = Movie.class.cast(itemObject);
            User.returnItemToLibrary(movieToReturn);
            movieToReturn.removeOwnerFromList(currentUserHash);
            movieToReturn.incrementQtyInStock();
            Display.displayReturnResultMessage(true, "movie");

        }

    }
}
