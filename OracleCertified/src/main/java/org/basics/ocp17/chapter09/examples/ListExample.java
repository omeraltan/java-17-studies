package org.basics.ocp17.chapter09.examples;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("ömer");                      // duplicate elemana izin verir.
        list1.add("ömer");                      // sıralı bir şekilde elemanları tutar.
        list1.add("ömer");                      // index base bir yapıya sahiptir.

        list1.forEach(System.out::println);

        System.out.println("---------------");

        Set<String> list2 = new HashSet<>();
        list2.add("ömer");                      // duplicate elemana izin verilmez.
        list2.add("ömer");
        list2.add("ömer");
        list2.add("ebru");

        list2.forEach(System.out::println);

        System.out.println("---------------");

        Queue<String> list3 = new LinkedList<>();
        list3.add("ömer1");
        list3.add("ömer2");
        list3.add("ömer3");

        list3.forEach(System.out::println);

        System.out.println("---------------");

        Map<Integer, String> list4 = new HashMap<>();
        list4.put(0,"ömer");
        list4.put(1,"ebru");
        list4.put(2,"adil");
        list4.put(3,"elif");

        list4.forEach((integer, s) -> System.out.println(s));

        System.out.println("---------------");

        List<Integer> list5 = new ArrayList<>();
        System.out.println(list5.add(1));              // Ekleme yaptığında add methodu true dönecektir. add methodunun dönüş tipi boolean'dır.
        System.out.println(list5.add(2));
        System.out.println(list5.remove(0));     // Silinen değeri geriye döndürür.
        System.out.println(list5.remove(0));

        System.out.println("---------------");

        List<String> list6 = new ArrayList<>();
        System.out.println(list6.add("ömer"));
        System.out.println(list6.add("ebru"));
        System.out.println(list6.add("adil"));
        System.out.println(list6.remove(0));    // silinme işleminde ömer değerini döndürür.

        System.out.println("---------------");

        List<String> list7 = new ArrayList<>();
        System.out.println(list7.add("ömer"));
        System.out.println(list7.add("ebru"));
        System.out.println(list7.add("adil"));
        list7.clear();
        System.out.println(list7);                    // Liste temizlendiği için "[]" döner.

        System.out.println("---------------");

        List<String> list8 = new ArrayList<>();
        list8.add("ömer");
        list8.add("elif");
        list8.add("adil");
        list8.add("elif");

        System.out.println(list8.contains("elif"));     // true döner
        System.out.println(list8.contains("fahri"));    // false döner

        System.out.println("---------------");

        List<String> list9 = new ArrayList<>();
        list9.add("ömer");
        list9.add("ebru");
        list9.add("adil");
        list9.add("elif");
        list9.removeIf(x -> x.contains("ömer"));    // Buradaki şart sağlanıyorsa koleksiyondan silme yapacaktır.
        System.out.println(list9);



    }

}
