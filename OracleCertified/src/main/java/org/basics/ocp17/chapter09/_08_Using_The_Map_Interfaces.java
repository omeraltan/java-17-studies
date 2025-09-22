package org.basics.ocp17.chapter09;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class _08_Using_The_Map_Interfaces {

    public static void main(String[] args) {

        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        System.out.println(favorites);

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites);  // {Tom=Skyride, Jenny=Bus Toor}
        System.out.println(jenny);      // Bus Tour
        System.out.println(tom);        // Skyride

        System.out.println("--------------------");

        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Sam", null);
        favorites2.merge("Tom", "Skyride", mapper);         // Burada "Tom" key'i olmadığı için "Tom" key değeri ve "Skyride" value değeri kaydolacaktır.
        favorites2.merge("Sam", "Skyride", mapper);         // Sam key'i için value değeri olmadığı için Skyride value değeri Sam key'i için kaydedilecektir.
        System.out.println(favorites2); // {Tom=Skyride, Sam=Skyride}

        System.out.println("--------------------");

        BiFunction<String, String, String> mapper2 = (v1, v2) -> null;  // Eğer merge methodu bir şekilde geriye null değeri dönecek olursa bu durumda ilgili key map'ten çıkartılacaktır.
        Map<String, String> favorites3 = new HashMap<>();
        favorites3.put("Jenny", "Bus Tour");
        favorites3.put("Tom", "Bus Tour");

        favorites3.merge("Jenny", "Skyride", mapper2);
        favorites3.merge("Sam", "Skyride", mapper2);
        System.out.println(favorites2);                             // {Tom=Bus, Sam=Skyride}

        System.out.println("--------------------");

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 100);
        scores.put("Ayşe", 150);

        scores.merge("Ali", 50, (existing, newValue)-> existing + newValue);
        System.out.println(scores);
        scores.merge("Mehmet", 75, (existingValue, newValue) -> existingValue + newValue);
        System.out.println(scores);

        System.out.println("--------------------");

        Map<String, String> temp = new HashMap<>();
        temp.put("geçici1", "değer1");
        temp.put("geçici2", "değer2");

        temp.merge("geçici1", "yeni", (existing, newValue) -> null);
        System.out.println(temp);

        System.out.println("--------------------");

        Map<String, Integer> maxValues = new HashMap<>();
        maxValues.put("A", 10);
        maxValues.put("B", 5);

        maxValues.merge("A", 15, (existing, newValue) -> Math.max(existing, newValue));
        maxValues.merge("B", 3, (existing, newValue) -> Math.max(existing, newValue));
        maxValues.merge("C", 20, (existing, newValue) -> Math.max(existing, newValue));

        System.out.println(maxValues);


    }

}

class MapMergeBehaviorExamples {
    public static void main(String[] args) {

        // DURUM 1: Key map'te yoksa - BiFunction çağrılmaz, value parametresi doğrudan eklenir
        System.out.println("=== DURUM 1: Key Map'te Yoksa ===");
        Map<String, Integer> map1 = new HashMap<>();

        // "key1" map'te yok, BiFunction çağrılmaz, 100 değeri doğrudan eklenir
        map1.merge("key1", 100, (existing, newValue) -> {
            System.out.println("Bu satır çalışmaz çünkü key yok!");
            return existing + newValue;
        });

        System.out.println("Key yokken merge: " + map1); // {key1=100}

        // DURUM 2: Key'in değeri null ise - BiFunction çağrılmaz, value parametresi kullanılır
        System.out.println("\n=== DURUM 2: Key'in Değeri Null İse ===");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("key2", null);

        // "key2" null değere sahip, BiFunction çağrılmaz, 200 değeri kullanılır
        map2.merge("key2", 200, (existing, newValue) -> {
            System.out.println("Bu satır çalışmaz çünkü existing null!");
            return existing + newValue;
        });

        System.out.println("Null değerle merge: " + map2); // {key2=200}

        // DURUM 3: Key'in değeri null değil ve BiFunction null döndürürse - Key kaldırılır
        System.out.println("\n=== DURUM 3: BiFunction Null Döndürürse ===");
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("key3", 300);
        map3.put("key4", 400);

        // "key3" için BiFunction null döndürür, key kaldırılır
        map3.merge("key3", 50, (existing, newValue) -> {
            System.out.println("key3 için BiFunction çalıştı: " + existing + " + " + newValue);
            return null; // null döndür, key kaldırılsın
        });

        // "key4" için BiFunction null olmayan değer döndürür
        map3.merge("key4", 50, (existing, newValue) -> {
            System.out.println("key4 için BiFunction çalıştı: " + existing + " + " + newValue);
            return existing + newValue; // 450 döndür
        });

        System.out.println("Null döndürme sonrası: " + map3); // {key4=450}

        // DURUM 4: Key'in değeri null değil ve BiFunction null olmayan değer döndürürse
        System.out.println("\n=== DURUM 4: BiFunction Null Olmayan Değer Döndürürse ===");
        Map<String, String> map4 = new HashMap<>();
        map4.put("isim", "Ali");
        map4.put("soyisim", "Veli");

        // Mevcut değerle yeni değeri birleştir
        map4.merge("isim", " Can", (existing, newValue) -> {
            System.out.println("isim için BiFunction çalıştı: '" + existing + "' + '" + newValue + "'");
            return existing + newValue;
        });

        map4.merge("soyisim", " Demir", (existing, newValue) -> {
            System.out.println("soyisim için BiFunction çalıştı: '" + existing + "' + '" + newValue + "'");
            return existing + newValue;
        });

        System.out.println("String birleştirme sonrası: " + map4); // {isim=Ali Can, soyisim=Veli Demir}

        // KARMAŞIK ÖRNEK: Tüm durumları içeren
        System.out.println("\n=== KARMAŞIK ÖRNEK: Tüm Durumlar ===");
        Map<String, Integer> complexMap = new HashMap<>();

        // 1. Yeni key ekle (BiFunction çağrılmaz)
        complexMap.merge("yeni", 10, (e, n) -> {
            System.out.println("Yeni key için BiFunction çalışmaz!");
            return e + n;
        });

        // 2. Null değerli key (BiFunction çağrılmaz)
        complexMap.put("nullKey", null);
        complexMap.merge("nullKey", 20, (e, n) -> {
            System.out.println("Null değer için BiFunction çalışmaz!");
            return e + n;
        });

        // 3. Mevcut değerle işlem yap (BiFunction çalışır)
        complexMap.put("mevcut", 30);
        complexMap.merge("mevcut", 5, (e, n) -> {
            System.out.println("Mevcut değer için BiFunction çalıştı: " + e + " + " + n);
            return e + n;
        });

        // 4. Key'i kaldır (BiFunction null döndürür)
        complexMap.put("kaldir", 40);
        complexMap.merge("kaldir", 10, (e, n) -> {
            System.out.println("Kaldırma için BiFunction çalıştı: " + e + " + " + n);
            return null; // Key kaldırılır
        });

        System.out.println("Karmaşık örnek sonucu: " + complexMap);
        System.out.println("Map boyutu: " + complexMap.size());
    }
}

/**
 *
 * --------------- Merging Data -------------------
 * merge() methodu BiFunction parametresi alır. Dolayısıyla binary operatörü burada kullanabiliriz
 * merge() methodu value kısmını güncellemek için bir logic sunar geriye dönen değer merge methodu sonrasında ortaya çıkan sonuç değeridir.
 * Yani ilgili key için güncel olan value bilgisidir.
 * merge() methodu eğer null değer varsa yada missing key varsa bu durumda da bir logic'e sahip olacaktır. Burada BiFunction'ı çağırmaz verilen yeni değeri kullanır.
 *
 * ----------------------------------------- BEHAVIOUR OF THE "merge()" METHOD -----------------------------------------
 * If the requested key_________            And mapping function returns__________          Then:
 * ---------------------------------------------------------------------------------------------------------------------
 * Has a null value in map                  N/A (mapping function not called)               Update key's value in map with value parameter
 * Has a non-null value in map              null                                            Remove key from map
 * Has a non-null value in map              A non-null value                                Set key to mapping function result
 * Is not in map                            N/A (mapping function not called)               Add key with value parameter to map directly without calling mapping function
 *
 *
 *
 */
