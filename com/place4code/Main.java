package com.place4code;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AnotherClass a = new AnotherClass();

        int i = 0;


        System.out.println(a.doStuff((s1, s2) -> {
            System.out.println(i);
            return s1.toUpperCase() + s2.toUpperCase();
        }, "string 1", "string 2"));

        Runnable r = () -> {
            try {
                Thread.sleep(2000); //try to sleep 2 sec
            } catch (InterruptedException e) {

            }
            System.out.println("I'm awake");
        };

        new Thread(r).start();

        //###################################################

        Employee jim = new Employee("Jim", 24);
        Employee tim = new Employee("Tim", 28);
        Employee johny = new Employee("Johny", 32);

        List<Employee> lista = new ArrayList<>();
        lista.add(jim);
        lista.add(tim);
        lista.add(johny);

        for (Employee item :
                lista) {
            new Thread(() -> System.out.println(item.getName() + ", age: " + item.getAge())).start();

        }

        lista.forEach((item) -> {
            System.out.println(item.getName() + ", age " + item.getAge());
        });

    }



}
