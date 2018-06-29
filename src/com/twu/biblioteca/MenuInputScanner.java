package com.twu.biblioteca;

public class MenuInputScanner extends InputScanner{

    static int runMenuInputScanner() {
        int choice = getScanner().nextInt();
        switch (choice) {
            case 1:
                // Check out a book
                Display.display("Enter the ID of the book you would like to check out.");
                CheckoutInputScanner.createScanner();
                CheckoutInputScanner.runCheckoutScanner();


                // check to see if book amount available is zero
                    //yes: display unsuccessful checkout message
                        //return 1;
                    //no:
                        //add book id to array in user's list of books
                        //decrease amount available
                        //add user info to owner array in book
                return 1;
            case 2:
                // Return a book
                return 2;
            case 3:
                //View all books
                Display.displayBookList();
                return 3;
            case 4:
                Display.display("Goodbye!");
                return 4;
            default:
                //invalid option
                Display.displayInvalidOptionMessage();
                return 0;
        }
    }
}