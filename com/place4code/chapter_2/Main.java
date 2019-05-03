package com.place4code.chapter_2;

import com.place4code.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {


        Employee jim = new Employee("Jim", 24);
        Employee tim = new Employee("Tim", 28);
        Employee johny = new Employee("Johny", 32);

        List<Employee> lista = new ArrayList<>();
        lista.add(jim);
        lista.add(tim);
        lista.add(johny);

        //############################################################
        // Predicate
        printByAge(lista, item -> item.getAge() > 28);

        IntPredicate intPredicate = i -> i > 10;
        IntPredicate intPredicate2 = i -> i < 100;

        System.out.println(intPredicate.test(1));
        // how to link 2 Predicate:
        System.out.println(intPredicate.and(intPredicate2).test(35));


        //############################################################
        // Supplier
        Random random = new Random();
        Supplier supp = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(supp.get());
        }


    }

    private static void printByAge(List<Employee> list, Predicate<Employee> condition) {

        list.forEach((item) -> {
            if (condition.test(item)) { // test() from Predicate<>
                System.out.println(item.getName());
            }
        });

    }
}
