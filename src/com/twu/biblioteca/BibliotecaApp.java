package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        WelcomeMessage.gameShouldDisplayWelcomeMessageOnStart();
        String hello = WelcomeMessage.getMessage();
        System.out.println(hello);

    }
}
