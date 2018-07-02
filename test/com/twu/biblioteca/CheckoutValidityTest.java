package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class CheckoutValidityTest {

    private TreeMap<Book, Integer> testList;

    @Before
    public void createTestBookAndList(){
        Book book = new Book("The Wind in The Willows", "Grahame, Kenneth", 0, 1908, 6);
        Book book2 = new Book("Test-Driven Development: By Example", "Kent Beck", 2, 2003, 7);
        TreeMap<Book, Integer> list = new TreeMap<Book, Integer>();

        list.put(book, book.quantityInStock);
        list.put(book2, book2.quantityInStock);

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
