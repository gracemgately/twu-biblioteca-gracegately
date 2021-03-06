package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MenuInputScannerTest{

    @Test
    public void scannerShouldReturnResultBasedOnUserChoice(){
        String goodInput = "3";
        InputStream good = new ByteArrayInputStream(goodInput.getBytes());
        System.setIn(good);

        MenuInputScanner.createScanner();
        int scannerResult = MenuInputScanner.runMenuInputScanner();

        assertEquals(3, scannerResult);
        assertNotEquals(4,scannerResult);

    }

    @Test
    public void scannerShouldNotTakeBadUserInput(){
        String badInput = "10";
        InputStream bad = new ByteArrayInputStream(badInput.getBytes());
        System.setIn(bad);

        MenuInputScanner.createScanner();
        int scannerResult = MenuInputScanner.runMenuInputScanner();

        assertEquals(0, scannerResult);
        assertNotEquals(6, scannerResult);
    }

}

