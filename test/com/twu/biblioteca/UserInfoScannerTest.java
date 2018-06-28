package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class UserInfoScannerTest {

    @Test
    public void scannerShouldTakeAString(){
        String input = "LAST, FIRST";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        UserInfoScanner.createScanner();
        String scannerInput = UserInfoScanner.getScanner().nextLine();

        assertEquals(input, scannerInput);
    }

    @Test
    public void scannerShouldTrimInputAndMakeUpperCase(){
        String input = "Read, dIdn'T";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        UserInfoScanner.createScanner();
        String userName = UserInfoScanner.runUserInfoScanner();

        assertEquals("READ, DIDN'T", userName);
    }
}
