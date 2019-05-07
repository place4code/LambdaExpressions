package com.place4code.functions;

import com.place4code.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionBiFunction {

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

        //#########################################################
        // get first name and get last name
        Function<Employee, String> getLastName = (Employee e) -> e.getName().substring(e.getName().indexOf(' ') + 1);
        Function<Employee, String> getFirstName = (Employee e) -> e.getName().substring(0, e.getName().indexOf(' '));

        // for test
        System.out.println(getName(getFirstName, lista.get(1)));
        System.out.println(getName(getLastName, lista.get(1)));

        //#########################################################
        //chaining functions:
        Function<Employee, String> toUpper = (Employee e) -> e.getName().toUpperCase();
        Function<String, String> firstName = (String s) -> s.substring(s.indexOf(' '));

        Function chained = toUpper.andThen(firstName); // andThen !important!
        System.out.println(chained.apply(lista.get(0)));

        //#########################################################
        // BiFunction, 2 parameter in, 1 out
        BiFunction<String, Employee, String> biTodo = (String s, Employee e) -> s.concat(" " + e.getAge());
        System.out.println(biTodo.apply(lista.get(0).getName(), lista.get(0)));



    }

    // method with Function interface, return String (apply())
    public static String getName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }
}
