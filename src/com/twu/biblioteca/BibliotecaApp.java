package com.twu.biblioteca;

import java.awt.*;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        //TBD: THIS SHOULD ALL BE GAME CLASS LOGIC??

        //initialize book list
        BookList.initializeBookIndex();
        MovieList.initializeMovieIndex();

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

        //display menu options FIRST TIME
        Display.displayFirstMainMenu();

        //start library menu loop
        GameLoops.entryLoop();
        while (GameLoops.getCurrentChoice() != 7){
            //user input
            MenuInputScanner.createScanner();
            GameLoops.otherLoops();
        }


    }
}
