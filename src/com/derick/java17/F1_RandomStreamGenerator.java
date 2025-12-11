package com.derick.java17;

import java.util.random.RandomGeneratorFactory;

public class F1_RandomStreamGenerator {
    static void main() {
        RandomGeneratorFactory.of("Random")
                .create()
                .ints(10, 0, 100).forEach(System.out::println);
    }
}
