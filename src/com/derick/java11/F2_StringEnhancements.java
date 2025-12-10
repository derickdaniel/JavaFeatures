package com.derick.java11;

public class F2_StringEnhancements {

    static void main() {
        System.out.println("".isBlank());
        System.out.println("1\n2".lines().count());
        System.out.println("    space  ".strip());
        System.out.println("  test   ".stripLeading());
        System.out.println("  test   ".stripTrailing());
    }
}
