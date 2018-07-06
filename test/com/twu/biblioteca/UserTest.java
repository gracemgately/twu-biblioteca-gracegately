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
        User user = new User("ME", "NOT");
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
        User.checkoutItemToUser(testBook);
        assertEquals(1, User.getBooksCheckedOutToUser().size());
    }

    @Test
    public void userShouldRemoveIDFromListWhenItemIsReturned(){
        User.checkoutItemToUser(testBook);
        User.checkoutItemToUser(testMovie);

        //size 1 from previous test
        assertEquals(1, User.getBooksCheckedOutToUser().size());
        User.returnItemToLibrary(testBook);

        assertTrue(User.getBooksCheckedOutToUser().size() == 0);
    }

    @Test
    public void userShouldKnowIfAnItemIsCheckedOutToThem(){
        User.checkoutItemToUser(testBook);
        assertTrue(User.isItemCheckedOutToUser(testBook));
        assertFalse(User.isItemCheckedOutToUser(testBook1));
    }
}

