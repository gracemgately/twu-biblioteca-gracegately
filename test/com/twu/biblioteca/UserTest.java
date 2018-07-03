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

        User.checkoutBookToUser(7);
        User.checkoutBookToUser(2);
        assertEquals(2, User.getBooksCheckedOutToUser().size());
    }

    @Test
    public void userShouldRemoveBookIDFromListWhenBookIsReturned(){
        User.checkoutBookToUser(1);
        User.checkoutBookToUser(6);

        //size 4 from previous test
        assertEquals(4, User.getBooksCheckedOutToUser().size());
        User.returnBookToLibrary(1);

        assertTrue(User.getBooksCheckedOutToUser().get(1) == 2);
    }

    @Test
    public void userShouldKnowIfABookIsCheckedOutToThem(){
        User.checkoutBookToUser(6);
        assertTrue(User.isBookCheckedOutToUser(6));
        assertFalse(User.isBookCheckedOutToUser(8));
    }
}

