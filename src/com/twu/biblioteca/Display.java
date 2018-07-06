package com.twu.biblioteca;

import java.util.Map;
import java.util.TreeMap;

public class Display {

    static void display(String str){
        System.out.println(str);
    }

    //TBD: A lot of repetition here
    static void displayWelcomeMessage() {
        WelcomeMessage.gameShouldDisplayWelcomeMessageOnStart();
        String welcome = WelcomeMessage.getMessage();
        System.out.println(welcome);
    }

    static void displayUserInfoMessage(){
        UserInfoMessage.promptForUserName();
        String prompt = UserInfoMessage.getMessage();
        System.out.println(prompt);
    }

    //TBD: refactor repetition in Menu displays
    static void displayFirstMainMenu(){
        MenuMessages.gameShouldDisplayTwoMenuOptionsOnStart();
        String menuOptions = MenuMessages.getMessage();
        System.out.println(menuOptions);
    }

    static void displayWholeMenu(){
        MenuMessages.gameShouldDisplayAllMenuOptions();
        String allOptions = MenuMessages.getMessage();
        System.out.println(allOptions);
    }

    static void displayInvalidOptionMessage(){
        InvalidOptionMessage.invalidSelection();
        String invalid = InvalidOptionMessage.getMessage();
        System.out.println(invalid);
    }

    static void displayCheckoutResultMessage(boolean success){
        CheckoutMessage.wasCheckoutSuccessful(success);
        String result = CheckoutMessage.getMessage();
        System.out.println(result);
    }

    static void displayReturnResultMessage(boolean success){
        ReturnMessage.wasReturnSuccessful(success);
        String result = CheckoutMessage.getMessage();
        System.out.println(result);
    }

    static void displayBookList(){

        TreeMap<Integer, Item> bookList = BookList.getBookList();

        System.out.format("%32s%32s%32s%32s%32s%2s","ID#", "Author:", "Title:", "Year:", "# Available:","\n");

        for (Map.Entry<Integer, Item> entry: bookList.entrySet()){
            Item bookItem = entry.getValue();
            Book book = Book.class.cast(bookItem);
            System.out.format("%32d%32s%32s%32d%32d%2s", book.ID, book.author, book.title, book.year, book.quantityInStock, "\n");
        }
    }

    static void displayMovieList(){
        TreeMap<Integer, Item> movieList = MovieList.getMovieList();

        System.out.format("%32s%32s%32s%32s%32s%32s%2s","ID#", "Director:", "Title:", "Year:", "Rating:", "# Available:","\n");

        for (Map.Entry<Integer, Item> entry: movieList.entrySet()){
            Item movieItem = entry.getValue();
            Movie movie = Movie.class.cast(movieItem);
            System.out.format("%32d%32s%32s%32d%32d%32d%2s", movie.ID, movie.director, movie.title, movie.year, movie.rating, movie.quantityInStock, "\n");
        }

    }

}