package com.place4code.streams;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> someBigNumbers = Arrays.asList(
                "N34", "N56",
                "B32", "B58",
                "G43", "G87", "g12",
                "I12", "I99"
        );
/*
        someBigNumbers.sort((a, b) -> a.compareToIgnoreCase(b));

        someBigNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("G")) System.out.println(number);
        });
*/

    someBigNumbers
            .stream()
            .map(String::toUpperCase)
            .filter(s -> s.startsWith("G"))
            .sorted()
            .forEach(System.out::println);

    }
}
