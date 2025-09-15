package org.basics.ocp17.chapter09;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _06_Using_The_Map_Interfaces {

    public static void main(String[] args) {

        Map<String, String> map1 = Map.of("key1", "value1", "key2", "value2");
        Map<String, Integer> map2 = Map.of("key1", 10, "key2", 20);
        // Map<String, Integer> map3 = Map.of("key1", 10, "key2"); // DOES NOT COMPILE
        // HashMap<String, Integer> map4 = Map.of("key1", 10, "key2", 20); // DOES NOT COMPILE (Map, HashMap'e assign edilemez.)

        System.out.println(map1.getClass());
        System.out.println(map1);
        System.out.println(map2);

        // map1.put("immutable", "UnsupportedOperationException"); // UnsupportedOperationException
        // map1.remove("key1");                                    // UnsupportedOperationException
        // map1.remove("not-a-valid-key");                         // UnsupportedOperationException
        // map1.replace("not-a-valid-key", "new-value");           // UnsupportedOperationException

        Map<String, String> map5 = Map.of("key1", "value1", "key2", "value2");
        Map<String, String> copiedMap = Map.copyOf(map5);

        System.out.println(map5);
        System.out.println(copiedMap);

        // copiedMap.put("immutable", "UnsupportedOperationException");    // UnsupportedOperationException
        // copiedMap.remove("key1");                                       // UnsupportedOperationException

        Map<String, String> map6 = Map.ofEntries(
            Map.entry("key1", "value1"),
            Map.entry("key2", "value2")
        );

        System.out.println(map6.getClass());
        System.out.println(map6);

        // map6.put("immutable", "UnsupportedOperationException"); // UnsupportedOperationException



    }

}

/**
 *
 * Map, Collection interface'ini kalıtmaz.
 * Map veri yapısı "key" ve "value" çiftinden oluşur.
 * Bir Map'in key'leri unique olmak zoeundadır. duplicate olamaz.
 * İki Object için equals true olduğunda bunlar bir Map'te key, duplicate olacaktır.
 * Map'in value'ları ise duplicate olabilir.
 * Map'in çeşitli implemantasyonları vardır. Bunlar: HashMap, LinkedHashMap, TreeMap, HastTable gibi sınıflardır.
 * Map.of() ve Map.copyOf() methodları: List ve Set interface'lerinde olduğu gibi of ve copyOf methodlarını bir Map oluşturmak için kullanabiliriz.
 * List ve Set interface'inde olduğu gibi aynı şekilde oluşturduğumuzda immutable özelliğe sahip olacaktır. Dolayısıyla herhangi bir modifiye işlemi yapamayız.
 * Map.of("key1", "value1", "key2", "value2"); -> Bu işlem değiştirilemez.
 * Map.ofEntries(
 *      Map.entry("key1", "value1"),
 *      Map.entry("key2", "value2"));
 * Yukarıdaki şekilde de bir Map oluşturulabilir.
 * Map.of(); ile oluşturduğumuz bir Map'e put, remove ve replace işlemi gerçekleştiremeyiz (immutable).
 * Map.copyOf(); ile kopyaladığımız bir Map'e put, remove ve replace işlemi gerçekleştiremeyiz (immutable).
 * Map.ofEntries(); ile oluşturduğumuz bir Map'e put, remove ve replace işlemi gerçekleştiremeyiz (immutable).
 *
 * --------------- Comparing Map Implementations ---------------
 * Map interface'inin çeşitli implemantasyonları vardır. En çok kullanılan implemantasyon sınıfı HashMao'tir.
 * HashMap'te HashSet gibi hash tablosundan faydalanacaktır. Dolayısıyla hashCode methodunu kullanacaktır.
 * HashMap key'leri bir hash tablosunda saklar. HashMap'e eleman eklemek ve elemana ulaşmak son derece hızlı olacaktır.
 * Dezavantaj olarak HashMap'e eklediğimiz elemanlar sıralı bir şekilde tutulmazlar.
 * Elemanlar eklenilen sırada tutulmazlar, unpredictable'dır. Önceden bilinemezler.
 * Bununla birlikte, bir Map yapısı kullandığımızda genellikle elemanların eklendiği sırada tutulmasını istemeyiz.
 * Eğer böyle bir ihtiyacımız olursa bu durumda "LinkedHashMap" veri yapısını kullanabiliriz.
 * LinkedHashMap'te elemanlar eklendiği sırada tutulacaktır.
 * LinkedHashMap sınıfı HashMap sınıfını kalıtmaktadır.
 * HashMap ve LinkedHashMap, null-key ve null-value'lara izin verir.
 * HashMap, LinkedHashMap'e göre daha hızlı çalışır.
 * HashMap bir "bucket" yapısı kullanır. LinkedHashMap ise "double-linked-bucket" yapısı kullanmaktadır. Bu nedenle LinkedHashMap daha fazla memory'e ihtiyaç duyar.
 * HashTable null-key ve null-value'lara izin vermez. HashTable methodları senkronize özelliğe sahiptir. Bu nedenle HashTable, Hashmap'e göre daha yavaş çalışacaktır.
 * TreeMap sorted özelliğe sahiptir. Yani key'ler sorted olacaktır.
 * TreeMap null-key'e sahip olamaz.
 * Treemap NavigableMap interface'ini implement eder.
 * TreeMap için ekleme ve elemana erişim işlemi HashMap'e göre daha yavaş olacaktır.
 *
 * -------------------- Working With Map Methods -------------------------------------------------------------------------------------
 * Method                                                   Description
 * -----------------------------------------------------------------------------------------------------------------------------------
 * public void clear()                                      Removes all keys and values from map.                                                                       (Bütün map'i temizler)
 * public boolean containsKey(Object key)                   Returns whether key is in map.                                                                              (İlgili key Map'te yer alıyorsa true döner.)
 * public boolean containsValue(Object value)               Returns whether value is in map.                                                                            (İlgili value Map'te yer alıyorsa true döner.)
 * public Set<Map.Entry<K,V>> entrySet()                    Returns Set of key/value pairs.                                                                             (Bu method geriye Set döner ve key/value pair döner.)
 * public void forEach(BiConsumer<K key, V value>)          Loops through each key/value pair.
 * public V get(Object key)                                 Returns value mapped by key or null if none is mapped                                                       (Bir key verildiğinde value döner eğer bulamazsa null dönecektir.)
 * public V getOrDefault(Object key, V defaultValue)        Returns value mapped by key or default value if none is mapped.                                             (Bir key ve default değer verilir. Eğer ilgili key'i bulamazsa default değer dönülecektir.)
 * public boolean isEmpty()                                 Returns whether map is empty.
 * public Set<K> keySet()                                   Returns set of all keys.                                                                                    (Set olarak Map'in key'lerini döner.)
 * public V merge(K key, V value, Function(<V,V,V> func))   Sets value if key not set. Runs function if key is set, to determine new value. Removes if value is null.   (merge methodu key-value-function almakta ve bu işlemlere göre bir sonuç döner. Verilen fıunction'a göre key value üzerinde işlem gerçekleştirir.)
 * public V put(K key, V value)                             Adds or replaces key/value pair. Returns previous value or null.                                            (Map'e yeni bir anahtar-değer çifti ekler veya mevcut bir anahtarın değerini günceller. Bu metod hem ekleme hem de güncelleme işlemi yapar. Anahtar yoksa ekler, varsa değerini değiştirir.)
 * public V putIfAbsent(K key, V value)                     Adds value if key not present and returns null. Otherwise, returns existing value.                          (key-value alıp geriye value döner. Eğer ilgili keydeki eleman yoksa ekler.)
 * public V remove(Object key)                              Removes and returns value mapped to key, Returns null if none.
 * public V replace(K key, V value)                         Replaces value for given key if key is set. Returns original value or null if none.
 * public void replaceAll(BiFunction<K,V,V> func)           Replaces each value with results of function.
 * public int size()                                        Returns number of entries (key/value pairs) in map.
 * public Collection<V> values()                            Returns Collection of all values.
 *
 */
