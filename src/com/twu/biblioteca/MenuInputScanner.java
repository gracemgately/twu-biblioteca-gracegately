package com.twu.biblioteca;

public class MenuInputScanner extends InputScanner{

    //TBD: too much repetition with checkout and return processes
    private static boolean isValidForCheckoutOrReturn;
    private static int itemID;

    static int runMenuInputScanner() {
        CheckoutAndReturnInputScanner.createScanner();
        int choice = MenuInputScanner.getScanner().nextInt();
        switch (choice) {
            case 1:
                // Check out a book
                Display.display("Enter the ID of the book you would like to check out.");
                itemID = CheckoutAndReturnInputScanner.runCheckoutAndReturnScanner();

                isValidForCheckoutOrReturn = CheckoutValidity.runPrelimCheckoutTests(BookList.getBookList(), itemID);
                if (isValidForCheckoutOrReturn == true) {
                    CheckoutValidity.proceedWithValidCheckout(BookList.getBookList(), itemID);
                }
                return 1;
            case 2:
                // Return a book
                Display.display("Enter the ID of the book you would like to return.");
                itemID = CheckoutAndReturnInputScanner.runCheckoutAndReturnScanner();

                isValidForCheckoutOrReturn = ReturnValidity.runPrelimReturnTests(BookList.getBookList(), itemID);
                if (isValidForCheckoutOrReturn == true){
                    ReturnValidity.proceedWithValidReturn(BookList.getBookList(), itemID);
                }
                return 2;
            case 3:
                //View all books
                Display.displayBookList();
                return 3;
            case 4:
                //check out movie
                Display.display("Enter the ID of the movie you would like to check out.");
                itemID = CheckoutAndReturnInputScanner.runCheckoutAndReturnScanner();

                isValidForCheckoutOrReturn = CheckoutValidity.runPrelimCheckoutTests(MovieList.getMovieList(), itemID);
                if (isValidForCheckoutOrReturn == true) {
                    CheckoutValidity.proceedWithValidCheckout(MovieList.getMovieList(), itemID);
                }
                return 4;
            case 5:
                //return movie
                Display.display("Enter the ID of the movie you would like to return.");
                itemID = CheckoutAndReturnInputScanner.runCheckoutAndReturnScanner();

                isValidForCheckoutOrReturn = ReturnValidity.runPrelimReturnTests(MovieList.getMovieList(), itemID);
                if (isValidForCheckoutOrReturn == true){
                    ReturnValidity.proceedWithValidReturn(MovieList.getMovieList(), itemID);
                }
                return 5;
            case 6:
                //view all movies
                Display.displayMovieList();
                return 6;
            case 7:
                //Quit
                Display.display("Goodbye!");
                return 7;
            default:
                //invalid option
                Display.displayInvalidOptionMessage();
                return 0;
        }
    }
}