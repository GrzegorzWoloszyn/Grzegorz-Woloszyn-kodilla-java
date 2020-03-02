package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.print("Text befor embellishment: pisać jak kura pazurem. ");
        poemBeautifier.beautify("pisać jak kura pazurem.", s -> s.toUpperCase());

        System.out.print("Text befor embellishment KOBYLA MA MALY BOK. ");
        poemBeautifier.beautify("KOBYLA MA MALY BOK.", s -> s.toLowerCase());

        System.out.print("Text befor embellishment: ala ma kota.");
        poemBeautifier.beautify("ala ma kota", s -> s.replace('a', 'e'));

        System.out.print("Text befor embellishment: 'Mój jest ten kawałek podłogi.'");
        poemBeautifier.beautify("'Mój jest ten kawałek pogłogi.'", s -> s.concat(" Wykonawca: Mr. Zoob"));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
