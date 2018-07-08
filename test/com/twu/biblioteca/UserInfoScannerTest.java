package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class UserInfoScannerTest {

    @Test
    public void scannerShouldTakeAString(){
        String input = "123-7890";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        UserInfoScanner.createScanner();
        String scannerInput = UserInfoScanner.getScanner().nextLine();

        assertEquals(input, scannerInput);
    }

    @Test
    public void scannerShouldTrimInput(){
        String input = "   password ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        UserInfoScanner.createScanner();
        String userName = UserInfoScanner.runUserInfoScanner();

        assertEquals("password", userName);
    }
}
