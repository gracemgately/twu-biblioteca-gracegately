package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    private User testUser;
    private Book testBook, testBook1;
    private Movie testMovie;

    @Before
    public void buildTestInfo(){
        User user = new User("ME", "NOT", "notme@nowhere.com", "invisibilitycloak");
        Book book = new Book("The Wind in The Willows", "Grahame, Kenneth", 4, 1908, 6);
        Book book1 = new Book("A True Novel", "Mizumura, Minae", 1, 2002, 2);
        Movie movie = new Movie("Paprika", "Kon, Satoshi", 5, 2006, 6, 7);

        testUser = user;
        testBook = book;
        testBook1 = book1;
        testMovie = movie;

    }

    @Test
    public void userShouldHaveALastAndFirstName(){
        assertEquals("NOT", testUser.getFirstName());
        assertNotEquals("IS", testUser.getLastName());
    }

    @Test
    public void userShouldHaveEmail(){
        assertEquals("notme@nowhere.com", testUser.getEmail());
    }

    @Test
    public void userShouldHaveAddIDsToListWhenCheckedOut(){
        assertEquals(0, testUser.getBooksCheckedOutToUser().size());
        testUser.checkoutItemToUser(testBook);
        assertEquals(1, testUser.getBooksCheckedOutToUser().size());
    }

    @Test
    public void userShouldRemoveIDFromListWhenItemIsReturned(){
        testUser.checkoutItemToUser(testBook);
        testUser.checkoutItemToUser(testMovie);

        //size 1 from previous test
        assertEquals(1, testUser.getBooksCheckedOutToUser().size());
        User.returnItemToLibrary(testBook);

        assertTrue(testUser.getBooksCheckedOutToUser().size() == 0);
    }

    @Test
    public void userShouldKnowIfAnItemIsCheckedOutToThem(){
        testUser.checkoutItemToUser(testBook);
        assertTrue(testUser.isItemCheckedOutToUser(testBook));
        assertFalse(testUser.isItemCheckedOutToUser(testBook1));
    }
}

