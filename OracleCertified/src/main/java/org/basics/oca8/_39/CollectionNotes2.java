package org.basics.oca8._39;

import java.util.ArrayList;
import java.util.List;

class Car{

}

public class CollectionNotes2 {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("test");
        myList.add(200);
        myList.add(200.54);
        myList.add(new Car());

        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.get(2));
        System.out.println(myList.contains(200));
        System.out.println(myList.indexOf(200));
        System.out.println(myList.lastIndexOf(200));

        // System.out.println(myList.get(5));  // java.lang.IndexOutOfBoundsException
        // System.out.println(myList.get(-1)); // java.lang.IndexOutOfBoundsException

        System.out.println(myList);
        myList.clear();
        System.out.println(myList);


    }
}

/**
 *
 * Bir raw formattaki List e herhangi bir tipte eleman ekleyebiliriz.
 * public interface List<E> extends Collection<E> {
 *
 * }
 * boolean add(E e) -> E burada generic tiptir.
 * Generic ifadede E nin tipi neyse add metodundaki E o tipte olacaktır.
 * String is String, Integer ise Integer, Car ise Car, Person ise Person ...
 *
 * Burada olduğu gibi herhangi bir E değeri verilmezse buna raw type adı verilir.
 * Bu durumda E -> Object tipinde olur.
 * List myList = new ArrayList();
 *
 *
 */
