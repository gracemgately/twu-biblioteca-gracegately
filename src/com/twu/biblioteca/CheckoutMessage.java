package com.twu.biblioteca;

public class CheckoutMessage extends Message {

    static void wasCheckoutSuccessful(boolean result, String item){
        String success = (result == true) ?
                "Thank you! Enjoy the " + item :
                "That " + item + " is not available";
        setMessage(success);
    }

}
