package com.derick.java17;

public class F3_SwitchStatementExp {

    static void main() {

        Object o = "string";
        printO(o);
        o = 1;
        printO(o);
        o = 1.0;
        printO(o);
    }

    private static void printO(Object o) {
        switch (o) {
            case String s -> System.out.println(o.toString());
            case Integer i -> System.out.println(i);
            default -> {
                System.out.println("Not defined: " + o.getClass());
                throw new IllegalStateException("Unexpected value: " + o);
            }
        }
    }
}
