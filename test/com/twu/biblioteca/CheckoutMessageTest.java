package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckoutMessageTest {

    @Test
    public void gameShouldDisplayMessageBasedOnResultOfCheckout(){
        String successfulCheckout = "Thank you! Enjoy the book";
        String unsuccessfulCheckout = "That movie is not available";

        CheckoutMessage.wasCheckoutSuccessful(true, "book");
        String success = CheckoutMessage.getMessage();

        CheckoutMessage.wasCheckoutSuccessful(false, "movie");
        String failure = CheckoutMessage.getMessage();

        assertTrue(successfulCheckout.equals(success));
        assertTrue(unsuccessfulCheckout.equals(failure));

    }
}