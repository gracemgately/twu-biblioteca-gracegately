package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    User testUser = new User("ME", "NOT");
    Book book = new Book("The Wind in The Willows", "Grahame, Kenneth", 4, 1908, 6);
    Movie movie = new Movie("Paprika", "Kon, Satoshi", 5, 2006, 6, 6);

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
    public void userShouldHaveAddIDsToListWhenCheckedOut(){
        assertEquals(0, User.getBooksCheckedOutToUser().size());

        User.checkoutItemToUser(book);
        User.checkoutItemToUser(movie);
        assertEquals(1, User.getBooksCheckedOutToUser().size());
        assertEquals(1, User.getMoviesCheckedOutToUser().size());

    }

    @Test
    public void userShouldRemoveIDFromListWhenItemIsReturned(){
        User.checkoutItemToUser(book);
        User.checkoutItemToUser(movie);

        //size 1 from previous test
        assertEquals(2, User.getBooksCheckedOutToUser().size());
        User.returnBookToLibrary(6);

        assertTrue(User.getBooksCheckedOutToUser().size() == 0);
    }

    @Test
    public void userShouldKnowIfAnItemIsCheckedOutToThem(){
        User.checkoutItemToUser(book);
        assertTrue(User.isBookCheckedOutToUser(6));
        assertFalse(User.isBookCheckedOutToUser(8));
    }
}

