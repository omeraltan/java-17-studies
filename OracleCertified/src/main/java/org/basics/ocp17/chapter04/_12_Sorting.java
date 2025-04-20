package org.basics.ocp17.chapter04;

import java.util.Arrays;

public class _12_Sorting {

    public static void main(String[] args) {
        int[] numbers = {6,9,1};
        Arrays.sort(numbers);
        for (int number : numbers){
            System.out.println(number);
        }

        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String s : strings){
            System.out.println(s + " ");
        }

        String[] values = {"azz", "aaa", "Aba", "ACa", "Zaz", "ZaA", "ZYa", "1zzz", "zzz"};
        Arrays.sort(values);

        System.out.println(Arrays.toString(values));

        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));            // -1
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));  // 0

        System.out.println("-----------");

        String[] name1 = {"ömer", "ebru"};
        String[] name2 = {"adil", "elif"};
        String[] name3 = {"ömer", "ebru"};

        System.out.println(Arrays.compare(name1, name2));       // negative or positive
        System.out.println(Arrays.compare(name1, name3));       // zero (0)

        System.out.println("-----------");

        System.out.println(Arrays.equals(name1, name2));        // false
        System.out.println(Arrays.equals(name1, name3));        // true

        System.out.println("-----------");

        System.out.println(Arrays.mismatch(name1, name2));      // zero (0) or positive
        System.out.println(Arrays.mismatch(name1, name3));      // -1

    }

}

/**
 *
 * Arrays sınıfında sort() methodu yer almaktadır. Bu method yardımıyla int String gibi elemanlar içeren array imizi sıralayabiliriz.
 * Bu sınıf java.util paketinde yer almaktadır.
 * Sorting işlemlerinde ilk önce sayılar sıralanır. Sonrasında Büyük harfler
 * compare() : Array leri karşılaştırmak için yine Arrays.compare() methodunu kullanabiliriz.
 * compare() methodu negatif, pozitif ve zero değer dönmektedir.
 * compare() methodu negatif dönüyorsa birinci array ikinci array den küçüktür.
 * compare() methodu sıfır (0) dönüyorsa arrayler eşittir.
 * compare() methodu pozitif dönüyorsa birinci array ikinci arrayden büyüktür.
 * compare() methodu kullanımında Array ler aynı elemanlara sahipse sıfır döner.
 * compare() methou kullanımında Array ler aynı elemanlara sahip ve biri bir fazla elemana sahipse daha büyük olacaktır.
 * mismatch() eğer Array ler eşitse o zaman eksi bir değer döner değilse ilk indeksi verir.
 *
 *              Method              When arrays contain the same data               When arrays are different
 *              ----------          ---------------------------------               ---------------------------
 *              equals()            true                                            false
 *              compare()           0                                               Positive or negative number
 *              mismatch()          -1                                              Zero or positive index
 *
 */
