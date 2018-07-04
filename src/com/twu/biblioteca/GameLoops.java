package com.twu.biblioteca;

public class GameLoops {

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
            case 4:
                //Quit
                Display.display("Goodbye!");
                currentChoice = 4;
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
