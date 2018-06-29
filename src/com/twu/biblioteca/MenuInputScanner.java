package com.twu.biblioteca;

public class MenuInputScanner extends InputScanner{

    static int runMenuInputScanner() {
        int choice = getScanner().nextInt();
        switch (choice) {
            case 1:
                // Check out a book
                return 1;
            case 2:
                // Return a book
                return 2;
            case 3:
                //View all books
                Display.displayBookList();
                return 3;
            case 4:
                //Quit
                return 4;
            default:
                //invalid option
                Display.displayInvalidOptionMessage();
                return 0;
        }
    }
}