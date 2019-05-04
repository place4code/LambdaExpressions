package com.place4code.functions;

import com.place4code.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {

    /*
     * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
     * */

    public static void main(String[] args) {


        Employee jim = new Employee("Jim Tommy", 24);
        Employee tim = new Employee("Tim Jimmy", 28);
        Employee johny = new Employee("Johny Tony", 32);

        List<Employee> lista = new ArrayList<>();
        lista.add(jim);
        lista.add(tim);
        lista.add(johny);

        // get first name and get last name
        Function<Employee, String> getLastName = (Employee e) -> e.getName().substring(e.getName().indexOf(' ') + 1);
        Function<Employee, String> getFirstName = (Employee e) -> e.getName().substring(0, e.getName().indexOf(' '));


        System.out.println(getName(getFirstName, lista.get(1)));
        System.out.println(getName(getLastName, lista.get(1)));

    }

    // method with Function interface, return String (apply())
    public static String getName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }
}
