package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    User testUser = new User("ME", "NOT");

    @Test
    public void userShouldHaveALastAndFirstName(){
        assertEquals("NOT", testUser.getFirstName());
        assertNotEquals("IS", testUser.getLastName());
    }

    @Test
    public void userShouldBeCreatedFromUserInput() {
        String userInput = "kennEdY  , BoBBy  ";
        User newUser = User.parseUserInfoScannerInputAndCreateUser(userInput);

        assertEquals(newUser.getFirstName(), "BOBBY");
        assertNotEquals(newUser.getLastName(), testUser.getLastName());
    }
}

