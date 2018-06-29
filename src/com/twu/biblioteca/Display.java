package com.twu.biblioteca;

import java.util.Map;
import java.util.TreeMap;

public class Display {

    static void display(String str){
        System.out.println(str);
    }

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

    static void displayMainMenu(){
        MenuMessages.gameShouldDisplayMenuOptionsOnStart();
        String menuOptions = MenuMessages.getMessage();
        System.out.println(menuOptions);
    }

    static void displayBookList(){

        TreeMap<Book, Integer> bookList = BookList.getBookList();

        System.out.format("%32s%32s%32s%32s%32s%2s","ID#", "Author:", "Title:", "Year:", "# Available:","\n");

        for (Map.Entry<Book, Integer> entry: bookList.entrySet()){
            Book book = entry.getKey();
            Integer quantity = entry.getValue();

            System.out.format("%32d%32s%32s%32d%32d%2s", book.ID, book.author, book.title, book.year, quantity, "\n");
        }
    }

}