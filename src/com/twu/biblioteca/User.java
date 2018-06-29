package com.twu.biblioteca;

public class User {

    //TBD: User should also eventually have a unique ID

    private String lastName, firstName;
    User(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    String getFirstName(){
        return this.firstName;
    }

    static String getUserInfoFromUserInfoScanner(){
        UserInfoScanner.createScanner();
        return UserInfoScanner.runUserInfoScanner();
    }

    static User parseUserInfoScannerInputAndCreateUser(String userName){
        String[] fullName = userName.split(",");
        String last = fullName[0].trim();
        String first = fullName[1].trim();
        return new User(last, first);
    }


}
