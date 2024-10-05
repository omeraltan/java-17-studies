package org.basics.ocp17.chapter03;

import java.util.List;

public class _07_Constructing_For_Loops {

    public static void main(String[] args) {
        traditionalForLoop();
        System.out.println("----------");
        traditionalForLoop2();
        System.out.println("----------");
        // for (;;){}       -> Infinity loop
    }

    public static void traditionalForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void traditionalForLoop2() {
        for (int i = 0; i < 10; System.out.println("iteration : " + i)) {   // -> System.out.println("iteration : " + i) : Burası en son çalışır.
            System.out.println("in the loop : " + i);
            i++;
        }
    }

    public static void traditionalForLoop3() {
        for ( ; ; ) {               //  -> Infinity loop
            System.out.println();
        }
        // System.out.println();        -> (Unreachable statement) DOES NOT COMPILE
    }

    public static void whileInfinityLoop() {
        int i = 5;

        while (i < 10) {
            System.out.println("Hello World!");
        }
        System.out.println("Unreachable Statement");
    }

    public static void whileInfinityLoop2(){
        while(true){
            System.out.println("Hello World!");
        }
        // System.out.println(" Unreachable Statement");       // -> DOES NOT COMPILE
    }

    public static void forLoop() {
        long x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; y++, z++ ) {
            System.out.println(y + " ");
        }
        System.out.println(x + " ");
    }

    public static void printNames(String[] names) {
        for (var name : names) {
            System.out.println(name);
        }
    }

    public static void printNames(List<String> names){
        for (var name : names){
            System.out.println(name);
        }
    }

}

/**
 *
 * 1. İki çeşit "for" loop vardır. Bunlar geleneksel (traditional for) ve zenginleştirilmiş (foreach)
 * 2.       for ( initialization    ;   booleanExpression   ;   updateStatement )
 * 3. Traditional loop'ta döngü çalıştıktan sonra artırım işlemi gerçekleşir.
 * 4. for loop içinde birden fazla değişken tanımı yapılabilir.
 * 5. boolean expression da tek bir tane boolean ifade olmalı yani boolean ifadeler merge olmalı.
 * 6. updateStatement ta bir den fazla artırım ifadesi olabilir. Bunlar virgül ile ayrılır.
 * 7. foreach loop array ve çeşitli collection yapıları üzerinde çalışır.
 * 8. Üzerinde çalışılacak yapının iterable özelliğe sahip olması gerekir.
 * 9. Foreach de bir array kullanabiliriz yada collection yapısı ancak bu collection "iterable" özelliğe sahip olmalıdır.
 * 10.Foreach için sağ tarafta bir array veya collection olması gerekmektedir (such as List or Set).
 * 11.Map yapılarını foreach te kullanamayız. Sol taraftaki ifade sağdaki ifade ile uyumlu olmak zorundadır.
 *
 */
