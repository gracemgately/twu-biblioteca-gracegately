package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.TreeMap;

public class CheckoutValidityTest {

    private TreeMap<Integer, Item> testList;

    @Before
    public void createTestBookAndList(){
        Book book = new Book("The Wind in The Willows", "Grahame, Kenneth", 0, 1908, 6);
        Book book2 = new Book("Test-Driven Development: By Example", "Kent Beck", 2, 2003, 7);
        TreeMap<Integer, Item> list = new TreeMap<Integer, Item>();

        list.put(book.ID, book);
        list.put(book2.ID, book2);

        testList = list;
    }

    @Test
    public void shouldCheckForBooksNotInStock(){
        boolean notValid = CheckoutValidity.runPrelimCheckoutTests(testList, 6);
        boolean isValid = CheckoutValidity.runPrelimCheckoutTests(testList, 7);

        assertFalse(notValid);
        assertTrue(isValid);
    }

}
