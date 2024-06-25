package org.basics.oca8._32;

public class StringExample {

    public static void main(String[] args) {

        String x = "java";
        String y = "java";
        System.out.println(x == y);
        // Brada bir tane nesne oluşur.
        // Compiler ikinci nesneyi oluşturmaz

        String x2 = new String("java");
        String y2 = new String("java");
        System.out.println(x2 == y2);
        // her new işlemi için yeni bir nesne oluşur.



    }

}

/**
 *
 * String pool
 *
 */
