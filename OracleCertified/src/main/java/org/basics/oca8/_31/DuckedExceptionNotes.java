package org.basics.oca8._31;

public class DuckedExceptionNotes {

    public static void main(String[] args) {
        method1();
    }

    static void method1(){
        try{
            method2();
        }catch(ArithmeticException e){
            System.out.println("exception caught!");
        }
    }
    static void method2(){
        method3();
    }
    static void method3(){
        System.out.println(100/0);
    }

}

/**
 *
 * Console daki hata kodlarını dikkatlice okumamız gerekiyor.
 * LIFO
 * method3
 * method2
 * method1
 * main
 *
 * ducked exception
 * propagating uncaught exception
 *
 */
