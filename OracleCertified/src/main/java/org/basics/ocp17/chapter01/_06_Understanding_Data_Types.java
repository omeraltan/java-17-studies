package org.basics.ocp17.chapter01;

public class _06_Understanding_Data_Types {

    public static void main(String[] args) {

        boolean activated = true;   // -> true yada false değerlerini alır
        byte size = 100;            // -> maksimum değeri 127 minimum değeri ise -128 dir.

        System.out.println("byte max value : " + Byte.MAX_VALUE);           // -> maksimum değeri 127
        System.out.println("byte min value : " + Byte.MIN_VALUE);           // -> minimum değeri -128

        short count = 15000;        // -> maksimum değeri 32767 minimum değeri ise -32768 dir.

        // short total = 32768;     // -> COMPILE TIME ERROR

        System.out.println("short max value : " + Short.MAX_VALUE);         // -> maksimum değeri 32767
        System.out.println("short min value : " + Short.MIN_VALUE);         // -> minimum değeri 32768

        float sum = 156;
        // float square = 125.56;   // -> COMPILE TIME ERROR
        float average = 125.56f;
        float monotonic = 125.56F;

        short s1 = 100;
        short s2 = +200;
        short s3 = -200;
        short s4 = 0;

        char c1 = 100;
        char c2 = +400;
        char c3 = 0;
        // char c4 = -1;               // -> DOES NOT COMPILE

        System.out.println("char max value : " + Character.MAX_VALUE);      // -> maksimum değeri 65535
        System.out.println("char min value : " + Character.MIN_VALUE);      // -> minimum değeri  0

    }

}

/**
 *
 * 1.  8 tane primitive type bulunmaktadır. Bunlar: boolean, byte, short, int, long, float, double, char
 * 2.  Javada bu 8 type haricinde kalan herşey object yani reference type dır.
 * 3.  String bir primitive type değildir. String bir sınıftır.
 * 4.  byte, short, int ve long tpe lar tamsayılar için kullanılır.
 * 5.  Her bir numeric type bir önceki numeric type a göre iki kat fazla "bit" kullanır.
 * 6.  byte: 8 bit, short: 16 bit, int: 32 bit, long: 64 bit, float: 32 bit, double: 64 bit, char: 16 bit
 * 7.  numeric type lar negatif sayılara destek verir.
 * 8.  float type noktalı sayılar için kullanılır. Aynı şekilde double type da noktalı sayılar için kullanılır.
 * 9.  Java, default olarak ondalıklı sayıları double olarak yorumlar. Yani javada 32.43 gibi bir sayı yazdığınızda bu double olarak kabul edilir.
 * 10. Ondalıklı bir sayıyı float olarak kullanmak istediğimizde "f" veya "F" rakamın yanına yazarsak float olarak kabul edilir.
 * 11. Java tam sayıları int olarak kabul eder (default olarak) eğer long olarak kullanmak istiyorsak "l" veya "L" yi rakamın yanına yazmalıyız.
 * 12. byte, 0 ile birlikte toplam 256 tane sayıyı destekler ((-128) - 127).
 * 13. Signed: Bir dilin negaatif sayılara destek vermesi anlamına gelir. Unsigned ise bu desteğin olmadığı anlamına gelir.
 * 14. "short" ve "char" ikiside 16-bit'lik uzunluğa sahiptir. Bunların arasındaki temel fark; short signed'tır char ise unsigned'tır.
 * 15. Yani char negatif değerlere destek vermez.
 *
 */
