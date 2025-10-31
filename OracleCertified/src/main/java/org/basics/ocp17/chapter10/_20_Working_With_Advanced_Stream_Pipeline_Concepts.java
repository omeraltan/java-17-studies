package org.basics.ocp17.chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class _20_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
        Spliterator<String> originalBagOfFood = stream.spliterator();
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::print);       // bird-bunny-cat-

        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::print);             // dog-
        jillsBag.forEachRemaining(System.out::print);       // fish-

        originalBagOfFood.forEachRemaining(System.out::print);

        System.out.println();
        System.out.println("--------------------");

        /*
             Bu kodun yaptığı:
             - Stream.iterate(1, n -> ++n): 1, 2, 3, ... şeklinde artan sonsuz bir akış üretir.
             - .spliterator(): Bu akış üzerinde gezinmek için bir Spliterator elde eder (originalBag).
             - originalBag.trySplit(): Spliterator’ı yaklaşık iki parçaya bölmeye çalışır ve ayrılan kısmı
               temsil eden yeni bir Spliterator (newBag) döndürür. Bölünemiyorsa null dönebilir.
             - newBag.tryAdvance(System.out::print) x3: newBag’den art arda üç elemanı (varsa) tek tek
               tüketip yazdırır. Her çağrı bir sonraki elemanı işler.

             - Stream.iterate ile üretilen sonsuz akışların Spliterator’ı çoğu durumda bölünemez;
               trySplit() null döndürebilir. Bu durumda newBag üzerinde işlem yapmak NullPointerException’a yol açar.
             - tryAdvance bir eleman işleyebilirse true, eleman kalmadıysa false döner.
             - trySplit ile newBag’e aktarılan öğeler originalBag’den çıkar; originalBag kalan kısmı temsil eder.
            */

        var originalBag = Stream.iterate(1, n -> ++n)
            .spliterator();
        Spliterator<Integer> newBag = originalBag.trySplit();

        newBag.tryAdvance(System.out::print);
        newBag.tryAdvance(System.out::print);
        newBag.tryAdvance(System.out::print);
        System.out.println();

        System.out.println("--------------------");

        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Muhammed");
        names.add("Mustafa");
        names.add("Mahmut");

        Spliterator<String> spliterator = names.spliterator();

        boolean result = spliterator.tryAdvance(System.out::println);
        System.out.println(result);
        spliterator.tryAdvance(System.out::println);
        System.out.println(spliterator);
        System.out.println(names);

        System.out.println("--------------------");

        List<String> values = new ArrayList<>();
        values.add("one");
        values.add("two");
        values.add("three");
        values.add("four");
        values.add("five");
        values.add("six");
        values.add("seven");
        values.add("eight");
        values.add("nine");
        values.add("ten");

        Spliterator<String> spliteratorForNumbers = values.spliterator();

        long estimateSize = spliteratorForNumbers.estimateSize();
        long exactSizeIfKnown = spliteratorForNumbers.getExactSizeIfKnown();

        System.out.println("estimateSize : " + estimateSize);
        System.out.println("exactSizeIfKnown : " + exactSizeIfKnown);

        System.out.println("--------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9};

        Spliterator<Integer> s1 = Arrays.spliterator(arr);
        Spliterator<Integer> s2 = s1.trySplit();

        System.out.println("spliterator 1");
        s1.forEachRemaining(System.out::println);

        System.out.println("spliterator 2");
        s2.forEachRemaining(System.out::println);


    }

}

/**
 *
 * -------------------- Using A Spliterator --------------------
 * Spliterator interface'i java.util paketinde yer alır.
 * JDK 1.8 ile eklenmiştir.
 * Spliterator'lar, bir kaynağın elemanlarını tek tek dolaşmak için kullanılır.
 * Kaynak: Array, Collection yada Stream olabilir.
 * Özellikle parallel traverser için verimlidir.
 * -------------------- Spliterator Methods ----------------------------------------
 * Method                                   Description
 * ---------------------------------------------------------------------------------
 * Spliterator<T> trySplit()                Returns Spliterator containing ideally half of the data, which is removed from current Spliterator.
 *                                          This method can be called multiple times and will eventually return null when data is no longer splittable.
 *                                          (Veriyi mümkünse yarıya böler ve yeni bir Spliterator döndürür.)
 *                                          (Yeni Spliterator ideal olarak verinin yarısını içerir ve mevcut Spliterator'dan bu kısım çıkarılır. Veri daha fazla bölünemiyorsa null döner.)
 * void forEachRemaining(Consumer<T> c)     Processes remaining elements in Spliterator.
 *                                          (Spliterator'da kalan tüm elemanları işler. Parametre olarak bir Consumer alır ve her elemana bu işlemi uygular.)
 * boolean tryAdvance(Consumer<T> c)        Processes single element from Spliterator if any remain. Returns whether element was processed.
 *                                          (Spliterator'da eleman varsa bir sonraki elemanı işler. Consumer ile verilen işlemi uygular. Eleman işlendi ise true, işlenecek eleman kalmadıysa false döner.)
 *
 */
