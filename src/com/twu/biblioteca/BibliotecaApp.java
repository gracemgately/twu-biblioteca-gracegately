package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        //TBD: THIS SHOULD ALL BE GAME CLASS LOGIC

        //initialize book list
        Game.initializeBookList();

        //display welcome message
        Display.displayWelcomeMessage();

        //display prompt for user
        Display.displayUserInfoMessage();

        //get user name
        String userName = User.getUserInfoFromUserInfoScanner();

        //create or find user
        User currentUser = User.parseUserInfoScannerInputAndCreateUser(userName);

        //Welcome current user
        Display.display("Hi " + currentUser.getFirstName() + "!" );

        //display book list
        Display.displayBookList();

        //display menu options
        Display.displayMainMenu();

        //user input
        MenuInputScanner.createScanner();
        int userChoice = MenuInputScanner.runMenuInputScanner();

    }
}
