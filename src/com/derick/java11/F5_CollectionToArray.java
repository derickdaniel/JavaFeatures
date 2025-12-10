package com.derick.java11;

import java.util.Arrays;
import java.util.List;

public class F5_CollectionToArray {

    static void main() {
        List sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
        Arrays.stream(sampleArray).forEach(System.out::println);
    }
}
