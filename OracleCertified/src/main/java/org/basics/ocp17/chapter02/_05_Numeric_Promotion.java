package org.basics.ocp17.chapter02;

public class _05_Numeric_Promotion {

    public static void main(String[] args) {

        int x = 1;
        long y = 33;
        var z = x * y;      // z is a long type
        System.out.println(z);
        isTypeLong(z);

        System.out.println("----------------");

        double a = 39.21;
        float b = 2.1f;
        var c = a + b;      // c is a double
        System.out.println(c);
        isTypeDouble(c);

        System.out.println("----------------");

        short d = 10;
        short e = 3;
        var f = d + e;      // f is an int
        System.out.println(f);
        isTypeInt(f);

        System.out.println("----------------");

        short g = 14;
        float h = 13;
        double ı = 30;
        var i = g * h / ı;  // i is a double
        System.out.println(i);
        isTypeDouble(i);

    }

    public static void isTypeLong(Long aLong){
        System.out.println(true);
    }

    public static void isTypeDouble(Double aDouble){
        System.out.println(true);
    }

    public static void isTypeInt(int aInt){
        System.out.println(true);
    }



}

/**
 *
 * 1. Eğer iki tane literal eğer farklı tipte ise bu durumda java otomatik olarak daha geniş olan data tipine yükseltme işlemi yapacaktır.
 * 2. Eğer bir değer integral type ise (tam sayı) ve diğer sayı floating-point ise (double veya float), bu durumda java otomatik olarak integral tipini floatin-point'e yükseltecektir.
 * 3. Küçük data tipler (byte, short ve char) herhangi bir binary arithmetic işleminin sonunda int tipine yükseltilir.
 * 4. Tüm yükseltme işlemi gerçekleştikten ve işlenen operandlar aynı veri tipine sahip olduktan sonra elde edilen değer yani sonuç değer yükseltilen operandlar ile aynı veri tipine sahip olacaktır.
 *
 */
