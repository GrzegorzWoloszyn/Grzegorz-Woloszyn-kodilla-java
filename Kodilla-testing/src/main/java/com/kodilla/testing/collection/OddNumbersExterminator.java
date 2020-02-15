package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                numbers.add(i);
        }

       OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
       oddNumbersExterminator.exterminate(numbers);

    }
    
    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
         for(Integer number : numbers) {
             if(number%2 == 0) {
                evenNumbers.add(number);
             }
         }
        return (java.util.ArrayList<Integer>) evenNumbers;
    }
}
