package org.basics.ocp17.chapter04;

public class _03_Removing_White_Space {

    public static void main(String[] args) {

        String text = " abc\t ";
        System.out.println(text.trim().length());           // -> 3
        System.out.println(text.strip().length());          // -> 3
        System.out.println(text.stripLeading().length());   // -> 5 (Baştaki boşluğu temizler)
        System.out.println(text.stripTrailing().length());  // -> 4 (Sondaki boşlukları temizler)

    }

}

/**
 *
 * 1. "strip()" ve "trim()" methodları String'in başındaki ve sonundaki white space karakteri, \t, \n ve \r gibi özel karakterleri temizleyecektir.
 * 2. strip() methodu thrim() methodunun yaptığı her şeyi yapar ek olarak ta Unicode larıda destekler.
 *
 */
