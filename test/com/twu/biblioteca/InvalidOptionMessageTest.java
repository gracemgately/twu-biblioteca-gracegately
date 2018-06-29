package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidOptionMessageTest {

    @Test
    public void gameShouldDisplayInvalidOptionMessage(){
        String expected = "Select a valid option!";

        InvalidOptionMessage.invalidSelection();
        String actual = InvalidOptionMessage.getMessage();

        assertTrue(expected.equals(actual));

    }
}
