package com.twu.biblioteca;

public class BibliotecaApp {

    static Object userSigningIn;

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        //TBD: THIS SHOULD ALL BE GAME CLASS LOGIC??

        //initialize book list
        BookList.initializeBookIndex();
        MovieList.initializeMovieIndex();

        //display welcome message
        Display.displayWelcomeMessage();

        while (userSigningIn == null){
            //display prompt for user
            Display.displayUserInfoMessage();
            //get user name
            String userName = UserAccounts.getUserLibraryNumberFromUserInfoScanner();
            //find user
            userSigningIn = UserAccounts.findItemBasedOnID(ItemList.getUserTable(), userName);
        }

        //Welcome current user
        User user = User.class.cast(userSigningIn);
        UserAccounts.setCurrentUser(user);

        Display.display("Hi " + UserAccounts.getCurrentUser().getFirstName() + "!" );

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
