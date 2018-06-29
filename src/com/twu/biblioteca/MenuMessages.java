package com.twu.biblioteca;

public class MenuMessages extends Message{

    private static String checkOutOption = "Enter 1 to Check Out A Book",
            returnOption = "Enter 2 to Return A Book",
            viewAllBooksOption = "Enter 3 to View All Books",
            quitOption = "Enter 4 to Quit";

    public static void gameShouldDisplayTwoMenuOptionsOnStart(){
        setMessage(viewAllBooksOption + "\n" + quitOption); }

    public static void gameShouldDisplayAllMenuOptions(){
        setMessage(checkOutOption + "\n" + returnOption + "\n" + viewAllBooksOption + "\n" + quitOption);
    }
}