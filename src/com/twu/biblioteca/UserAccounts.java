package com.twu.biblioteca;

public class UserAccounts extends ItemList{

    private static User currentUser;

    static String getUserLibraryNumberFromUserInfoScanner(){
        UserInfoScanner.createScanner();
        return UserInfoScanner.runUserInfoScanner();
    }

    static void setCurrentUser(User user){
        currentUser = user;
    }

    static User getCurrentUser(){
        return currentUser;
    }
}
