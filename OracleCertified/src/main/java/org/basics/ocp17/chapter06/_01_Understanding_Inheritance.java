package org.basics.ocp17.chapter06;

import java.util.ArrayList;
import java.util.List;

public class _01_Understanding_Inheritance {

    public static void main(String[] args) {

        String s = "str";
        Integer i = 10;
        Zoo z = new Zoo();
        int[] array = new int[5];
        List<String> list = new ArrayList<>();

        System.out.println(s instanceof Object);        // -> true
        System.out.println(i instanceof Object);        // -> true
        System.out.println(z instanceof Object);        // -> true
        System.out.println(array instanceof Object);    // -> true
        System.out.println(list instanceof Object);     // -> true

    }

}

class Zoo{

}

class BigCat{
    protected double size;
}

class Jaguar extends BigCat{
    public Jaguar(){
        size = 10.2;
    }
    public void printDetails(){
        System.out.println(size);
    }
}

/**
 *
 * Variable lar ve methodlar için modifiers kulanılabildiği gibi class lar içinde kullanılabilirler.
 * final, abstract, sealed, non-sealed ve static gibi
 * final anahtar kelimesi bir sınıf tanımında kullanıldığında bu sınıf kalıtılamaz anlamına gelmektedir.
 * Java single inheritance'ı destekler yani bir sınıf sadece bir sınıfı kalıtabilir (extend).
 * Java'da bütün sınıflar java.lang.Object sınıfını kalıtırlar. Object sınıfının parent'ı yoktur.
 *
 */
