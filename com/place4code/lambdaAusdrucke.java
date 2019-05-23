package com.place4code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class lambdaAusdrucke {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(4);
        listOfIntegers.add(5);
        listOfIntegers.add(1);
        listOfIntegers.add(2);

        List<Integer> listOfIntegers2 = listOfIntegers.stream()
                .map(x -> x + 2)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        listOfIntegers2.forEach(System.out::println);
        System.out.println("#####");
        listOfIntegers.forEach(System.out::println);

        int reduce = listOfIntegers.stream().reduce(0, Integer::sum);

        System.out.println(reduce);

        System.out.println(Integer.valueOf(354));


        System.out.println("#####");
        List<String> strings = new ArrayList<>();
        strings.add("test");
        strings.add("test_2");
        strings.add("beta");
        strings.add("alfa");
        strings.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.startsWith("T"))
                .forEach(System.out::println);

        System.out.println("#####");
        System.out.println("reduce");
        System.out.println("");

        List<Integer> listToReduce = new ArrayList<>(Arrays.asList(3,17,9,1,0,-3));
        int reduce2 = listToReduce.stream()
                .filter(x -> x < 20 && x > 0)
                .reduce(0, (a, b) -> {
                    if (a > b) return a;
                    else return b;
                });
        System.out.println(reduce2);

    }
}
