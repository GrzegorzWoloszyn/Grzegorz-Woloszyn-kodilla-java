package com.kodilla.testing;

import com.kodilla.testing.User.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test 1 OK");
        } else
            System.out.println("Error!");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(10,8);
        int resultSunbstract = calculator.substract(10,8);

        if ((resultAdd == 18) && (resultSunbstract == 2)) {
            System.out.println("Test 2 OK");
        } else
            System.out.println("Test 2 Error");
    }
}
