package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CheckoutAndReturnInputScannerTest {

    //TBD: repetition in scanner tests
    @Test
    public void checkoutAndReturnScannerShouldReturnResultBasedOnUserChoice(){
        String goodInput = "2";
        InputStream good = new ByteArrayInputStream(goodInput.getBytes());
        System.setIn(good);

        CheckoutAndReturnInputScanner.createScanner();
        int scannerResult = CheckoutAndReturnInputScanner.runCheckoutAndReturnScanner();

        assertEquals(2, scannerResult);
        assertNotEquals(4,scannerResult);

    }
}
