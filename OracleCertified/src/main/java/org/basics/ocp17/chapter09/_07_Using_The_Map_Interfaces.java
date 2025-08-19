package org.basics.ocp17.chapter09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class _07_Using_The_Map_Interfaces {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet()){
            System.out.print(key + ",");  // koala,giraffe,lion,
        }
        System.out.println();
        System.out.println("--------------------");

        Map<String, String> map2 = new TreeMap<>();
        map2.put("koala", "bamboo");
        map2.put("lion", "meat");
        map2.put("giraffe", "leaf");
        String food2 = map.get("koala");    // bamboo
        for (String key : map2.keySet()){
            System.out.print(key + ",");  // giraffe,koala,lion
        }

        System.out.println();
        System.out.println("--------------------");

        // System.out.println(map2.contains("lion"));       // DOES NOT COMPILE
        System.out.println(map2.containsKey("lion"));       // true     (Böyle bir key olduğu için true döner)
        System.out.println(map2.containsValue("lion"));     // false    (Böyle bir value olmadığı için false döner)
        System.out.println(map2.size());                    // 3
        map2.clear();
        System.out.println(map2.size());                    // 0
        System.out.println(map2.isEmpty());                 // true

        System.out.println("--------------------");

        Map<Integer, Character> map3 = new HashMap<>();
        map3.put(1, 'a');
        map3.put(2,'b');
        map3.put(3,'c');
        map3.forEach((k,v) -> System.out.println(v));   // Bu şekilde map için foreach methodunu kullanabiliriz.

        System.out.println("--------------------");

        Map<Integer, Character> map4 = new HashMap<>();
        map4.put(1, 'd');
        map4.put(2,'e');
        map4.put(3,'f');
        map4.values().forEach(System.out::println);                     // Bu şekilde de foreach methodunu kullanabiliriz.

        System.out.println("--------------------");

        Map<Integer, Character> map5 = new HashMap<>();
        map5.put(1, 'g');
        map5.put(2,'h');
        map5.put(3,'ı');
        map5.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));      // Bu şekilde de foreach methodunu kullanabiliriz.

        System.out.println("--------------------");

        Iterator<Integer> iterator = map5.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key + ":" + map5.get(key));
        }

        System.out.println("--------------------");

        Map<Character, String> map6 = new HashMap<>();
        map6.put('x', "spot");
        System.out.println("X marks the " + map6.get('x'));
        System.out.println("X marks the " + map6.getOrDefault('x', ""));
        System.out.println("Y marks the " + map6.get('y'));
        System.out.println("Y marks the " + map6.getOrDefault('y', ""));

        System.out.println("--------------------");

        Map<Integer, Integer> map7 = new HashMap<>();
        map7.put(1,2);
        map7.put(2,4);
        Integer original = map7.replace(2,10);          // 4
        System.out.println("original : " + original);   // original : 4
        System.out.println(map7);                       // {1=2, 2=10}
        Integer notFound = map7.replace(5,20);
        System.out.println(notFound);                   // null
        System.out.println(map7);                       // {1=2, 2=10}
        map7.put(5,20);
        System.out.println(map7);                       // {1=2, 2=10, 5=20}
        map7.replaceAll((k,v) -> k + v);
        System.out.println(map7);                       // {1=3, 2=12, 5=25}

        System.out.println("--------------------");

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");       // Map'te olmadığı için eklenir.
        favorites.putIfAbsent("Tom", "Tram");       // Tom key'i için value değeri "null" olduğu için "Tram" değerini ekler.
        System.out.println(favorites);  // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
    }

}

/**
 *
 * --------------- Calling Basic Methods ---------------
 * Map te kulllanılan basit methodların kullanımı yukarıdaki map ve map2 örneklerinde olduğu gibidir.
 *
 * --------------- Iterating through a Map -------------
 * Map in elemanları üzerinde dönmek için "foreach" kullanılır.
 * Map interface'i için "foreach" methodu iki tane parametre almaktadır (BiConsumer).
 *
 * --------------- Getting Values Safely ---------------
 * get()            : get methoduna key verdiğimizde geriye value dönmektedir. Eğer verdiğimiz key a karşılık bir key-value pair yoksa geriye null döner.
 * getOrDefault()   : verilen key e karşılık key-value pair ini bulamaz ise geriye default olarak verdiğimiz elemanı dönecektir.
 *
 * --------------- Replacing Values --------------------
 * replace() ve replaceAll() methodu ile "value" değerlerini değiştirebiliyoruz.
 * replace()    : İki tane parametre alır. Birinci parametre "key" değeridir ikinci parametre ise güncellemek istediğimiz "value" değeridir.
 * replace() methodu için verdiğimiz key map içinde yer alıyorsa ikinci parametre (yani value değeri) ile value değeri güncellenir. Geriye orijinal değeri döner (previous değeri).
 * replace() methodu için eğer verilen key map te yoksa geriye null değer döner.
 * replaceAll() methodu BiFunction parametresi alır. İlgili function'a göre map'teki value değerini günceller.
 *
 * --------------- Putting if Absent --------------------
 * putIfAbsent() : Eğer eleman yoksa ilgili entry'i ekler.
 *
 */
