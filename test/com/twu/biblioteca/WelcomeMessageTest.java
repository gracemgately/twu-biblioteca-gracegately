package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.*;

public class WelcomeMessageTest {

    @Test
    public void gameShouldDisplayWelcomeMessageOnStart() {

        String testMessage = "Hello! Welcome to Biblioteca :)";
        String actualMessage = WelcomeMessage.GameShouldDisplayWelcomeMessageOnStart();

        assertTrue(actualMessage.equals(testMessage));
    }
}
