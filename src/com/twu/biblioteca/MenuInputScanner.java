package com.twu.biblioteca;

public class MenuInputScanner extends InputScanner{

    static int runMenuInputScanner() {
        int choice = MenuInputScanner.getScanner().nextInt();
        switch (choice) {
            case 1:
                // Check out a book
                Display.display("Enter the ID of the book you would like to check out.");

                CheckoutInputScanner.createScanner();
                int bookID = CheckoutInputScanner.runCheckoutScanner();

                boolean isValidForCheckout = CheckoutValidity.runPrelimCheckoutTests(BookList.getBookList(), bookID);
                if (isValidForCheckout == true) {
                    CheckoutValidity.proceedWithValidCheckout(BookList.getBookList(), bookID);
                }
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