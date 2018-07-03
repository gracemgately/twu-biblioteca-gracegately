package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    User testUser = new User("ME", "NOT");

    @Test
    public void userShouldHaveALastAndFirstName(){
        assertEquals("NOT", User.getFirstName());
        assertNotEquals("IS", User.getLastName());
    }

    @Test
    public void userShouldBeCreatedFromUserInput() {
        String userInput = "kennEdY  , BoBBy  ";
        User newUser = User.parseUserInfoScannerInputAndCreateUser(userInput);

        assertEquals(User.getFirstName(), "BOBBY");
    }

    @Test
    public void userShouldHaveAddBookIDsToListWhenCheckedOut(){
        assertEquals(0, User.getBooksCheckedOutToUser().size());

        User.checkoutBookToUser(6);
        User.checkoutBookToUser(2);
        assertEquals(2, User.getBooksCheckedOutToUser().size());
    }
}

