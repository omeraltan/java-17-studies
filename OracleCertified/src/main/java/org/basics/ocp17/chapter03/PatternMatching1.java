package org.basics.ocp17.chapter03;

public class PatternMatching1 {

    public static void main(String[] args) {
        printLengthIfStringNoPatternMatching("Hello World");
        // printLengthIfStringNoPatternMatching(123456);

        printLengthIfStringPatternMatching("Hello World");
        printLengthIfStringPatternMatching(123456);

        process("Java");
        process(10);
        process(3.0);
        process(true);

        describe("Hello");
        describe(42);
        describe(true);
        describe(null);
        describe(3.14);
    }

    public static void printLengthIfStringNoPatternMatching(Object obj){
        String value = (String) obj;
        System.out.print("String Length: " + value.length());
    }

    public static void printLengthIfStringPatternMatching(Object obj){
        if (obj instanceof String str){
            System.out.println("String length : " + str.length());
        }else {
            System.out.println("Not a string : " + obj);
        }
    }

    private static void process(Object obj) {

        if (obj instanceof String str){
            System.out.println("String length : " + str.length());
        } else if (obj instanceof Integer i){
            System.out.println("Integer doubled : " + (i*2));
        } else if (obj instanceof Double d) {
            System.out.println("Double squared : " + (d * d));
        } else {
            System.out.println("Unknown type.");
        }

    }

    private static void describe(Object obj) {
        switch (obj){
            case String s -> System.out.println("This is a string of length : " + s.length());
            case Integer i -> System.out.println("An Integer : " + i);
            case Boolean b -> System.out.println("A boolean : " + b);
            case null -> System.out.println("Null value");
            default -> System.out.println("Unknown type");
        }
    }




}
