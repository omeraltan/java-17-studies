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

    }

}

/**
 *
 * --------------- Merging Data -------------------
 * merge() methodu BiFunction parametresi alır. Dolayısıyla binary operatörü burada kullanabiliriz
 * merge() methodu value kısmını güncellemek için bir logic sunar geriye dönen değer merge methodu sonrasında ortaya çıkan sonuç değeridir.
 * Yani ilgili key için güncel olan value bilgisidir.
 * mere() methodu eğer null değer varsa yada missing key varsa bu durumda da bir logic'e sahip olacaktır. Burada BiFunction'ı çağırmaz verilen yeni değeri kullanır.
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
