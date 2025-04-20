package org.basics.ocp17.chapter04;

public class _08_Understanding_Equality {

    public static void main(String[] args) {

        System.out.println("---------------");
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two);
        System.out.println(one == three);

        System.out.println("---------------");
        var x = "Hello World";
        var y = " Hello World".trim();
        System.out.println(x.equals(y));

        System.out.println("---------------");
        StringBuilder sb1 = new StringBuilder("Hello World");
        StringBuilder sb2 = new StringBuilder("Hello World");

        System.out.println(sb1 == sb2);                             // -> false
        System.out.println(sb1.equals(sb2));                        // -> false

        System.out.println(sb1.toString() == sb2.toString());       // -> false
        System.out.println(sb1.toString().equals(sb2));            // -> false
        System.out.println(sb1.toString().equals(sb2.toString()));  // -> true



    }

}

/**
 *
 * 1. "==" operatörü iki referenas değişken için bu iki referans değişken aynı nesneyi mi gösteriyor buna bakar.
 * 2. "equals()" methodu mantıksal olarak denklik logical equality yaklaşımını kullanmaktadır.
 * 3. Object sınıfındaki equals() methodu == ile aynı çalışır iki objenin aynı olup olmadığına bakar.
 * 4. StringBuilder Object sınıfındaki equals() methodunu override etmemiştir ancak String sınıfı Object sınıfındaki equals() methodunu overri etmiştir.
 *
 */
