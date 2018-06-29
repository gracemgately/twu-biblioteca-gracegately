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

//    @Test
//    public User userShouldBeCreatedFromUserInput() {
//
//    }
}

