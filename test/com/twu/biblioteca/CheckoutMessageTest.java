package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckoutMessageTest {

    @Test
    public void gameShouldDisplayMessageBasedOnResultOfCheckout(){
        String successfulCheckout = "Thank you! Enjoy the book";
        String unsuccessfulCheckout = "That book is not available";

        CheckoutMessage.wasCheckoutSuccessful(true);
        String success = CheckoutMessage.getMessage();

        CheckoutMessage.wasCheckoutSuccessful(false);
        String failure = CheckoutMessage.getMessage();

        assertTrue(successfulCheckout.equals(success));
        assertTrue(unsuccessfulCheckout.equals(failure));

    }
}