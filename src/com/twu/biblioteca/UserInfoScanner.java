package com.twu.biblioteca;

public class UserInfoScanner extends InputScanner{

    static String runUserInfoScanner() {
        //TBD: account for bad user input
        String input = getScanner().nextLine();
        String fullname = input.trim().toUpperCase();
        return fullname;
    }
}
