package org.basics.ocp17.chapter09;

import java.util.*;

public class _01_Using_Common_Collection_APIs {

    public static void main(String[] args) {

        // List<> list = new ArrayList<Integer>(); // -> DOES NOT COMPILE (Tip Bilgisi Sol Tarafta Tanımlanmak Zorundadır. Sağ tarafta tanımlanmasına artık gerek yoktur.).

        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow"));    // true
        System.out.println(list.add("Sparrow"));    // true

        System.out.println("--------------------");

        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));     // true
        System.out.println(set.add("Sparrow"));     // false

        System.out.println("--------------------");

        System.out.println(list);                   // [Sparrow, Sparrow]
        System.out.println(set);                    // [Sparrow]

        System.out.println("--------------------");

        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));   // false
        System.out.println(birds.remove("hawk"));       // true
        System.out.println(birds);                         // [hawk]

        System.out.println("--------------------");

        Collection<String> birds2 = new ArrayList<>();
        birds2.add("hawk");
        birds2.add("eagle");
        System.out.println(birds2.remove("cardinal"));  // false
        System.out.println(birds2.remove("hawk"));      // true
        System.out.println(birds2);                        // [hawk]

        System.out.println("--------------------");

        Collection<String> birds3 = new ArrayList<>();
        System.out.println(birds3.isEmpty());              // true
        System.out.println(birds3.size());                 // 0
        birds3.add("hawk");
        birds3.add("hawk");
        System.out.println(birds3.isEmpty());              // false
        System.out.println(birds3.size());                 // 2

        System.out.println("--------------------");

        Collection<String> birds4 = new ArrayList<>();
        birds4.add("hawk");                                // [hawk]
        birds4.add("hawk");                                // [hawk, hawk]
        System.out.println(birds4.isEmpty());              // false
        System.out.println(birds4.size());                 // 2
        birds4.clear();                                    // []
        System.out.println(birds4.isEmpty());              // true
        System.out.println(birds4.size());                 // 0

        System.out.println("--------------------");

        Collection<String> birds5 = new ArrayList<>();
        birds5.add("hawk");
        System.out.println(birds5.contains("hawk"));       // true
        System.out.println(birds5.contains("robin"));      // false

        System.out.println("--------------------");

        Collection<String> list2 = new ArrayList<>();
        list2.add("Magician");
        list2.add("Assistant");
        System.out.println(list2);                          // [Magician, Assistant]
        list2.removeIf(s -> s.startsWith("A"));
        System.out.println(list2);                          // [Magician]

        Collection<String> set2 = new HashSet<>();
        set2.add("Wand");
        set2.add("");
        set2.removeIf(String::isEmpty);                     // s -> s.isEmpty()
        System.out.println(set2);                           // [Wand]

        System.out.println("--------------------");

        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));

        System.out.println("--------------------");

        var list3 = List.of(1,2);
        var list4 = List.of(2,1);
        var list5 = List.of(1,2);

        var set3 = Set.of(1,2);
        var set4 = Set.of(2,1);

        System.out.println(list3.equals(list4));                // false
        System.out.println(set3.equals(set4));                  // true
        System.out.println(list3.equals(set3));                 // false
        System.out.println(list3.equals(list5));                // true

        System.out.println("--------------------");

        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0);                                 // NullPointerException


    }

}

class InvalidUse{
    // void use(List<> data);   // DOES NOT COMPILE (Tip Bilgisi sağ Tarafta Tanımlanmak Zorundadır.).
}

/**
 *
 * Bir collection "group of objection" olarak ifade edilen bir veri yapısıdır.
 * Genel olarak aynı tip verileri tuttuğumuz bir yapıdır.
 * Collection framework'ünde 4 tane ana interface yer almaktadır. Bunlar: "List", "Set", "Queue" ve "Map" şeklindedir.
 * List     : Duplicate elemana izin verir yani birden fazla aynı elemana izin verecektir. Ordered: yani sıralı bir şekilde elemanları tutacaktır ve index base bir yapıya sahiptir.
 * Set      : Duplicate elemanlara izin vermez ve elemanlar ordered bir yapıda tutulmaz. Index tabanlı bir erişim söz konusu değildir.
 * Queue    : Elamanlarını belirli bir sırada işlenmek için sıralayan bir koleksiyon yapısıdır. Dequeue ise queue'nin bir sub interface'idir. Her iki uçtada erişime izin veren bir veri yapısıdır yani başlangıç ve sona ekleme çıkartma yapabiliriz.
 * Map      : "key" ve "value" çifti bulunmaktadır. Duplicate key'e izin verilmez.
 * Bu interface'ler java.util paketinde yer alırlar.
 *
 *                                                      Collection (java.util)
 *                                                          |
 *                     -------------------------------------------------------------------------                                    Map (java.util)
 *                     |                                    |                                   |                       ---------------------------
 *                    List (java.util)                    Queue (java.util)                    Set (java.util)         |                          |
 *             -------------------                  --------------------                ------------------           HashMap                  TreeMap
 *             |                  |                 |                   |               |                 |
 *          ArrayList        LinkedList          LinkedList          Deque          HashSet             TreeSet
 *
 *
 * ----- Using The Diamond Operator -----
 * Küçüktür, büyüktür olarak ifade ettiğimiz operatöre denir ("< >").
 * Örnek: List<Integer> list = new ArrayList<Integer>();
 * Diamond operatör ile ("< >") artık kodun sağ tarafında tip bilgisi tanımlanmasına gerek yoktur.
 * Örnek: List<Integer> list = new ArrayList<>();
 * Tip bilgisi sol taraftan kaldırılamaz.
 *
 * ----- Adding Data -----
 * Collection interface'inde "add" methodu yer almaktadır.
 * public boolean add (E element); bu add methodunda "E" ifadesi generic bir ifadeyi temsil etmektedir.
 * Bizim listemiz bir Integer tuttuğunda da add methodu çağırılır veya String tuttuğunda da add methodu çağırılır yada bambaşka bir Object titpinde bir şey tutulduğunda add methodu çağırılmaktadır.
 *
 * ----- Removing Data -----
 * Elemanların silinmesi işleminde, Collection interface'inde  "remove" methodu yer almaktadır.
 * public boolean remove (Object object);
 * Bu method Object tipinde bir parametre almakta ve geriye boolean dönmektedir.
 * Collection'da eşleşen bir Object varsa bu Object'i kaldıracaktır. Geriye silinen değeri döndürür.
 *
 * ----- Counting Elements -----
 * isEmpty() ve size() method ları Collection'da kaç tane elemanın olduğunu gösterir. Method yapıları şu şekildedir:
 * public boolean isEmpty();    -> Eğer Collection boş ise true dolu ise false dönecektir.
 * public int size();           -> Collection'da yer alan eleman sayısını dönecektir.
 *
 * ----- Clearing the Collection -----
 * Clear methodu, collection da yer alan tüm elemanları discard edecektir yani tüm elemanları temizleyecektir.
 * public void clear();
 *
 * ----- Check Contents -----
 * Contains methodu ilgili objenin Collection da yer alıp almadığına bakacaktır.
 * Geriye boolean tipinde bir parametre dönmekte ve Object tipinde bir parametre almaktadır.
 * public boolean contains(Object object);
 * contains() methodu arka tarafta equals() methodunu çağırmaktadır.
 *
 * ----- Removing With Conditions -----
 * removeIf methodu, collection'da yer alan ilgili şarta uyan elemanları collectiondan temizleyecektir.
 * removeIf methodu Predicate tipinde bir parametre almaktadır ve geriye boolean dönmektedir.
 * public boolean removeIf(Predicate<? super E> filter);
 *
 * ----- Iterating -----
 * forEach methodunu Collection lar ile birlikte kullanmaktayız.
 * Foreach methodu Consumer tipinde bir parametre alır ve geriye bir değer dönmez (void dönüş tipine sahiptir).
 * Collection'lardaki elemanlar üzerinde dönmek için kullanışlı bir methoddur.
 * public void forEach(Consumer<? super T> action);
 *
 * ----- Determining Equality -----
 * equals methodu Collection larda override edilmiştir yani çeşitli custom implementasyonlara sahiptir.
 * Bu implamantosyonlar çeşitlilik gösterebilir. Örneğin; ArrayList ordered sırayı kontrol ederken HashSet için sıra önemli değildir.
 * HashSet yapısı unordered bir yapıya sahiptir.
 *
 * ----- Unboxing nulls -----
 * Collectionlar ile çalışırken null pointer exception alma ihtimaliniz vardır. Bu unboxing durumunda ortaya çıkar.
 * primitive tipler null değer tutamazlar. Bu nedenle aşağıdaki kodumuz çalışma zamanında hata verecektir.
 *         var heights = new ArrayList<Integer>();
 *         heights.add(null);
 *         int h = heights.get(0);
 *
 *
 *
 */
