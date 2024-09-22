package org.basics.ocp17.chapter01;

public class _12_Declaring_Variables {

    public static void main(String[] args) {

        long okidentifier;
        float $OK2Identifier;
        boolean _alsoOKId3ndifi3r;
        char __;
        char __SStillOkbutKnotsonice$;

        // int 3DPointClass;            // -> DOES NOT COMPILE
        // byte hollywood@vine;         // -> DOES NOT COMPILE
        // String *$coffee;             // -> DOES NOT COMPILE
        // double public;               // -> DOES NOT COMPILE
        // short _;                     // -> DOES NOT COMPILE

        String s1, s2;
        String s3 = "yes", s4 = "no";

        int i1, i2, i3, i4 = 0, i5 = 0, i6 = 0;

        // int sum, String value;       // -> DOES NOT COMPILE

        boolean b1, b2, b3, b4;
        String s5 = "yes", s6;
        // double d1, double d2;        // -> DOES NOT COMPILE
        int i11; int i12;
        // int i13; i14;                // -> DOES NOT COMPILE



    }

}

/**
 *
 * 1.   Identifier isimleri bir harf, bir para birimi veya sembol ile başlayabilir.
 * 2.   Bu karakterler ile başladıktan sonra rakam ekleyebiliriz.
 * 3.   Ancak bir identifier ismi rakam ile başlayamaz.
 * 4.   Tek başına bir underscore ( _ ) identifier olarak kabul edilmez.
 * 5.   Java daki reserve kelimeleri de identifier olarak kullanamazsınız (Örneğin: abstract, void, public final, fot vb.).
 * 6.   Java daki identifier lar case sensitive dir (Örnek: state, STATE farklıdır.).
 * 7.   Java da identifier lar için "cameCase" ve "PascalCase" kullanılır ayrıca constant lar için "SNAKE_CASE" kullanılır.
 * 8.   Birde fazla değişkeni aynı satırda tanımlayabilir ve değer atayabiliriz.
 * 9.   Bir statement ta farklı tipteki değişkenleri tanımlayamayız(Örnek: int sum, String value;).
 * 10.
 *
 */
