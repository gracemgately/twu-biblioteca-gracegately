package com.twu.biblioteca;

import java.util.Scanner;

abstract public class InputScanner{

    private static Scanner inputScanner;

    static void createScanner(){
        Scanner scanner = new Scanner(System.in);
        inputScanner = scanner;
    }

    static Scanner getScanner(){
        return inputScanner;
    }

}