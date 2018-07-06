package com.twu.biblioteca;

public class MenuInputScanner extends InputScanner{

    //TBD: too much repetition with checkout and return processes
    static int runMenuInputScanner() {
        int choice = MenuInputScanner.getScanner().nextInt();
        switch (choice) {
            case 1:
                // Check out a book
                Display.display("Enter the ID of the book you would like to check out.");

                CheckoutAndReturnInputScanner.createScanner();
                int bookCheckOutID = CheckoutAndReturnInputScanner.runCheckoutAndReturnScanner();

                boolean isValidForCheckout = CheckoutValidity.runPrelimCheckoutTests(BookList.getBookList(), bookCheckOutID);
                if (isValidForCheckout == true) {
                    CheckoutValidity.proceedWithValidCheckout(BookList.getBookList(), bookCheckOutID);
                }
                return 1;
            case 2:
                // Return a book
                Display.display("Enter the ID of the book you would like to return.");
                int bookReturnID = CheckoutAndReturnInputScanner.runCheckoutAndReturnScanner();

                boolean isValidForReturn = ReturnValidity.runPrelimReturnTests(BookList.getBookList(), bookReturnID);
                if (isValidForReturn == true){
                    ReturnValidity.proceedWithValidReturn(BookList.getBookList(), bookReturnID);
                }
                return 2;
            case 3:
                //View all books
                Display.displayBookList();
                return 3;
            case 4:
                //check out movie
                Display.display("Enter the ID of the movie you would like to check out.");
                return 4;
            case 5:
                //return movie
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