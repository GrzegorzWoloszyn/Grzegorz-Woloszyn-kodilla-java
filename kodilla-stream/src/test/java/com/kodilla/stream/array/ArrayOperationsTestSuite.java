package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[]{10, 20, 34, 56, 54, 43, 32, 21, 0, 19, 88, 78, 69, 90, 400, 43, 27, 80, 99, 999};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(113.1, result, 0.001);
    }
}
