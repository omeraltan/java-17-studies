package org.basics.ocp6._41_Map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapNotes {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(4, "E");
        map.put(5, null); // -> HashMap te "value" null değer alabilir.
        System.out.println(map);
        // "Key" unique olmadığında yeni değer eski değeri override eder.

        for (Integer key : map.keySet()) {
            System.out.println("key : " + key + " , value : " + map.get(key));
        }

        System.out.println("--------------------------");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        linkedHashMap.put(3, "C");
        linkedHashMap.put(4, "D");
        linkedHashMap.put(4, "E");
        linkedHashMap.put(5, null);
        for(Integer key : linkedHashMap.keySet()){
            System.out.println("key : " + key + " , value : " + map.get(key));
        }

        // Elemanlar eklenildiği sırada yazılır.

        System.out.println("--------------------------");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(11, "A");
        treeMap.put(22, "B");
        treeMap.put(1, "C");
        treeMap.put(14, "D");
        treeMap.put(74, "E");
        treeMap.put(52, null);
        for(Integer key : treeMap.keySet()){
            System.out.println("key : " + key + " , value : " + treeMap.get(key));
        }

        // TreeMap te elemanlar key'e göre sıralanır.
        // Key olarak kullanılan sınıf Comparable olmalıdır.
        // Integer IS-A Comparable
        // String IS-A Comparable

        System.out.println("--------------------------");



    }

}

/**
 *
 * K -> Key
 * V -> Value
 * E -> Element
 *
 * java.util.Map
 * Hashtable
 * HashMap
 * LinkedHashMap
 * TreeMap
 *
 * Map in key i unique olmalıdır (unique ten kasıt equals methodudur.).
 * Value duplicate olabilir.
 *
 *
 */
