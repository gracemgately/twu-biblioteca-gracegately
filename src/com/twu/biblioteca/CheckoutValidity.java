package com.twu.biblioteca;

import java.util.TreeMap;

public class CheckoutValidity {

    private static String currentUserHash = User.generateBasicUserHash();

    static boolean runPrelimCheckoutTests(TreeMap<Integer, Item> itemList, int itemID){
        Object isItem = ItemList.findItemBasedOnID(itemList, itemID);

        //if this book does not exist in the database
        if (isItem == null){
            Display.displayInvalidOptionMessage();
            return false;
        }
        //otherwise, check to see if there is at least one in
        //stock to check out to this user
        else {
            Item item = Item.class.cast(isItem);

            if (item.areCopiesAvailableForCheckout()){
                return true;
            }
            else {
                Display.displayCheckoutResultMessage(false, "item");
                return false;
            }
        }
    }

    static void proceedWithValidCheckout(TreeMap<Integer, Item> itemList, int itemID){
        Object item = ItemList.findItemBasedOnID(itemList, itemID);

        //how to declare variable for book or movie to reduce redundancy but still
        //add it to the correct list?

        if (item.getClass().toString().equals("class com.twu.biblioteca.Movie")){
            Movie movieToCheckOut = Movie.class.cast(item);
            User.checkoutItemToUser(movieToCheckOut);
            movieToCheckOut.addOwner(currentUserHash);
            movieToCheckOut.decrementQtyInStock();
            Display.displayCheckoutResultMessage(true, "movie");
        }
        else if (item.getClass().toString().equals("class com.twu.biblioteca.Book")){
            Book bookToCheckOut = Book.class.cast(item);
            User.checkoutItemToUser(bookToCheckOut);
            bookToCheckOut.addOwner(currentUserHash);
            bookToCheckOut.decrementQtyInStock();
            Display.displayCheckoutResultMessage(true, "book");
        }
    }
}
