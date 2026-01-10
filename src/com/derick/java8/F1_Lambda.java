package com.derick.java8;

public class F1_Lambda {
    static void main(String[] args) {

        Calculator add = Integer::sum;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5, 3)); // Outputs 8
        System.out.println("Multiplication: " + multiply.operate(5, 3)); // Outputs 15
    }

}

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

