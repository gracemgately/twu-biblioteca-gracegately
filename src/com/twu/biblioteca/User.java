package com.twu.biblioteca;

import java.util.ArrayList;

public class User {

    //TBD: User should also eventually have a unique ID

    private static String lastName, firstName;
    private static ArrayList<Integer> booksCheckedOut = new ArrayList<Integer>();
    private static ArrayList<Integer> moviesCheckedOut = new ArrayList<Integer>();

    User(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    static String getLastName(){
        return lastName;
    }

    static String getFirstName(){
        return firstName;
    }

    static String generateBasicUserHash(){
        return User.getLastName() + User.getFirstName();
    }

    static String getUserInfoFromUserInfoScanner(){
        UserInfoScanner.createScanner();
        return UserInfoScanner.runUserInfoScanner();
    }

    static User parseUserInfoScannerInputAndCreateUser(String userName){
        String[] fullName = userName.split(",");
        String last = fullName[0].trim().toUpperCase();
        String first = fullName[1].trim().toUpperCase();
        return new User(last, first);
    }

    //Overloading
    static void checkoutItemToUser(Book book){ booksCheckedOut.add(book.ID); }
    static void checkoutItemToUser(Movie movie) { moviesCheckedOut.add(movie.ID);}

    static void returnItemToLibrary(Book book){
        int indexToRemove = booksCheckedOut.indexOf(book.ID);
        booksCheckedOut.remove(indexToRemove);
    }

    static void returnItemToLibrary(Movie movie){
        int indexToRemove = moviesCheckedOut.indexOf(movie.ID);
        moviesCheckedOut.remove(indexToRemove);
    }

    static ArrayList<Integer> getBooksCheckedOutToUser(){
        return booksCheckedOut;
    }
    static ArrayList<Integer> getMoviesCheckedOutToUser(){
        return moviesCheckedOut;
    }

    static boolean isItemCheckedOutToUser(Book book){return booksCheckedOut.contains(book.ID);}
    static boolean isItemCheckedOutToUser(Movie movie){return moviesCheckedOut.contains(movie.ID);}

}
