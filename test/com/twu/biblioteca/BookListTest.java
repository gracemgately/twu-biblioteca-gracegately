package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.TreeMap;

public class BookListTest {

    private Book testBook;
    private TreeMap<Book, Integer> testList;

    @Before
    public void createTestBookAndList(){
        Book book = new Book("The Wind in The Willows", "Grahame, Kenneth", 4, 1908);
        book.addOwner("Me, Who");
        book.addOwner("You, Is");

        TreeMap<Book, Integer> list = new TreeMap<Book, Integer>();

        testBook = book;
        testList = list;
    }

    @Test
    public void thereShouldBeAListOfBooks(){
        assertEquals(0, testList.size());

        testList.put(testBook, testBook.quantityInStock);
        assertEquals(1, testList.size());
    }

}
