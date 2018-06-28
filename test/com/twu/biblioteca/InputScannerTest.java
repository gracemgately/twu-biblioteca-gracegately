package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputScannerTest{

    //TBD: A lot of repetition in the scanner tests...

    @Test
    public void scannerShouldTakeUserInput(){
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        InputScanner.createScanner();
        String scannerInput = InputScanner.getScanner().nextLine();

        assertEquals(input, scannerInput);
    }
}