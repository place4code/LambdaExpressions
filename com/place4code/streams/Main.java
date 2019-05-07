package com.place4code.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

        //##########################################################
        // Stream introduction
        someBigNumbers
            .stream()
            .map(String::toUpperCase)                               // Function
            .filter(s -> s.startsWith("G"))                         // Predicate
            .peek(e -> System.out.println("Filtered value: " + e))  // Consumer
            .sorted()
            .forEach(System.out::println);                          // Consumer
            // forEach = terminal operation

        System.out.println("-------------------------------------");
        //##########################################################
        // concat of 2 streams:
        Stream<String> s1 = Stream.of("I23", "N45");
        Stream<String> s2 = Stream.of("I23", "N68", "X23");

        Stream<String> concatStreams = Stream.concat(s1, s2); // concat() !new
        // concat() concat 2 streams

        System.out.println(concatStreams
                            .distinct()                 // !new
                            .peek(System.out::println)  // !new
                            .count());                  // !new

                            // distinct()   removes duplicate elements
                            // peek()       returns elements of stream
                            // count()      tells how many elements has stream

    }
}
