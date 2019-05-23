package com.place4code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTut {

    public static void main(String[] args) {

        Comparator<String> stringComparator = (x, y) -> {
            if (x.length() > y.length()) return 1;
            else if (x.length() < y.length()) return -1;
            else return 0;
        };

        Comparator<String> stringComparator2 = Comparator.comparing(s -> s.length());

        List<String> listToCompare = Arrays.asList("as", "sae", "a", "sadr", "as");

        //listToCompare.sort(stringComparator);
        //listToCompare.forEach(System.out::println);

        listToCompare.stream().sorted(stringComparator2).forEach(System.out::println);


    }




}
