package com.twu.biblioteca;

public class WelcomeMessage extends Message {

    public static void gameShouldDisplayWelcomeMessageOnStart(){
        setMessage("Hello! Welcome to Biblioteca :)");
    }

    public static void promptForUserName(){
        setMessage("Please enter your name: LASTNAME, FIRSTNAME.");
    }

}