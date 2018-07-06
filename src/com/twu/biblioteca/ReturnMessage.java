package com.twu.biblioteca;

public class ReturnMessage extends Message{

    static void wasReturnSuccessful(boolean result, String type) {
        String success = (result == true) ?
                "Thank you for returning the " + type :
                "That is not a valid " + type +" to return";
        setMessage(success);
    }
}
