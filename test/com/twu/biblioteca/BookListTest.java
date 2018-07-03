package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.TreeMap;

public class BookListTest {

    private Book testBook;
    private TreeMap<Integer, Book> testList;

    @Before
    public void createTestBookAndList(){
        Book book = new Book("The Wind in The Willows", "Grahame, Kenneth", 4, 1908, 6);
        book.addOwner("Me, Who");
        book.addOwner("You, Is");

        TreeMap<Integer, Book> list = new TreeMap<Integer, Book>();

        testBook = book;
        testList = list;
    }

    @Test
    public void thereShouldBeAListOfBooks(){
        assertEquals(0, testList.size());

        testList.put(testBook.ID, testBook);
        assertEquals(1, testList.size());
    }

    @Test
    public void shouldBeAbleToFindABookByID(){
        testList.put(testBook.ID, testBook);

        Object isBook = BookList.findBookBasedOnID(testList, 6);
        assertTrue(isBook.equals(testBook));
    }

    @Test
    public void shouldReturnNullForABookIDNotInList(){
        Object notBook = BookList.findBookBasedOnID(testList, 8);
        assertNull(notBook);

    }

}
