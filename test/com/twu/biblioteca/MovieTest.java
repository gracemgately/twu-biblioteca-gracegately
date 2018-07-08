package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie testMovie, testMovie2;
    @Before
    public void createTestMovie(){
        Movie movie = new Movie("The Age of Innocence", "Scorsese, Martin", 5, 1993, 7, 1);
        Movie movie2 = new Movie("La Belle et La Bête", "Cocteau, Jean", 0, 1946, 8, 2);
        movie.addOwner("Me, Who");
        movie.addOwner("You, Is");
        testMovie = movie;
        testMovie2 = movie2;
    }

    @Test
    public void moviesShouldHaveATitle(){
        assertTrue(testMovie.title.equals("The Age of Innocence"));
        assertFalse(testMovie.title.equals("Taxi Driver"));
    }

    @Test
    public void moviesShouldHaveADirector(){
        assertTrue(testMovie.director.equals("Scorsese, Martin"));
        assertFalse(testMovie.director.equals("Ozu, Yasujiro"));
    }

    @Test
    public void moviesShouldHaveAYearReleased(){
        assertEquals(testMovie.year, 1993);
        assertNotEquals(testMovie.year, 1932);
    }


    @Test
    public void moviesShouldKnowHowManyOfItAreLeft(){
        assertEquals(5, testMovie.quantityInStock);
        assertNotEquals(2, testMovie.quantityInStock);
    }

    @Test
    public void booksShouldHaveOwnersIfCheckedOut(){
        assertTrue(testMovie.owners.size() == 2);
        assertTrue(testMovie.doesItemHaveUserInList("Me, Who"));
    }

    @Test
    public void booksShouldHaveAUniqueIDNumber(){
        assertTrue(testMovie.ID == 1);
        assertFalse(testMovie.ID == 3);
    }

    @Test
    public void booksShouldKnowIfThereAreCopiesAvailableForCheckout(){
        assertFalse(testMovie2.areCopiesAvailableForCheckout());
        assertTrue(testMovie.areCopiesAvailableForCheckout());
    }

    @Test
    public void shouldDecrementQuantityAvailableAfterCheckout(){
        testMovie.decrementQtyInStock();
        assertEquals(4, testMovie.quantityInStock);
    }

    @Test
    public void shouldIncrementQuantityAvailableAfterReturn(){
        testMovie.incrementQtyInStock();
        assertEquals(6, testMovie.quantityInStock);
    }

    @Test
    public void booksShouldRemoveOwnerFromListWhenReturned(){
        testMovie.removeOwnerFromList("WHOME");
        assertFalse(testMovie.owners.contains("WHOME"));
    }

}
