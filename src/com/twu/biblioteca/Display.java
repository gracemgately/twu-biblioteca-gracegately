package com.twu.biblioteca;

import java.util.Map;
import java.util.TreeMap;

public class Display {

    static void display(String str){
        System.out.println(str);
    }

    static void display(TreeMap<Book, Integer> bookList){

        System.out.format("%32s%32s%32s%32s%2s", "Author:", "Title:", "Year:", "# Available:","\n");

        for (Map.Entry<Book, Integer> entry: bookList.entrySet()){
            Book book = entry.getKey();
            Integer quantity = entry.getValue();

            System.out.format("%32s%32s%32d%32d%2s", book.author, book.title, book.year, quantity, "\n");

        }
    }

}