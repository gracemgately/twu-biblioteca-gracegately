package com.twu.biblioteca;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;


public class ReturnValidityTest {

    private TreeMap<Integer, Item> testList;
    private Book testBook, testBook2;

    @Before
    public void createTestBookAndListAndUser(){
        Book book = new Book("The Wind in The Willows", "Grahame, Kenneth", 0, 1908, 6);
        Book book2 = new Book("Test-Driven Development: By Example", "Kent Beck", 2, 2003, 7);
        TreeMap<Integer, Item> list = new TreeMap<Integer, Item>();

        list.put(book.ID, book);
        list.put(book2.ID, book2);

        testList = list;
        testBook = book;
        testBook2 = book2;

        User newUser = new User("First", "Last");
        User.checkoutBookToUser(7);
        book2.addOwner(User.generateBasicUserHash());
    }

    @Test
    public void shouldAccountForInvalidSubmission(){
        boolean notCheckedOut = ReturnValidity.runPrelimReturnTests(testList, 12);
        assertFalse(notCheckedOut);
    }

    @Test
    public void shouldMakeSureBookHasUserInListOfOwners(){
        boolean checkedOut = ReturnValidity.runPrelimReturnTests(testList, 7);
        assertTrue(checkedOut);
    }

    @Test
    public void shouldIncrementQuantityInStock(){
        ReturnValidity.proceedWithValidReturn(testList, 7);
        assertEquals(3, testBook2.quantityInStock);
    }

    @Test
    public void shouldRemoveUserFromBookListOfOwners(){
        assertTrue(testBook2.doesItemHaveUserInList(User.generateBasicUserHash()));

        ReturnValidity.proceedWithValidReturn(testList, 7);
        assertFalse(testBook2.doesItemHaveUserInList(User.generateBasicUserHash()));

    }
}

