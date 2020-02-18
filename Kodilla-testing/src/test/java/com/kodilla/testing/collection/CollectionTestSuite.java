package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

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
        Assert.assertEquals(new ArrayList<>(), result);
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
        Assert.assertNotEquals(numbers, result2);

    }
}
