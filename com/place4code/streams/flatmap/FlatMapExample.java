package com.place4code.streams.flatmap;

import java.util.ArrayList;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {

        //some employees
        Employee jim = new Employee("Jim", 24);
        Employee tim = new Employee("Tim", 28);
        Employee johny = new Employee("Johny", 32);

        //add a new department
        Department dept1 = new Department("Department 1");
        dept1.addEmployee(jim);
        dept1.addEmployee(tim);

        //add another department
        Department dept2 = new Department("Department 2");
        dept2.addEmployee(johny);

        //add departments to list
        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);


    }
}
