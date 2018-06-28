package com.twu.biblioteca;

import java.util.Scanner;

public class UserInputScanner{

    private static Scanner inputScanner;

    static void createScanner(){
        Scanner scanner = new Scanner(System.in);
        inputScanner = scanner;
    }

    static Scanner getScanner(){
        return inputScanner;
    }

    static int runScanner() {
        int choice = inputScanner.nextInt();
        System.out.println();
        switch (choice) {
            case 1:
                // Check out a book
                return 1;
            case 2:
                // Return a book
                return 2;
            case 3:
                //View all books
                return 3;
            case 4:
                //Quit
                return 4;
            default:
                //Unknown/Bad input
                return 0;
        }
    }

}