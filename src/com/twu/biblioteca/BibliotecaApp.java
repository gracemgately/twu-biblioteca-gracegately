package com.twu.biblioteca;

public class BibliotecaApp {

    private static Object userSigningIn;
    private static boolean passwordVerified;

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        //TBD: THIS SHOULD ALL BE GAME CLASS LOGIC??

        //initialize book list
        BookList.initializeBookIndex();
        MovieList.initializeMovieIndex();
        UserAccounts.initializeUsers();

        //display welcome message
        Display.displayWelcomeMessage();


        //BUG: For some reason no matter what key is entered, Brain is always returned?
        while (userSigningIn == null){
            //display prompt for user
            Display.displayUserNumberMessage();
            //get user name
            String userName = UserAccounts.getUserInfoFromUserInfoScanner();
            //find user
            userSigningIn = UserAccounts.findItemBasedOnID(ItemList.getUserTable(), userName);
        }

        User user = User.class.cast(userSigningIn);

        //check password against records
        while (!passwordVerified){
            Display.display("Please enter your password");
            String isPassword = UserAccounts.getUserInfoFromUserInfoScanner();
            passwordVerified = (isPassword.equals(user.getPassword())) ? true : false;
        }


        //Welcome current user
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
