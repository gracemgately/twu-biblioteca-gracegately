package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class BookTest {

    private ArrayList<String> namesOfOwners() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Me, Who");
        names.add("You, Is");
        return names;
    }

    Book testBook = new Book("The Wind in The Willows", "Grahame, Kenneth", namesOfOwners(), 4);

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
    public void booksShouldKnowHowManyOfItAreLeft(){
        assertEquals(4, testBook.quantityInStock);
        assertNotEquals(2, testBook.quantityInStock);
    }

    @Test
    public void booksShouldHaveOwnersIfCheckedOut(){
        assertTrue(testBook.owners.size() == 2);
        assertTrue(testBook.owners.get(0).equals("Me, Who"));
    }
}


