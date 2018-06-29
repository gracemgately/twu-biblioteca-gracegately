package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CheckoutInputScannerTest {

    //TBD: repetition in scanner tests
    @Test
    public void checkoutScannerShouldReturnResultBasedOnUserChoice(){
        String goodInput = "2";
        InputStream good = new ByteArrayInputStream(goodInput.getBytes());
        System.setIn(good);

        CheckoutInputScanner.createScanner();
        int scannerResult = CheckoutInputScanner.runCheckoutScanner();

        assertEquals(2, scannerResult);
        assertNotEquals(4,scannerResult);

    }
}
