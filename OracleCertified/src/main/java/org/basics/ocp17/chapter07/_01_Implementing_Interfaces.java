package org.basics.ocp17.chapter07;

public class _01_Implementing_Interfaces {

    public static void main(String[] args) {



    }

}

abstract interface CanBurrow{

    public abstract Float getSpeed(int age);            // Abstract interface method (not need public and abstract)

    public static final int MINIMUM_DEPTH = 2;          // Constant variable (not need public static final)

}

interface WalksOnTwoLegs{

}

class Biped{
    public static void main(String[] args) {
        // var e = new WalksOnTwoLegs();    // DOES NOT COMPILE
    }
}

// class final interface WalksOnEightLegs{} // DOES NOT COMPILE

/**
 *
 * Bir source file da en fazla bir tane public top level type olabilir ve bunun ismi ile dosyanın ismi aynı olmak zorundadır.
 * Top level type lar sadece public yada package level tanımlanabilirler.
 * Diğer bir top level type olarak java Annotation lar vardır.
 * interface Java da anahtar bir kelimedir.
 * Bir sınıf birden fazla interface'i implemente edebilir.
 * Bir interface'in abstract methodları dolaylı olarak "public" ve "abstract" 'tır. Siz tanımlasanızda tanımlamasanızda.
 * Bir interface'te tanımlanan değişkenler aslında constant'lardır ve "public static final" olarak tanımlanmışlardır.
 * Interface lerin nesnesi yoktur ve oluşturulamaz (new anahtar kelimesi ile). Neden?
 * Bir interface'i final olarak tanımlayamayız.
 * Bir class için bir interface "implements" anahtar kelimesi ile inherit edilebilir.
 * Bir class birden fazla interface'i implements edebilir.
 * Bir class bir interface'i implements ettiği durumda bütün abstract methodlarını override etmek zorundadır.
 * Interface^ler birer contracttır. Interface'i implement eden class'lar bu contract'a uymak zorundadır.
 * Interfaceler class hiyerarşisinde yer almazlar. Interfacelerin constructorları yoktur (Abstract class'larda constructorlar mevcuttur (kullanılmasa dahi) ancak interfaceler de yoktur).
 * Interface den override edilen bir abstract method public olmak zorundadır çünkü interface'in abstract methodları default olarak public'tir.
 *
 *
 */
