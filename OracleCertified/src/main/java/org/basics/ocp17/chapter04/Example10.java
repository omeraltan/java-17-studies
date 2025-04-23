package org.basics.ocp17.chapter04;

import java.util.Arrays;

public class Example10 {

    public static void main(String[] args) {

        int[] numbers = {6,9,1};
        Arrays.sort(numbers);
        for (int number : numbers){
            System.out.println(number);
        }

        System.out.println("----------------");

        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String s : strings){
            System.out.println(s);
        }

        System.out.println("----------------");

        String[] values = {"azz", "aaa", "Aba", "ACa", "Zaz", "ZaA", "ZYa", "1zzz", "zzz"};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));

        System.out.println("----------------");

        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));            // -1 (Diziler eşit)
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));  // 0 (Farklı harfler)

        System.out.println("----------------");

        String[] name1 = {"ömer", "ebru"};
        String[] name2 = {"adil", "elif"};
        String[] name3 = {"ömer", "ebru"};

        System.out.println(Arrays.compare(name1, name2));  // Output: Negative or Positive
        System.out.println(Arrays.compare(name1, name3));  // Output: 0 (Eşit)

        System.out.println(Arrays.equals(name1, name2));   // Output: false
        System.out.println(Arrays.equals(name1, name3));   // Output: true

        System.out.println("----------------");

        Object[] mixedArray = {10, "apple", 5, "banana", 8, "cherry"};
        Arrays.sort(mixedArray, (a, b) -> a.toString().compareTo(b.toString()));  // Sayı ve string'leri karşılaştır
        System.out.println(Arrays.toString(mixedArray));  // Output: [10, 5, 8, apple, banana, cherry]

        System.out.println("----------------");

        String[] names1 = {"ömer","ebru","elif"};
        String[] names2 = {"ömer","ebru","elif"};
        String[] names3 = {"ömer","ebru","adil"};

        System.out.println(Arrays.compare(names1, names2));     // -> 0
        System.out.println(Arrays.mismatch(names1, names2));    // -> -1
        System.out.println(Arrays.mismatch(names1, names3));    // -> 2
        System.out.println(Arrays.compare(names1, names3));      // -> positive

    }

}
