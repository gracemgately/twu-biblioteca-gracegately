package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    private Book testBook, testBook2;
    @Before
    public void createTestBook(){
        Book book = new Book("The Wind in The Willows", "Grahame, Kenneth", 4, 1908, 6);
        Book book2 = new Book("Test-Driven Development: By Example", "Kent Beck", 0, 2003, 7);
        book.addOwner("Me, Who");
        book.addOwner("You, Is");
        testBook = book;
        testBook2 = book2;
    }

    @Test
    public void booksShouldHaveATitle(){
        assertTrue(testBook.title.equals("The Wind in The Willows"));
        assertFalse(testBook.title.equals("The Sound and The Fury"));
    }

    @Test
    public void booksShouldHaveAnAuthor(){
        assertTrue(testBook.author.equals("Grahame, Kenneth"));
        assertFalse(testBook.author.equals("Faulkner, William"));
    }

    @Test
    public void booksShouldHaveAYearPublished(){
        assertEquals(testBook.year, 1908);
        assertNotEquals(testBook.year, 1929);
    }

    @Test
    public void booksShouldKnowHowManyOfItAreLeft(){
        assertEquals(4, testBook.quantityInStock);
        assertNotEquals(2, testBook.quantityInStock);
    }

    @Test
    public void booksShouldHaveOwnersIfCheckedOut(){
        assertTrue(testBook.owners.size() == 2);
        assertTrue(testBook.doesItemHaveUserInList("Me, Who"));
    }

    @Test
    public void booksShouldHaveAUniqueIDNumber(){
        assertTrue(testBook.ID == 6);
        assertFalse(testBook.ID == 3);
    }

    @Test
    public void booksShouldKnowIfThereAreCopiesAvailableForCheckout(){
        assertFalse(testBook2.areCopiesAvailableForCheckout());
        assertTrue(testBook.areCopiesAvailableForCheckout());
    }

    @Test
    public void shouldDecrementQuantityAvailableAfterCheckout(){
        testBook.decrementQtyInStock();
        assertEquals(3, testBook.quantityInStock);
    }

    @Test
    public void shouldIncrementQuantityAvailableAfterReturn(){
        testBook.incrementQtyInStock();
        assertEquals(5, testBook.quantityInStock);
    }

    @Test
    public void booksShouldRemoveOwnerFromListWhenReturned(){
        testBook.removeOwnerFromList("WHOME");
        assertFalse(testBook.owners.contains("WHOME"));
    }

}


