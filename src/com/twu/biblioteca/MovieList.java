package com.twu.biblioteca;

public class MovieList extends ItemList {

    static void initializeMovieIndex(){
        //TBD: eventually initialize the movie index from saved information
        //from previous sessions of Biblioteca

        Movie movie1 = new Movie("The Age of Innocence", "Scorsese, Martin", 5, 1993, 7, 1);
        Movie movie2 = new Movie("La Belle et La Bête", "Cocteau, Jean", 2, 1946, 8, 2);
        Movie movie3 = new Movie("Paprika", "Kon, Satoshi", 5, 2006, 6, 3);

        movieList.put(movie1.ID, movie1);
        movieList.put(movie2.ID, movie2);
        movieList.put(movie3.ID, movie3);
    }
}
