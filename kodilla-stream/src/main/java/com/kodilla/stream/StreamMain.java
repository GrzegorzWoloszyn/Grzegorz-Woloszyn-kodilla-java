package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FuctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.print("Text befor embellishment: pisać jak kura pazurem. ");
        poemBeautifier.beautify("pisać jak kura pazurem.", String -> String.toUpperCase());

        System.out.print("Text befor embellishment KOBYLA MA MALY BOK. ");
        poemBeautifier.beautify("KOBYLA MA MALY BOK.", String -> String.toLowerCase());

        System.out.print("Text befor embellishment: ala ma kota.");
        poemBeautifier.beautify("ala ma kota", String -> String.replace('a', 'e'));

        System.out.print("Text befor embellishment: 'Mój jest ten kawałek podłogi.'");
        poemBeautifier.beautify("'Mój jest ten kawałek pogłogi.'", String -> String.concat(" Wykonawca: Mr. Zoob"));



    }
}
