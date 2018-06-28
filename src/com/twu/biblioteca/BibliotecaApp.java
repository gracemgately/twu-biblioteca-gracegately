package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        //initialize book list

        //display welcome message
        WelcomeMessage.gameShouldDisplayWelcomeMessageOnStart();
        String hello = WelcomeMessage.getMessage();
        System.out.println(hello);



    }
}
