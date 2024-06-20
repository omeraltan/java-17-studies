package org.basics.oca8._14.vararg;

public class VarargNotes {

    public static void main(String[] args) {
        method();
        method(1);
        method(1,4);
        method(2,4);
        method(2,6,7);

    }

    public static void method(int ... numbers){
        int  sum = 0;
        for (Integer number : numbers) {
            sum +=number;
        }
        System.out.println(sum);
        System.out.println("--------");
    }

}

/**
 *
 * var-arg
 * bir method ... 0 tane değer geçebilir. 1 tane değer geçebilir. n tane değer geçebilir.
 * int ... x            -> n tane x değişkeni alabilir.
 * String ... y         -> n tane y değişkeni alabilir.
 * Vararg yapısı aslında bir array'dir.
 * Bir method içerisinde varaarg en sonda olmalıdır.
 * Bir method içerisinde sadece bir tane vararg olabilir.
 * ... değişken isminden önce olmalıdır. public void String(String value, int ... numbers){}
 *
 */
