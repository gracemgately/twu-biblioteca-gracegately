package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Hashtable;

public class UserAccountsTest {

    private Hashtable<String, User> testTable;

    @Before
    public void buildTestUserAndList(){
        User user = new User("ME", "NOT", "notme@nowhere.com", "187-092-2678","invisibilitycloak");
        Hashtable<String, User> table = new Hashtable<String, User>();
        table.put("123-4567", user);
        testTable = table;
    }

    @Test
    public void userShouldBeFoundFromUserInput() {
        String userInput = "123-4567";
        Object user = UserAccounts.findItemBasedOnID(testTable, userInput);

        assertNotNull(user);
    }
}
