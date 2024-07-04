package org.basics.ocp6._26_Wrapper;

public class WrapperTest {
    public static void main(String[] args) {

        Integer integer1 = Integer.valueOf(12);
        Integer integer2 = Integer.valueOf("10");

        System.out.println(integer1);
        System.out.println(integer2);

        int i1 = integer1.intValue();

        Float f1 = Float.valueOf("100.15");

        int i2 = Integer.parseInt("100");
        System.out.println(i2);


    }
}

/**
 *
 * int -> Integer ve String -> Integer çevirimleri valueOf(); methodu kullanılarak yapılabilir.
 * float -> Float ve String -> Float çevirimleri valueOf(); methodu kullanılarak yapılabilir.
 * valueOf() methodları primitive veya Stringleri Wrapper Class lara çevirir.
 * intValue(), byteValue() vb. methodlar Wrapper Class ları primitive tiplere çevirir.
 * parseInt() vb. methodlar, Stringleri primitivlere çevirmektedir.
 */
