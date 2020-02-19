package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<>());
        //Then
        Assert.assertEquals(new ArrayList<>(), result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        System.out.println("Testing the full list of numbers");
        List<Integer> numbers = new ArrayList<>(100);
        List<Integer> result2 = oddNumbersExterminator.exterminate(oddNumbersExterminator.exterminate(numbers));
        //Then
        Assert.assertEquals(numbers, result2);

    }
}
