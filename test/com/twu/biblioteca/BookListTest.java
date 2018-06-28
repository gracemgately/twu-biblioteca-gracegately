package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.TreeMap;

public class BookListTest {
    @Test
    public void thereShouldBeAListOfBooks(){
        TreeMap<Object, Integer> testList = new TreeMap<Object, Integer>();
        assertEquals(0, testList.size());

    }

}
