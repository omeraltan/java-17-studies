package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.List;

public class _20_Working_With_Generics {

    public static void main(String[] args) {

        parentChildExample();

        numberIntegerExample();

        numberIntegerExample2();

        parentChildExample2();

        parentChildArrayExample();

    }

    private static void parentChildExample(){

        Parent parent = new Child();                    // Bir parent değişkeni bir child'ı gösterebilir.

        Parent[] array = new Child[5];                  // Bir parent array'i bir child array'ini gösterebilir.

        // List<Parent> list = new ArrayList<Child>();  // DOES NOT COMPILE (generic lerde iki tarafta aynı tipte olmak zorundadır. Parent ise Parent, Child ise Child)

    }

    private static void numberIntegerExample(){

        List<Number> numbers1 = new ArrayList<Number>();
        ArrayList<Number> numbers2 = new ArrayList<Number>();
        List<Integer> numbers3 = new ArrayList<Integer>();
        List<Integer> numbers4 = new ArrayList<>();

        // List<Number> numbers5 = new ArrayList<Integer>();    // DOES NOT COMPILE (Integer, Number sınıfının alt sınıfı olmasına rağmen bu deklarasyon geçerli değildir.)
        // List<Number> numbers6 = new ArrayList<Long>();       // DOES NOT COMPILE

        Number[] numberArray1 = new Integer[3];

    }

    private static void numberIntegerExample2(){

        List<Number> numbers1 = new ArrayList<Number>();
        ArrayList<Number> numbers2 = new ArrayList<Number>();
        List<Integer> numbers3 = new ArrayList<Integer>();
        List<Integer> numbers4 = new ArrayList<>();

        sampleMethod(numbers1);
        sampleMethod(numbers2);
        // sampleMethod(numbers3);     // DOES NOT COMPILE
        // sampleMethod(numbers4);     // DOES NOT COMPILE

        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        sampleMethod4(strings);
        sampleMethod4(integers);
        sampleMethod4(objects);

        // sampleMethod5(strings);      // DOES NOT COMPILE (generic tip Object olarak bekleniyor.)
        // sampleMethod5(integers);     // DOES NOT COMPILE (generic tip Object olarak bekleniyor.)
        sampleMethod5(objects);

    }

    private static void parentChildExample2(){

        List<Parent> parents = new ArrayList<>();
        List<Child> children = new ArrayList<>();

        sampleMethod2(parents);
        // sampleMethod2(children);     // DOES NOT COMPILE

    }

    private static void parentChildArrayExample(){
        Parent[] parents = new Parent[5];
        Child[] children = new Child[5];

        sampleMethod3(parents);
        sampleMethod3(children);
    }

    private static void sampleMethod(List<Number> numbers) {

    }

    private static void sampleMethod2(List<Parent> parents) {

    }

    private static void sampleMethod3(Parent[] array) {

    }

    private static void sampleMethod4(List<?> list){
        // list.add(100);      // DOES NOT COMPILE (unbound durumunda eleman eklenilmesine izin verilmez.)
    }

    private static void sampleMethod5(List<Object> list){
        list.add(100);          // Object durumunda eleman eklenilmesine izin verilir.
    }


}

class Parent {

}

class Child extends Parent {

}

/**
 *
 *
 *
 */
