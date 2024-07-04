package org.basics.ocp6._19_Literals;

public class LiteralsNotes {

    public static void main(String[] args) {
        System.out.println("---Octal---");
        int number1 = 011;      // 0 ile başlıyor octal literal
        System.out.println(number1);
        //int number2 = 08; // compile time error
        System.out.println("---Hexadecimal---");
        int number3 = 0xA;
        System.out.println(number3);
        int number4 = 0xF;
        System.out.println(number4);
        int number5 = 0xAB; // A(10)*16^1 + B(11)*16^0 = 171
        System.out.println(number5);
        System.out.println("---Binary---");
        int number6 = 0b1;
        System.out.println(number6);
        int number7 = 0b11111; // 1*2^4 + 1*2^3 + 1*2^2 + 1*2^1 + 1*2^0
        System.out.println(number7);

        /**
         *  Decimal     : 10 luk sistemdir.
         *  Octal       : 8  lik sistemdir. -> 0 ile başlıyorsa             -> [0-7]  aralığında
         *  Hexadecimal : 16 lık sistemdir. -> 0x veya 0X ile başlıyorsa    -> [0-15] aralığında (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F)
         *  Binary      : 2  lik sistemdir. -> 0b veya 0B ile başlıyorsa    -> [0-1]  aralığında
         */

        float f1 = 100;
        float f2 = 100.0f; // float -> 100.0 double değerini sonuna küçük "f" işareti koyarak float yaptık.
        float f3 = 100.0F; // float -> 100.0 double değerini sonuna büyük "F" işareti koyarak float yaptık.
        float f4 = (float) 100.0; // float -> 100.0 double değerini cast işlemi ile float yaptık.

    }

}

/**
 *
 * Literalin manası, kalıptır.
 *
 * Integer          Literals
 * Floating-Point   Literals
 * Boolean          Literals
 * Character        Literals
 * String           Literals
 * -------------------------
 *
 * Javada Integer literallerin 4 farklı gösterimi mevcuttur.
 *
 * Decimal      -> Her zaman kullandığımız 10 luk tabandır.     int number = 1000;      int age = 20;
 *
 * Octal        -> 8  lik tabandır. [0-7] aralığında değerler alabilir. 8, 9 alamazlar. 0 ile başlayan bir sayı varsa bu octal literaldir.
 *
 * Hexadecimal  -> 16 lık tabandır. [0-15] aralığında değerler alabilir.
 * 10 -> A, 11 -> B, 12 -> C, 13 -> D, 14 -> E, 15 -> F .
 * "0x" ya da "0X" ile başlıyorsa bu durumda hexadecimal formattadır.
 *
 * Binary       -> 2  lik tabadır. [0,1]
 * 0b yada 0B ise binary literaldir.
 *
 * Floating - Point -> kayan noktalı sayılar // küsüratlı sayılar
 * float (32 bit) ve double (64 bit)
 * Kayan noktalı sayıların default tipi double dır. Örneğin float f1 = 100.0; yazdığınızda compile time hatası verir çünkü bu literal double dır.
 *
 * Boolean literalleri -> true veya false tur.
 *
 * Character literalleri 16 bit unsigned veri tipidir. 'c' tek tırnak kullanılabilir. [0-65535] aralığında değerler alabilir.
 *
 * String literalleri "" çift tırnak ile kullanılır.
 *
 */
