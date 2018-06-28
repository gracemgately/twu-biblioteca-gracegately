package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class UserInputScannerTest{

    //TBD: A lot of repetition in these tests...

    @Test
    public void scannerShouldTakeUserInput(){
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        UserInputScanner.createScanner();
        String scannerInput = UserInputScanner.getScanner().nextLine();

        assertEquals(input, scannerInput);
    }

    @Test
    public void scannerShouldReturnResultBasedOnUserChoice(){
        String goodInput = "2";
        InputStream good = new ByteArrayInputStream(goodInput.getBytes());
        System.setIn(good);

        UserInputScanner.createScanner();
        int scannerResult = UserInputScanner.runScanner();

        assertEquals(2, scannerResult);
        assertNotEquals(4,scannerResult);

    }

    @Test
    public void scannerShouldAccountForBadUserInput(){
        String badInput = "10";
        InputStream bad = new ByteArrayInputStream(badInput.getBytes());
        System.setIn(bad);

        UserInputScanner.createScanner();
        int scannerResult = UserInputScanner.runScanner();

        assertEquals(0, scannerResult);
        assertNotEquals(6, scannerResult);
    }

}