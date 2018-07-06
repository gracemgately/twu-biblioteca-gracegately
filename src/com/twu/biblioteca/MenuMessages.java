package com.twu.biblioteca;

public class MenuMessages extends Message{

    //TBD: a lot of repetition here; maybe refactor to choose either books or movies
    //and then choose what to do (i.e. return, check out, etc)

    private static String checkOutBooksOption = "Enter 1 to Check Out A Book",
            returnBooksOption = "Enter 2 to Return A Book",
            viewAllBooksOption = "Enter 3 to View All Books",
            checkOutMoviesOption = "Enter 4 to Check Out A Movie",
            returnMoviesOption = "Enter 5 to Return A Movie",
            viewAllMoviesOption = "Enter 6 to View All Movies",
            quitOption = "Enter 7 to Quit";

    static void gameShouldDisplayTwoMenuOptionsOnStart(){
        setMessage(viewAllBooksOption + "\n" + viewAllMoviesOption + "\n" + quitOption); }

    public static void gameShouldDisplayAllMenuOptions(){
        setMessage(checkOutBooksOption + "\n" +
                returnBooksOption + "\n" +
                viewAllBooksOption + "\n" +

                checkOutMoviesOption + "\n" +
                returnMoviesOption + "\n" +
                viewAllMoviesOption + "\n" +
                quitOption);
    }
}