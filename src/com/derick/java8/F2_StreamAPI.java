package com.derick.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class F2_StreamAPI {

    static void main() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Jack", 1000));
        empList.add(new Employee("Sam", 2000));
        empList.add(new Employee("Jane", 3000));
        empList.add(new Employee("Jack", 4000));
        empList.add(new Employee("Sam", 5000));
        empList.add(new Employee("Jane", 6000));
        empList.add(new Employee("Jack", 7000));

        empList.stream()
                .filter(e -> e.getAge() <= 3000)
                .filter(e -> e.getName()
                        .startsWith("J"))
                .map(e -> e.getName().toUpperCase())
                .forEach(System.out::println);

        Map<String, Long> empWithSameName = empList.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        System.out.println(empWithSameName);


    }
}
class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
