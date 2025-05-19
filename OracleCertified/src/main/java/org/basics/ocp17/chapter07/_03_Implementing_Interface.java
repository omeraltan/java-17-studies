package org.basics.ocp17.chapter07;

public class _03_Implementing_Interface {



}

interface Soar{
    int MAX_HEIGHT = 10;                    // Belirtilmesede varsayılan olarak "public", "static" ve "final" 'dır.
    final static boolean UNDERWATER = true; // Belirtilmesede varsayılan olarak "public" 'tir.
    void fly(int speed);                    // Belirtilmesede varsayılan olarak "public" ve "abstract" 'tır.
    abstract void takeoff();                // Belirtilmesede varsayılan olarak "public" 'tir.
    public abstract double dive();
}

interface Dance{
    // private int count = 4;   // -> DOES NOT COMPILE (Bir interface'deki değişkenler private olarak tanımlanamaz. Ayrıca bu değişken belirtilmesede public static final'dır.)
    // protected void step();   // -> DOES NOT COMPILE (Bir interface'deki değişkenler protected olarak tanımlanamaz.)
}

// Abstract class'larda abstract ifadesi açık bir şekilde yazılmalıdır.
abstract class Husky{
    abstract void play();
}

/**
 *
 * Implicit modifier'lar otomatik olarak koda eklenirler.
 * Interface'ler implicit olarak "abstract" 'tırlar.
 * Interface değişkenleri "public", "abstract" ve "final" özelliğe sahiptir.
 * Interface'de yer alan gövdesiz methodlar implicit olarak "abstract"'tır.
 * private olarak tanımlanmayan methodlar varsayılan olarak "public" 'tir.
 * Interface'de değişkenler private olamazlar.
 * Interface'lerde protected methodlar tanımlanamazlar.
 * Abstract methodlar public'tir.
 * Abstract class'lar ve Interfaceler'in ikiside abstract tipler olarak bildirilmektedir. Sadece interface'lerde implicit modifier'lar yer alır (Abstracl class'larda açık bir şekilde "abstract" anahtar kelimesi kullanılmalıdır.).
 * Bir abstract class'ta abstract ifadesi açık açık yazılmalıdır. Interface'te yazılmasına gerek yoktur.
 * Bir abstract class'ta abstract method için abstract ifadesi açık açık method'da kullanılmalıdır.
 * Interface de abstract ifadesi opsiyoneldir implicit olarak eklenir. Aynı durum interface'in abstract methodu içinde geçerlidir.
 *
 *
 */
