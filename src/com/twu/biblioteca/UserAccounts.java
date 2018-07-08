package com.twu.biblioteca;

public class UserAccounts extends ItemList{

    private static User currentUser;

    static void initializeUsers(){
        User user1 = new User("ME", "NOT", "notme@nowhere.com", "212-321-9876","invisibilitycloak");
        User user2 = new User("Green", "Last", "myemail@address.com", "876-098-2318","alsoBlue");
        User user3 = new User("Pinky", "Brain", "smarty@pants.com", "678-123-9826","neuroMajor");

        userTable.put("345-6789", user2);
        userTable.put("123-4567", user1);
        userTable.put("678-9012", user3);

    }

    static String getUserInfoFromUserInfoScanner(){
        UserInfoScanner.createScanner();
        return UserInfoScanner.runUserInfoScanner();
    }

    static void setCurrentUser(User user){
        currentUser = user;
    }

    static User getCurrentUser(){
        return currentUser;
    }


}
