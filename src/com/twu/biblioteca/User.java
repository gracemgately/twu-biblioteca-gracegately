package com.twu.biblioteca;

import java.util.ArrayList;

public class User {

    //TBD: User should also eventually have a unique ID
    private static ArrayList<Integer> booksCheckedOut = new ArrayList<Integer>();
    private static ArrayList<Integer> moviesCheckedOut = new ArrayList<Integer>();

    //TBD: email address should be validated (use java email package?)
    private static String lastName, firstName, email, password;
    private static ArrayList<Integer> books, movies;
    User(String lastName, String firstName, String email, String password){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.books = booksCheckedOut;
        this.movies = moviesCheckedOut;

    }

    String getLastName(){
        return lastName;
    }

    String getFirstName(){
        return firstName;
    }

    String getEmail() { return email; }

    String getPassword() { return password; }

    String generateBasicUserHash(){
        return this.getLastName() + this.getFirstName();
    }

    //Overloading
    void checkoutItemToUser(Book book){ booksCheckedOut.add(book.ID); }
    void checkoutItemToUser(Movie movie) { moviesCheckedOut.add(movie.ID);}

    static void returnItemToLibrary(Book book){
        int indexToRemove = booksCheckedOut.indexOf(book.ID);
        booksCheckedOut.remove(indexToRemove);
    }

    static void returnItemToLibrary(Movie movie){
        int indexToRemove = moviesCheckedOut.indexOf(movie.ID);
        moviesCheckedOut.remove(indexToRemove);
    }

    ArrayList<Integer> getBooksCheckedOutToUser(){
        return this.books;
    }
    ArrayList<Integer> getMoviesCheckedOutToUser(){
        return this.movies;
    }

    boolean isItemCheckedOutToUser(Book book){return booksCheckedOut.contains(book.ID);}
    boolean isItemCheckedOutToUser(Movie movie){return moviesCheckedOut.contains(movie.ID);}

}
