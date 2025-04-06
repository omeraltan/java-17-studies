package org.basics.ocp17.chapter03;

public class FlowScopingExample1 {

    public static void main(String[] args) {
        printFirstChar("Hello");
        printFirstChar(123);
        printFirstChar(null);
    }

    public static void printFirstChar(Object obj){
        if (obj instanceof String s && !s.isEmpty()){
            System.out.println("First character: " + s.charAt(0));
        } else {
            System.out.println("Invalid input");
        }
    }

}
