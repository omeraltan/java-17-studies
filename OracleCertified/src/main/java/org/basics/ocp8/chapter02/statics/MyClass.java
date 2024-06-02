package org.basics.ocp8.chapter02.statics;

public class MyClass {
    private static int staticVariable;

    static {
        staticVariable = 10;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Static variable: " + staticVariable);
    }
}

