package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _02_Using_The_List_Interface {

    public static void main(String[] args) {

        String[] array = new String[]{"a","b","c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);
        array[0] = "z";

        System.out.println(asList);         // [z, b, c]
        System.out.println(of);             // [a, b, c]
        System.out.println(copy);           // [a, b, c]

        System.out.println(asList.getClass());
        System.out.println(of.getClass());
        System.out.println(copy.getClass());

        asList.set(0, "x");
        System.out.println(Arrays.toString(array));

        // asList.add("y");                 // UnsupportedOperationException
        // of.add("y");                     // UnsupportedOperationException
        // copy.add("y");                   // UnsupportedOperationException

        System.out.println("-------------------------");

        var linked1 = new LinkedList<String>();
        linked1.add("element1");
        linked1.add("element2");
        var linked2 = new LinkedList<String>(linked1);

        System.out.println(linked1);
        System.out.println(linked2);

        var list1 = new ArrayList<String>();
        list1.add("value1");
        list1.add("value2");
        list1.add("value3");

        var list2 = new ArrayList<String>(list1);
        var list3 = new ArrayList<String>(10);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list3.size());

        System.out.println("-------------------------");

        var strings = new ArrayList<String>();       // -> Değişken var olarak tanımlanabilir. Burada tip bilgisi String'dir. Bunu kodun sağ tarafından çıkartabiliyoruz.
        strings.add("a");
        for (String s : strings){  }

        var list = new ArrayList<>();                // -> Bu şekilde tip belirtilmediğinde var'ın tipi Object olacaktır.

        var list4 = new ArrayList<>();
        list2.add("a");
        for (String s : list2) {}                   // -> DOES NOT COMPILE (Object tipini String e atamaya çalışıyoruz.)

        var list5 = new ArrayList();
        list5.add("a");
        list5.add(10);
        list5.add('b');
        list5.add(true);

        for (Object s : list5){
            System.out.println(s);
        }

        System.out.println("-------------------------");

        List<String> list6 = new ArrayList<>();
        list6.add("SD");                            // [SD]
        list6.add(0, "NY");           // [NY, SD]
        list6.set(1, "FL");                         // [NY, FL]
        System.out.println(list6.get(0));           // NY
        list6.remove("NY");                      // [FL]
        list6.remove(0);                      // []
        // list6.set(0, "?");                          // IndexOutOfBoundsException

        System.out.println("-------------------------");

        var numbers = Arrays.asList(1,2,3);
        numbers.replaceAll(x -> x * 2);
        System.out.println(numbers);                // [2, 4, 6]

        System.out.println("-------------------------");

        var list7 = new LinkedList<Integer>();
        list7.add(3);
        list7.add(2);
        list7.add(1);
        list7.remove(2);                     // 2'nci index'i siler.
        list7.remove(Integer.valueOf(2));       // 2 değerini siler (Object alan constructor'a gider. Bu şu demektir: 2 değerindeki nesneyi kaldır.)
        System.out.println(list7);

        System.out.println("-------------------------");

        List<String> list8 = new ArrayList<>();
        list8.add("hawk");
        list8.add("robin");
        Object[] objectArray = list8.toArray();
        String[] stringArray = list8.toArray(new String[0]);
        list8.set(0, "new-hawk");
        list8.clear();

        System.out.println(list8);
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(stringArray));

    }

}

/**
 *
 * ----- Using The List Interface -----
 * List interface'i java.util paketinde yer almaktadır.
 * List interface'i java.util.Collection interface'ini kalıtmaktadır.
 * List interface yapısı ordered bir yapı istediğimizde kullanabileceğimiz bir yapıdır.
 * List duplicate elemana izin verecektir.
 * Array'lerin aksine List'lerin boyutu tanımlandıktan sonra değişebilir.
 * List veri yapısı index base dir ve indekler 0 (sıfır) dan başlar.
 *
 * ----- Comparing List Implementations -----
 * ArrayList bir Array'in resizable haline benzemektedir. Eleman ekledikçe otomatik olarak büyür.
 * ArrayList'in temel faydası elemanlarına hızlı bir şekilde erişim sağlanacaktır.
 * ArrayList lerde eleman eklemek ve çıkartmak okuma ve erişim işlemine göre daha yavaştır.
 * LinkedList class'ı da List interface ini implement eder. Bununla birlikte Deque interface'ini de implement eder.
 * Bundan dolayı list sınıfının sahip olduğu methodlara sahiptir. Aynı zamanda listenin başına yada sonuna eleman ekleyen yada başından yada sonundan eleman çıkartan methodlara sahiptir.
 * Bu methodlarda Deque yapısından gelmektedir (listenin başına ve sonuna ekleme yapan veya çıkarma yapan methodlar).
 * LinkedList yapısının temel faydası, listenin başına ve sonuna eleman ekleme ve çıkartma işlemi hızlı bir şekilde olmaktadır.
 * Elamana erişim,  LinkedList te daha yavaş olacaktır ancak LinkedList yapısında eleman ekleme ve çıkartma işlemi daha hızlı olacaktır.
 *
 *
 * --------------- Factory Methods To Create A List ---------------
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Method                   Description                                                         Can Add Elements?       Can Replace Elements?       Can Delete Elements?
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Array.asList(varargs)    Returns fixed size list backed by an array                          No                      Yes                         No
 * List.of(varargs)         Returns immutable list                                              No                      No                          No
 * List.copyOf(collection)  Returns immutable list with copy of original collection's variable  No                      No                          No
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
 *
 * ----- Creating a List With a Constructor -----
 * LinkedList'in iki tane constructor'ı vardır. ArrayList'in ise 3 tane constructor'ı vardır.
 * LinkedList için:
 * var linked1 = new LinkedList<String>();          -> Parametre almıyor.
 * var linked2 = new LinkedList<String>(linked1);   -> Collection alan bir constructor.
 *
 * ArrayList için:
 * var list1 = new ArrayList<String>();             -> Parametre almıyor.
 * var list2 = new ArrayList<String>(list1);        -> Collection alan bir constructor.
 * var list3 = new ArrayList<String>(10);           -> initial capacity verdiğimiz bir constructor.
 *
 * ----- Using var With ArrayList -----
 * var strings = new ArrayList<String>();       -> Değişken var olarak tanımlanabilir. Burada tip bilgisi String'dir. Bunu kodun sağ tarafından çıkartabiliyoruz.
 * strings.add("a");
 * for (String s : strings){  }
 *
 * var list = new ArrayList<>();                -> Bu şekilde tip belirtilmediğinde var'ın tipi Object olacaktır.
 *
 * ----- Working With List Methods -----
 * List interface'indeki methodlar indeks tabanlı olarak çalışır.
 * Lİnst interface'i Collection interface'ini implement ettiği için doğal olarak Collection da yer alan methodlarıda extend edecektir.
 *
 * --------------- List Methods ---------------
 * ---------------------------------------------------------------------------------------------------------------------
 * Method                                               Description
 * ---------------------------------------------------------------------------------------------------------------------
 * public boolean add(E element)                        Adds element to end (available on all Collection APIs).
 * public void add(int index, E element)                Adds element at index and moves the rest toward the end.
 * public E get(int index)                              Returns element at index.
 * public E remove(int index)                           Removes element at index and moves the rest toward the front.
 * public default void replaceAll(UnaryOperator<E> op)  Replaces each element in list with result of operator.
 * public E set(int index, E e)                         Replaces element at index and returns original. Throws IndexOutOfBoundsException if index is invalid.
 * public default void sort(Comparator<? super E> c)    Sorts list. We cover this later in the chapter in the "Sorting Data" section.
 *
 * --------------- Converting From List To An Array ---------------
 * Bir Listeden Array'e dönüşüm yapabilmek için "toArray" methodu kullanılır.
 *
 *
 *
 */
