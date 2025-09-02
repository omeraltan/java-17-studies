package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _19_Working_With_Generics {

    public static void main(String[] args) {

        // Deklerasyon şekilleri
        List<?> a = new ArrayList<String>();
        List<? extends Exception> a2 = new ArrayList<>();
        List<? super Exception> a3 = new ArrayList<Object>();

        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        // printList(keywords);    // DOES NOT COMPILE (List<String> ifadesi Object'e assign edilemez.)

        System.out.println("--------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(42));
        // List<Object> objects = numbers;     // DOES NOT COMPILE (numbers bir List<Integer> olduğu için List<Object> e verilemez.)
        // objects.add("forty two");
        // System.out.println(numbers.get(1));

        System.out.println("--------------------");

        List<String> keywords2 = new ArrayList<>();
        keywords2.add("java");
        printList2(keywords2);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        printList2(numbers2);

        System.out.println("--------------------");

        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();         // Buradaki tip ArrayList olacaktır (x2 nin tipi).

        x1 = x2;

        // List<Object> x3 = x1;               // DOES NOT COMPILE

        List<Object> x4 = x2;

        ArrayList<Object> x5 = x2;
        // List<String> x6 = x2;               // DOES NOT COMPILE


    }

    public static void printList(List<Object> list){
        for (Object x : list){
            System.out.println(x);
        }
    }

    // Ekleme işlemi yapılmasına izin vermez (read-only)
    // Ekleme işlemi yapılmasına izin verseydi Integer listesine String, String listesine de Integer ekleme durumu olacağından yapılmasına izin verilmez.
    public static void printList2(List<?> list){
        for (Object x : list){
            System.out.println(x);
            // list.add(100);          // DOES NOT COMPILE
            // list.add("String");     // DOES NOT COMPILE
            list.add(null);            // Sadece null değer eklememize izin verir.
        }
    }



}

/**
 *
 * --------------- Bounding Generic Types ---------------
 * Generic tipler için bound class belirleyebiliriz. Bu class'ları generic type yaparız. Bunun için question mark (?) kullanırız.
 * --------------- Types of Bounds ----------------------
 * ------------------------------------------------------------------------------------------------------------------
 * Type of bound                Syntax                  Example
 * ------------------------------------------------------------------------------------------------------------------
 * Unbounded wildcard           ?                       List<?> a = new ArrayList<String>();
 * Wildcard with upper bound    ? extends type          List<? extends Exception> a = new ArrayList<RuntimeException>
 * Wildcard with lower bound    ? super type            List<? super Exception> a = new ArrayList<Object>();
 * ------------------------------------------------------------------------------------------------------------------
 *
 * --------------- Creating Unbounded Wildcards ---------------
 * Herhangi bir veri türünü ifade eder. ? simgesi herhangi bir türün uygun olduğunu belirtmek için kullanılır.
 * Java bizi run time hatalarından korumak için generic leri kullanarak compile time hataları almamızı sağlar.
 *
 *
 */
