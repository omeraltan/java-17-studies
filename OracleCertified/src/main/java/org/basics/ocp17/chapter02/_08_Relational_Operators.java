package org.basics.ocp17.chapter02;

public class _08_Relational_Operators {

    public static void main(String[] args) {
        int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
        System.out.println(gibbonNumFeet < wolfNumFeet);
        System.out.println(gibbonNumFeet <= wolfNumFeet);
        System.out.println(gibbonNumFeet >= ostrichNumFeet);
        System.out.println(gibbonNumFeet > ostrichNumFeet);

        System.out.println("-----------------");

        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof Number);
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof Long);

        System.out.println(num instanceof Integer);
        System.out.println(num instanceof Number);
        System.out.println(num instanceof Object);
        // System.out.println(num instanceof String);   // -> DOES NOT COMPILE

        System.out.println("-----------------");

        System.out.println(null instanceof Object);
        // System.out.println(null instanceof null);    // -> DOES NOT COMPILE



    }

}

/**
 *
 * 1. Relational operatorler iki ifadeyi karşılaştırır ve geriye boolean bir değer dönerler.
 * 2. "instanceof" bir anahtar kelimedir. Soldaki referans tipi sağdakinin tipindeyse true döner.
 * 3. "instanceof" özelliğini uyumsuz tipler için kullanırsanız compile time hatası alırsınız.
 * 4. null olan bir referans değişkenini "instanceof" operatörü ile kullanırsanız bu herzaman false dönecektir.
 *
 */
