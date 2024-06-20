package org.basics.oca8._06.declarevariable;

public class Person {

    private String firstName; // instance variable -> access modifier olarak; private, protected, public olabilir.
    // değişkenler abstract olamazlar.
    private static String lastName; // instance variable değildir -> static değişkendir.

    void method(){
        String name = "user"; // local variable -> local değişkenler access modifier alamazlar.
        // private, protected, public olamazlar.
        final String finalName = "admin"; // final değişkenin değeri bir kez atanır.
        // local değişkenlerin yaşam alanı method ile sınırlıdır.
        // local değişkenler stack te yaşar.
        // instance değişkenler heap te yaşar.
        // local değişkenlere otomatik olarak değer atanmaz.

        //int number;
        //System.out.println(number); // compile time error

        //String str;
        //System.out.println(str); // compile time error
    }

}
