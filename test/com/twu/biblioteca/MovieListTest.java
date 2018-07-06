package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.TreeMap;

public class MovieListTest {

    private Movie testMovie;
    private TreeMap<Integer, Item> testList;

    @Before
    public void createTestBookAndList(){
        Movie movie = new Movie("Paprika", "Kon, Satoshi", 5, 2006, 6, 1);
        movie.addOwner("Me, Who");
        movie.addOwner("You, Is");

        TreeMap<Integer, Item> list = new TreeMap<Integer, Item>();

        testMovie = movie;
        testList = list;
    }

    @Test
    public void thereShouldBeAListOfBooks(){
        assertEquals(0, testList.size());

        testList.put(testMovie.ID, testMovie);
        assertEquals(1, testList.size());
    }

    @Test
    public void shouldBeAbleToFindABookByID(){
        testList.put(testMovie.ID, testMovie);

        Object isMovie = MovieList.findItemBasedOnID(testList, 1);
        assertTrue(isMovie.equals(testMovie));
    }

    @Test
    public void shouldReturnNullForABookIDNotInList(){
        Object notBook = BookList.findItemBasedOnID(testList, 8);
        assertNull(notBook);

    }

}