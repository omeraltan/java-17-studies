package org.basics.ocp17.chapter04;

public class Example3 {

    public static void main(String[] args) {

        String deneme = " ABC\t \n";
        System.out.println(deneme.trim().length());
        System.out.println(deneme.strip().length());
        System.out.println(deneme.stripLeading().length());
        System.out.println(deneme.stripTrailing().length());

    }

}
