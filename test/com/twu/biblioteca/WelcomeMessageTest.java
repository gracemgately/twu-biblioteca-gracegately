package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.*;

public class WelcomeMessageTest {
    @Test
    public void gameShouldDisplayWelcomeMessage() {

        String noMessage = "";
        String expectedMessage = "Hello! Welcome to Biblioteca :)";

        WelcomeMessage.gameShouldDisplayWelcomeMessageOnStart();
        String actualMessage = WelcomeMessage.getMessage();

        assertFalse(noMessage.equals(expectedMessage));
        assertTrue(actualMessage.equals(expectedMessage));
    }

}
