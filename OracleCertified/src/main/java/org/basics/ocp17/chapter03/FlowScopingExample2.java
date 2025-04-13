package org.basics.ocp17.chapter03;

public class FlowScopingExample2 {

    public static void main(String[] args) {
        log("Hello");
        log("");
        log(42);
        log(-3.5);
        log(0.0);
        log(true);
    }

    public static void log(Object input){
        if (input instanceof String s && !s.isEmpty()){
            System.out.println("String input: " + s);
        } else if (input instanceof Integer i && i > 0) {
            System.out.println("Positive number : " + i);
        } else if (input instanceof Double d && d < 0) {
            System.out.println("Negative double: " + d);
        } else {
            System.out.println("Unsupported or invalid input");
        }
    }

}
