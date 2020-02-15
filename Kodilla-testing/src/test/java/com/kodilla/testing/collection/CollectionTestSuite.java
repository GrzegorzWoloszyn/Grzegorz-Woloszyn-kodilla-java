package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    private Object Integer;
    private Object ArrayList;

    @Before
    public void before() {
        System.out.println("Test Case: beginn...");
    }
    @After
    public void after() {
        System.out.println("Test Case: end.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Testing empty list of numbers");
        oddNumbersExterminator.exterminate();
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Testing the full list of numbers");
        oddNumbersExterminator.exterminate();
    }
}
