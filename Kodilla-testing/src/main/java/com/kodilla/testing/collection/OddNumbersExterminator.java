package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
         for(Integer number : numbers) {
             if(number%2 == 0) {
                evenNumbers.add(number);
             }
         }
        return evenNumbers;
    }
}
