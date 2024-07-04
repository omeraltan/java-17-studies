package org.basics.ocp6._26_Wrapper;

public class OverloadedExample2 {

    public static void main(String[] args) {

        Short s = 10;
        overloaded(s);

    }

    public static void overloaded(short s){
        System.out.println("short");
    }

    // Short IS - A Number
    public static void overloaded(Number n){
        System.out.println("Number");
    }


    public static void overloaded(Object o){
        System.out.println("Object");
    }

}
