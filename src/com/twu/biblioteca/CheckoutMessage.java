package com.twu.biblioteca;

public class CheckoutMessage extends Message {

    static void wasCheckoutSuccessful(boolean result){
        String success = (result == true) ?
                "Thank you! Enjoy the book" :
                "That book is not available";
        setMessage(success);
    }

}
