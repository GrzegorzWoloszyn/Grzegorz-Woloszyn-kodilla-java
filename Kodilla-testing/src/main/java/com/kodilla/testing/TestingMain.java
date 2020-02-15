package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main() {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John McArthur");
        String result = simpleUser.getUsername();
        String result2 = simpleUser.getRealname();

        if (result.equals("theForumUser")) {
            System.out.println("Test 1 OK");
        } else
            System.out.println("Error!");

        if (result2.equals("John McArthur")) {
            System.out.println("Test 1 OK");
        } else
            System.out.println("Error!");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(10,8);
        int resultSubstract = calculator.substract(10,8);

        if (resultAdd == 18) {
            System.out.println("Test 'add' OK");
        } else
            System.out.println("Test 'add' Error");

        if (resultSubstract == 2) {
            System.out.println("Test 'substract' 2 OK");
        }else
            System.out.println("Test 'substract' Error");
    }
}
