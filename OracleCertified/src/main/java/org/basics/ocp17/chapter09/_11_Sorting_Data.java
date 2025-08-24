package org.basics.ocp17.chapter09;

import com.sun.source.tree.Tree;

import java.util.*;

public class _11_Sorting_Data {

    public static void main(String[] args) {

        treeSetExample();

        System.out.println("----------");

        treeSetExample2();

        System.out.println("----------");

        mapExample();

    }

    private static void treeSetExample(){

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(70);
        numbers.add(50);
        numbers.add(40);
        numbers.add(60);
        numbers.add(0);
        numbers.add(-10);
        // numbers.add(null);      // NulPointerException (TreeSet'e null değer eklenemez.)

        System.out.println(numbers);

    }

    private static void treeSetExample2(){

        TreeSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("Abc");
        sortedSet.add("zaa");
        sortedSet.add("AZc");
        sortedSet.add("abc");
        sortedSet.add("Zbc");
        sortedSet.add("1Zaz");
        sortedSet.add("1ZZz");

        System.out.println(sortedSet);

        String a;
        Integer b;
        Short c;
        Double d;

    }

    private static void mapExample(){

        Map<StringBuilder, Integer> map = new TreeMap<>();

        map.put(new StringBuilder("jane"), 25);
        map.put(new StringBuilder("mike"), 20);
        map.put(new StringBuilder("george"), 30);
        map.put(new StringBuilder("jack"), 10);
        map.put(new StringBuilder("ken"), 40);
        map.put(new StringBuilder("angelica"), 5);

        System.out.println(map);    // Sıralama key e göre değil value'ya göre StringBuilder tarafından yapılıyor.

    }

}

class Duck implements Comparable<Duck>{

    private String name;

    public Duck(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {

        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        ducks.add(new Duck("Donald"));
        ducks.add(null); // Causes Collections.sort throwing NullPointerException
        Collections.sort(ducks);                // sort by name
        System.out.println(ducks);              // [Puddles, Quack]

    }
}

class Animal implements Comparable<Animal>{

    private int id;

    @Override
    public int compareTo(Animal a) {
        return id - a.id;
    }

    public static void main(String[] args) {
        var a1 = new Animal();
        var a2 = new Animal();

        a1.id = 5;
        a2.id = 7;

        System.out.println(a1.compareTo(a2));       // -2
        System.out.println(a1.compareTo(a1));       // 0
        System.out.println(a2.compareTo(a1));       // 2
    }

}

class LegacyDuck implements Comparable{

    private String name;


    @Override
    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj;        // cast because no generics
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        var ducks = new ArrayList();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        ducks.add(new Duck("Donald"));
        Collections.sort(ducks);                // sort by name
    }
}

/**
 *
 * Sayılar için sıralama küçükten büyüğe doğru olmaktadır (numeric order).
 * String objeler için harf sırasına göre olmaktadır (unicode değerine göre).
 * uppercase'lerin unicode değeri lowercase'lerden daha küçüktür.
 * String ve Integer sınıfı gibi wrapper sınıflar, "Comparable" interface'ini implement ederler.
 * StringBuilder sınıfı'da "Comparable" interface'ini implement eder.
 * Collections.sort()       : Collection'ları sıralamak için kullanılır.
 * Comparable (interface)   : java.lang paketinde yer alır. TreeSet'e eklenen veriler Comparable olmak zorundadır.
 * Comparator (interface)   : java.util paketinde yer alır.
 * Comparable interface'inde bir tane abstract method yer almaktadır. int compareTo(T o); Comparable interface'i bir functional interface'dir.
 * ---------- compareTo() methodu ile ilgili bilinmesi gerekenler ----------
 * Eğer dönen değer 0 (sıfır) ise bu durumda karşılaştırılan object ile mevcut object birbirine denktir.
 * Eğer dönen değer negatif (-) ise bu durumda mevcut object methoda verilen object'ten daha küçüktür.
 * Eğer dönen değer pozitif (+) ise bu durumda mevcut object methoda verilen object'ten daha büyüktür.
 *
 * Bir başka yöntem olarak Integer.compare(id, a.id) kullanılabilir.
 * "id - a.id" ascending order yaparken, "a.id - id" ise descending order yapmaktadır.
 *
 * ---------- Casting the compareTo() Argument ----------
 * Comparable interface ine <T> verilmediğinde Object tipinde olur. Bu durumda casting yapılması gerekmektedir.
 * ---------- Checking for null ----------
 * Comparable ve Comparator ile çalışırken çalıştığımız collection yapısı null değerlere sahip olabilir.
 * compare methodunu yazarken önceden doğrulanmamışsa yani validate edilmemiş ise bud durumda verileri karşılaştırmadan önce kontrol etmemiz gerekir.
 *
 *
 *
 */
