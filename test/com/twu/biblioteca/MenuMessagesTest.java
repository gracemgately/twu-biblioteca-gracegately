package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class MenuMessagesTest {
    @Test
    public void gameShouldDisplayMenuOptionsOnStart() {

        String noMessage = "";

        MenuMessages.gameShouldDisplayMenuOptionsOnStart();
        String actualMessage = MenuMessages.getMessage();

        assertFalse(noMessage.equals(actualMessage));
    }

}