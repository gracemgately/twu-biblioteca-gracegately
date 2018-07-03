package com.twu.biblioteca;

public class ReturnMessage extends Message{

    static void wasReturnSuccessful(boolean result) {
        String success = (result == true) ?
                "Thank you for returning the book." :
                "That is not a valid book to return.";
        setMessage(success);
    }
}
