package com.twu.biblioteca;

public class MenuInputScanner extends InputScanner{

    static int runMenuInputScanner() {
        int choice = MenuInputScanner.getScanner().nextInt();
        switch (choice) {
            case 1:
                // Check out a book
                Display.display("Enter the ID of the book you would like to check out.");
                CheckoutInputScanner.createScanner();

                int bookID = CheckoutInputScanner.runCheckoutScanner();
                Object isBook = BookList.findBookBasedOnID(BookList.getBookList(), bookID);

                //if this book does not exist in the database
                if (isBook == null){
                    Display.displayInvalidOptionMessage();
                    return 1;
                }
                //otherwise, check to see if there is at least one in
                //stock to check out to this user
                else {
                    Book book = Book.class.cast(isBook);
                    if (book.quantityInStock == 0){
                        Display.displayCheckoutResultMessage(false);
                    }
                }
                // check to see if book amount available is zero
                    //yes:
                        //decrement amount of in booklist --
                        //add owner to book
                        //display unsuccessful checkout message
                        //return 1;
                    //no:
                        //add book id to array in user's list of books
                        //decrease amount available
                        //add user info to owner array in book
                return 1;
            case 2:
                // Return a book
                return 2;
            case 3:
                //View all books
                Display.displayBookList();
                return 3;
            case 4:
                Display.display("Goodbye!");
                return 4;
            default:
                //invalid option
                Display.displayInvalidOptionMessage();
                return 0;
        }
    }
}