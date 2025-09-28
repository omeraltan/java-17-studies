package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _19_Working_With_Generics {

    public static void main(String[] args) {

        // Deklerasyon şekilleri
        List<?> a = new ArrayList<String>();                    // Herhangi bir türü kabul eder, sadece okuma güvenli
        List<? extends Exception> a2 = new ArrayList<>();       // Exception veya alt sınıfları, sadece okuma güvenli
        List<? super Exception> a3 = new ArrayList<Object>();   // Exception veya üst sınıfları, yazma güvenli

        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        // printList(keywords);    // DOES NOT COMPILE (List<String> ifadesi Object'e assign edilemez.)

        System.out.println("--------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(42));
        // List<Object> objects = numbers;     // DOES NOT COMPILE (numbers bir List<Integer> olduğu için List<Object> e verilemez.)
        // objects.add("forty two");
        // System.out.println(numbers.get(1));

        System.out.println("--------------------");

        List<String> keywords2 = new ArrayList<>();
        keywords2.add("java");
        printList2(keywords2);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        printList2(numbers2);

        System.out.println("--------------------");

        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();         // Buradaki tip ArrayList olacaktır (x2 nin tipi).

        x1 = x2;

        // List<Object> x3 = x1;               // DOES NOT COMPILE

        List<Object> x4 = x2;

        ArrayList<Object> x5 = x2;
        // List<String> x6 = x2;               // DOES NOT COMPILE


    }

    public static void printList(List<Object> list){
        for (Object x : list){
            System.out.println(x);
        }
    }

    // Ekleme işlemi yapılmasına izin vermez (read-only)
    // Ekleme işlemi yapılmasına izin verseydi Integer listesine String, String listesine de Integer ekleme durumu olacağından yapılmasına izin verilmez.
    public static void printList2(List<?> list){
        for (Object x : list){
            System.out.println(x);
            // list.add(100);          // DOES NOT COMPILE
            // list.add("String");     // DOES NOT COMPILE
            list.add(null);            // Sadece null değer eklememize izin verir.
        }
    }

}

/**
 * Java Generic Wildcard Türleri ve Kullanım Örnekleri
 *
 * Bu sınıf Java'daki üç temel wildcard türünü açıklar:
 * 1. Unbounded wildcard (?)
 * 2. Upper bounded wildcard (? extends Type)
 * 3. Lower bounded wildcard (? super Type)
 */
class JavaGenericsWildcards {

    public static void main(String[] args) {

        // 1. UNBOUNDED WILDCARD
        demonstrateUnboundedWildcard();

        // 2. UPPER BOUNDED WILDCARD
        demonstrateUpperBoundedWildcard();

        // 3. LOWER BOUNDED WILDCARD
        demonstrateLowerBoundedWildcard();
    }

    /**
     * 1. UNBOUNDED WILDCARD (?)
     *
     * Açıklama:
     * - Herhangi bir türü temsil eder
     * - Sadece okuma (read-only) işlemleri için güvenlidir
     * - Yazma işlemleri güvenli değildir çünkü hangi tür olduğunu bilmiyoruz
     * - Collection'ın boş olup olmadığını kontrol etmek, boyutunu almak gibi işlemler için kullanılır
     */
    public static void demonstrateUnboundedWildcard() {

        // Farklı türlerdeki listeler
        List<String> stringList = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));

        // Unbounded wildcard kullanarak herhangi bir listeyi kabul eden metod
        System.out.println("String listesi: " + stringList + " -> Boyut: " + getSize(stringList));
        System.out.println("Integer listesi: " + intList + " -> Boyut: " + getSize(intList));
        System.out.println("Double listesi: " + doubleList + " -> Boyut: " + getSize(doubleList));
        System.out.println("String listesi boş mu? " + isEmpty(stringList));
        System.out.println("Integer listesi boş mu? " + isEmpty(intList));

        System.out.println();
    }

    /**
     * Unbounded wildcard ile liste boyutunu döndürür
     *
     * @param list Herhangi bir türdeki liste
     * @return Liste boyutu
     */
    public static int getSize(List<?> list) {
        return list.size();
    }

    /**
     * Unbounded wildcard ile listenin boş olup olmadığını kontrol eder
     *
     * @param list Herhangi bir türdeki liste
     * @return Liste boşsa true
     */
    public static boolean isEmpty(List<?> list) {
        return list.isEmpty();
    }

    /**
     * 2. UPPER BOUNDED WILDCARD (? extends Type)
     *
     * Açıklama:
     * - Belirtilen tür veya onun alt sınıflarını kabul eder
     * - Sadece okuma işlemleri güvenlidir
     * - Yazma işlemleri güvenli değildir (hangi alt tür olduğunu bilmiyoruz)
     * - Sayısal türler, exception hiyerarşisi gibi durumlarda çok kullanışlıdır
     */
    public static void demonstrateUpperBoundedWildcard() {

        // Number sınıfının alt sınıfları
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));
        List<Long> longList = new ArrayList<>(Arrays.asList(100L, 200L, 300L));

        // Number'ın alt sınıflarını kabul eden metodlar
        System.out.println("Integer listesi toplamı: " + calculateSum(intList));
        System.out.println("Double listesi toplamı: " + calculateSum(doubleList));
        System.out.println("Long listesi toplamı: " + calculateSum(longList));

        // Exception hiyerarşisi örneği
        List<RuntimeException> runtimeList = new ArrayList<>();
        List<IllegalArgumentException> illegalList = new ArrayList<>();

        System.out.println("RuntimeException listesi boyutu: " + getExceptionListSize(runtimeList));
        System.out.println("IllegalArgumentException listesi boyutu: " + getExceptionListSize(illegalList));

        System.out.println();
    }

    /**
     * Number'ın alt sınıflarını kabul eden toplam hesaplama metodu
     *
     * @param numbers Number veya alt sınıflarından oluşan liste
     * @return Toplam değer
     */
    public static double calculateSum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    /**
     * Exception'ın alt sınıflarını kabul eden boyut alma metodu
     *
     * @param exceptions Exception veya alt sınıflarından oluşan liste
     * @return Liste boyutu
     */
    public static int getExceptionListSize(List<? extends Exception> exceptions) {
        return exceptions.size();
    }

    /**
     * 3. LOWER BOUNDED WILDCARD (? super Type)
     *
     * Açıklama:
     * - Belirtilen tür veya onun üst sınıflarını kabul eder
     * - Yazma işlemleri güvenlidir (belirtilen tür veya üst türlerini ekleyebiliriz)
     * - Okuma işlemleri Object türünde döner (çünkü hangi üst tür olduğunu bilmiyoruz)
     * - Collection'lara eleman ekleme, kopyalama işlemlerinde kullanılır
     */
    public static void demonstrateLowerBoundedWildcard() {

        // Farklı türlerdeki listeler
        List<Object> objectList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        // Integer değerleri ekleme
        addNumbers(objectList, 1, 2, 3);
        addNumbers(numberList, 4, 5, 6);
        addNumbers(integerList, 7, 8, 9);

        System.out.println("Object listesi: " + objectList);
        System.out.println("Number listesi: " + numberList);
        System.out.println("Integer listesi: " + integerList);

        // String listesi örneği
        List<String> stringList = new ArrayList<>();
        List<Object> anotherObjectList = new ArrayList<>();

        addStrings(stringList, "Java", "Python");
        addStrings(anotherObjectList, "C++", "JavaScript");

        System.out.println("String listesi: " + stringList);
        System.out.println("Object listesi (String'ler): " + anotherObjectList);

        System.out.println();
    }

    /**
     * Integer veya üst türlerini kabul eden sayı ekleme metodu
     *
     * @param numbers Integer veya üst sınıflarından oluşan liste
     * @param nums    Eklenecek sayılar
     */
    public static void addNumbers(List<? super Integer> numbers, Integer... nums) {
        for (Integer num : nums) {
            numbers.add(num);
        }
    }

    /**
     * String veya üst türlerini kabul eden string ekleme metodu
     *
     * @param strings String veya üst sınıflarından oluşan liste
     * @param strs    Eklenecek string'ler
     */
    public static void addStrings(List<? super String> strings, String... strs) {
        for (String str : strs) {
            strings.add(str);
        }
    }

    /**
     * PECS PRENSİBİ ÖRNEĞİ
     *
     * PECS: Producer Extends, Consumer Super
     *
     * - Producer (üretici): Veri üreten, okuma yapan -> ? extends Type kullan
     * - Consumer (tüketici): Veri tüketen, yazma yapan -> ? super Type kullan
     */
    public static void demonstratePECSPrinciple() {

        List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5);
        List<Number> targetList = new ArrayList<>();

        // Producer: sourceList'ten okuyoruz -> ? extends Integer
        // Consumer: targetList'e yazıyoruz -> ? super Number
        copyNumbers(sourceList, targetList);

        System.out.println("Kaynak liste: " + sourceList);
        System.out.println("Hedef liste: " + targetList);
    }

    /**
     * PECS prensibini uygulayan kopyalama metodu
     *
     * @param source Kaynak liste (Producer - extends kullan)
     * @param target Hedef liste (Consumer - super kullan)
     */
    public static void copyNumbers(List<? extends Integer> source, List<? super Number> target) {
        for (Integer item : source) {
            target.add(item); // Integer, Number'ın alt sınıfı olduğu için güvenli
        }
    }
}


/**
 *
 * --------------- Bounding Generic Types ---------------
 * Generic tipler için bound class belirleyebiliriz. Bu class'ları generic type yaparız. Bunun için question mark (?) kullanırız.
 * --------------- Types of Bounds ----------------------
 * ------------------------------------------------------------------------------------------------------------------
 * Type of bound                Syntax                  Example
 * ------------------------------------------------------------------------------------------------------------------
 * Unbounded wildcard           ?                       List<?> a = new ArrayList<String>();                            -> Herhangi bir türü kabul eder, sadece okuma işlemleri güvenlidir. Liste boyutu, boş kontrolü gibi türden bağımsız işlemler için kullanılır.
 * Wildcard with upper bound    ? extends type          List<? extends Exception> a = new ArrayList<RuntimeException>   -> Belirtilen tür (Exception) veya alt sınıflarını (RuntimeException) kabul eder. Sadece okuma işlemleri güvenlidir, yazma işlemleri yapılamaz.
 * Wildcard with lower bound    ? super type            List<? super Exception> a = new ArrayList<Object>();            -> Belirtilen tür (Exception) veya üst sınıflarını (Object) kabul eder. Yazma işlemleri güvenlidir, okuma işlemleri Object türünde döner.
 * ------------------------------------------------------------------------------------------------------------------
 *
 * --------------- Creating Unbounded Wildcards ---------------
 * Herhangi bir veri türünü ifade eder. ? simgesi herhangi bir türün uygun olduğunu belirtmek için kullanılır.
 * Java bizi run time hatalarından korumak için generic leri kullanarak compile time hataları almamızı sağlar.
 *
 *
 */
