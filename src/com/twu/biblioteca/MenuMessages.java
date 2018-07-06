package com.twu.biblioteca;

public class MenuMessages extends Message{

    //TBD: a lot of repetition here; maybe refactor to choose either books or movies
    //and then choose what to do (i.e. return, check out, etc)

    private static String[] messages =
                    {"Enter 1 to Check Out A Book",
                    "Enter 2 to Return A Book",
                    "Enter 3 to View All Books",
                    "Enter 4 to Check Out A Movie",
                    "Enter 5 to Return A Movie",
                    "Enter 6 to View All Movies",
                    "Enter 7 to Quit"};

    static void gameShouldDisplayTwoMenuOptionsOnStart(){
        setMessage(messages[2] + "\n" + messages[5] + "\n" + messages[6]); }

    public static void gameShouldDisplayAllMenuOptions(){
        setMessage(String.join("\n", messages));
    }
}