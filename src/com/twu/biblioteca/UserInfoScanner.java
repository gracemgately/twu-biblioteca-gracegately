package com.twu.biblioteca;

public class UserInfoScanner extends InputScanner{

    static String runUserInfoScanner() {
        //TBD: account for bad user input
        String input = getScanner().nextLine();
        return input.toString().trim();

    }
}
