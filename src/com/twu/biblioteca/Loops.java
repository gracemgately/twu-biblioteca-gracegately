package com.twu.biblioteca;

public class Loops {

    private static int currentChoice;

    static int getCurrentChoice(){
        return currentChoice;
    }

    static void entryLoop(){
        MenuInputScanner.createScanner();
        int firstChoice = MenuInputScanner.getScanner().nextInt();

        switch(firstChoice){
            case 3:
                //View all books
                Display.displayBookList();
                currentChoice = 3;
                break;
            case 6:
                //View all movies
                Display.displayMovieList();
                currentChoice = 6;
                break;
            case 8:
                //Quit
                Display.display("Goodbye!");
                currentChoice = 8;
                break;
            default:
                Display.displayInvalidOptionMessage();
                currentChoice = 0;
                break;

        }
    }

    static void otherLoops(){
        Display.displayWholeMenu();
        int choice = MenuInputScanner.runMenuInputScanner();
        currentChoice = choice;
    }


}
