package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _12_Sorting_Data {

    public static void main(String[] args) {



    }

}

class Duck2 implements Comparable<Duck2>{
    private String name;
    private int weight;

    public Duck2() {
    }

    public Duck2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck2 d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        Comparator<Duck2> byWeight = new Comparator<Duck2>() {
            @Override
            public int compare(Duck2 d1, Duck2 d2) {
                return d1.getWeight()-d2.getWeight();
            }
        };
        var ducks = new ArrayList<Duck2>();
        ducks.add(new Duck2("Quack", 7));
        ducks.add(new Duck2("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks);                          // [Puddles, Quack]
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);                          // [Quack, Puddles]
    }

}

/**
 *
 * ---------- Comparing Data with a Comparator ----------
 * Comparable interface'ini implement etmeyen Object'leri sort etmek için Comparator interface'inden yararlanırız.
 * java.util.Comparator interface'ini sort methodunun overloaded versiyonunu da kullanabiliriz.
 * java.util.Comparator interface'inde compare methodu yer alır ve iki tane T tipinde parametre alır.
 * Comparable interface'i ise java.lang paketinde yer alır ve dolayısıyla Comparable'ı kullanırken herhangi bir import işlemi yapmayız fakat Comparator interface'i java.util paketinde yer aldığı için import etmemiz gerekir.
 * Comparator interface'i bir functional interface'dir.
 * Comparable interface'i bir functional interface'dir.
 * Comparator üzerinde lambda ifadeleri kullanılabilir.
 *
 * ---------- Comparing Comparable And Comparator ----------
 * -------------------------------------------------------------------------------------------
 * Difference                                           Comparable      Comparator
 * -------------------------------------------------------------------------------------------
 * Package name                                         java.lang       java.util
 * Interface must be implemented by class comparing?    Yes             No
 * Method name in interface                             compareTo()     compare()
 * Number of parameters                                 1               2
 * Common to declare using a lambda                     No              Yes
 * -------------------------------------------------------------------------------------------
 *
 */
