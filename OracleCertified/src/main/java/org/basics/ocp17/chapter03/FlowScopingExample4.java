package org.basics.ocp17.chapter03;

public class FlowScopingExample4 {

    public static void main(String[] args) {
        handle("Flow");
        handle(5);
        handle(3.14);
        handle(null);
        handle(true);
    }

    public static void handle(Object input){
        switch (input){
            case String s when !s.isEmpty() -> System.out.println("Length: " + s.length());
            case Integer i -> System.out.println("Double: " + (i * 2));
            case Double d -> System.out.println("Triple: " + (d * 3));
            case null -> System.out.println("Null input");
            default -> System.out.println("Unknown type");
        }
    }

}
