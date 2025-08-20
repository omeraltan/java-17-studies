package org.basics.ocp17.chapter09;

import java.util.*;

public class _09_Using_The_Map_Interfaces {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("key1", "value1");
        hashMap.put("key1", "value1-new-value");                        // Burada key1 key'inini value değerini update etmiş olur.

        System.out.println(hashMap.put("key2", "value2"));              // Burada value2 değeri map te yeralmadığı için null dönecektir.
        System.out.println(hashMap.put("key2", "value2-new-value"));    // Burada value değeri güncellenecektir ve value2 dönecektir.

        System.out.println(hashMap);

        hashMap.put("key4", null);                                      // HashMap value değeri null alabilir.
        hashMap.put("key5", null);                                      // HashMap value değeri null alabilir.
        hashMap.put(null, null);                                        // HashMap key value pair null alabilir.

        System.out.println(hashMap);

        System.out.println("--------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("key1", 10);
        linkedHashMap.put("key2", 20);
        linkedHashMap.put("key3", 30);
        linkedHashMap.put("key4", 40);
        linkedHashMap.put("key5", 50);
        linkedHashMap.put("key6", 60);
        linkedHashMap.put("key7", 70);
        linkedHashMap.put("key8", 80);
        linkedHashMap.put("key9", 90);
        linkedHashMap.put("key10", 100);

        linkedHashMap.put(null, -1);
        linkedHashMap.put("invalid", null);

        System.out.println(linkedHashMap);

        System.out.println("--------------------");

        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("key1", 10);

        // hashtable.put("key2", null);    // NullPointerException

        // hashtable.put(null, 20);        // NullPointerException

        System.out.println("--------------------");

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(100, "value1");
        treeMap.put(10, "value2");
        treeMap.put(50, "value3");
        treeMap.put(40, "value4");
        treeMap.put(60, "value5");
        treeMap.put(5, "value6");

        // treeMap.put(null, "NullPointerException");

        System.out.println(treeMap);



    }

}

/**
 *
 * HashMap          : key-value pair null değeri alabilir.
 * LinkedHashMap    : HashMap sınıfını kalıtır ve elemanları eklediğimiz sırada tutar. Ayrıca null key ve value ya izin verir.
 * Hashtable        : Hashtable'ın "t" si küçüktür. Hashtable'ın methodları synchronized özellik gösterir. Hashtable'a null key veya null value ekleyemeyiz.
 * TreeMap          : Sorted bir yapıya sahiptir. key'e göre sıralama yapacaktır. TreeMap'e null "key" eklenemez. TreeMap'e null "value" eklenebilir.
 *
 *
 */
