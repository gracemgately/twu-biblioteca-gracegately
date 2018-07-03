package com.twu.biblioteca;

import java.util.ArrayList;

public class User {

    //TBD: User should also eventually have a unique ID

    private static String lastName, firstName;
    private static ArrayList<Integer> booksCheckedOut = new ArrayList<Integer>();

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

    static void checkoutBookToUser(int bookID){
        booksCheckedOut.add(bookID);
    }

    static ArrayList<Integer> getBooksCheckedOutToUser(){
        return booksCheckedOut;
    }

}
