package com.twu.biblioteca;

public class Message {

    private static String message;

    static String getMessage(){
        return message;
    }

    static void setMessage(String words){
        message = words;
    }

}
