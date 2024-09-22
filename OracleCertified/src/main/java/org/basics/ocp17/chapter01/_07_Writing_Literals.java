package org.basics.ocp17.chapter01;

public class _07_Writing_Literals {
    public static void main(String[] args) {

        // long max = 3123456789;      // -> DOES NOT COMPILE
        long max = 3123456789L;

        // ikilik sistem
        int binary1 = 0b10;
        int binary2 = 0b11011;

        // ikilik sistemde bir sayının değeri 0 - 1 aralığında olabilir.
        //int binary3 = 0b111112;         // -> DOES NOT COMPILE

        // sekizlik sistem
        int octalVar1 = 017;
        int octalVar2 = 025;

        // sekizlik sistemde bir sayının değerleri 0 - 7  aralığında olabilir.
        // int octalVar3 = 038;            // -> DOES NOT COMPILE

        // onaltılık sistem
        // A -> 10, B -> 11, C -> 12, D -> 13, E -> 14, F -> 15
        int hexadecimal1 = 0xFF;
        int hexadecimal2 = 0x234;

        // onaltılık sistemde bir sayının değeri 0 - 9 ve A - F aralığında olabilir.
        // int hexadecimal3 = 0xcafeg;     // -> DOES NOT COMPILE


    }
}

/**
 *
 * 1.   Kodumuzda yer alan sayılara literal adı verilir.
 * 2.   Bir tam sayı kullandığımızda bu sayı default olarak int literal'idir.
 * 3.   Eğer noktalı sayı ise varsayılan olarak double'dır.
 * 4.   Javada günlük hayatta 10 luk sistem kullanılmakta iken binary (ikilik(0-1)), octal (sekizlik (0-7)) ve hexadecimal(onaltılık (0-9 and A-F/a-f)) sistemlerede destek sağlar.
 * 5.   Sayının başında 0 (sıfır) varsa bu "octal" sistem olmaktadır.
 * 6.   Sayının başında 0x veya 0X varsa bu "hexadecimal" sistem olmaktadır.
 * 7.   Sayının başında 0b veya 0B varsa bu "binary" sistemi olmaktadır.
 *
 */
