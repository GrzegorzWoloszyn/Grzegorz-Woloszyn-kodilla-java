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
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        System.out.println("Testing empty list of numbers");
        ArrayList result = oddNumbersExterminator.exterminate(new ArrayList<>());
        //Then
        System.out.println("Empty List: " + result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        System.out.println("Testing the full list of numbers");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        ArrayList result2 = oddNumbersExterminator.exterminate(oddNumbersExterminator.exterminate(numbers));
        //Then
        System.out.println("Empty List: " + result2.isEmpty());
        System.out.println(result2);

    }
}