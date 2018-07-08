package com.twu.biblioteca;

public class BibliotecaApp {

    private static Object userSigningIn;
    private static boolean passwordVerified;

    static void initializeLists(){
        BookList.initializeBookIndex();
        MovieList.initializeMovieIndex();
        UserAccounts.initializeUsers();
    }

    static void signInUserAndSetAsCurrentUser(){
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

        UserAccounts.setCurrentUser(user);
    }


    public static void main(String[] args) {

        initializeLists();

        //display welcome message
        Display.displayWelcomeMessage();

        signInUserAndSetAsCurrentUser();

        //Welcome current user
        Display.display("Hi " + UserAccounts.getCurrentUser().getFirstName() + "!" );

        //display menu options FIRST TIME
        Display.displayFirstMainMenu();

        //start library menu loop
        Loops.entryLoop();
        while (Loops.getCurrentChoice() != 7){
            //user input
            MenuInputScanner.createScanner();
            Loops.otherLoops();
        }


    }
}
