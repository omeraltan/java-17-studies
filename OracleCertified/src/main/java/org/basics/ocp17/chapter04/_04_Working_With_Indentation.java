package org.basics.ocp17.chapter04;

public class _04_Working_With_Indentation {

    public static void main(String[] args) {

        var block = """
                    a
                     b
                    c""";

        var concat = " a\n"
                   + "  b\n"
                   + " c";

        System.out.println(block.length());                 // -> 6
        System.out.println(concat.length());                // -> 9
        System.out.println(block.indent(1).length());    // -> 10
        System.out.println(concat.indent(-1).length());  // -> 7
        System.out.println(concat.indent(-4).length());  // -> 6
        System.out.println(concat.stripIndent().length());  // -> 6

    }

}

/**
 *
 *  1. indent(int numberSpaces)   : Indent methoduna eğer pozitif bir sayı verirsek bu durumda her bir satırın başına o kadar boşluk ekleyecektir.
 *                                  Eğer negatif bir sayı verirsek her bir satır başından o kadar boşluk silmeye çalışacaktır.
 *                                  Verilen int değerinden daha az boşluk varsa java bulabildiği kadarıyla herşeyi silecektir.
 *                                  Sıfır verirseniz her hangi bir boşluk silme işlemi olmayacaktır.
 *                                  Eğer String in sonunda bir line break yoksa bunu ekleyecektir.
 *                                  \r\n olan linebreak karakterini standart olarak \n'e dönüştürecektir.
 *  2. stripIndent()              : Bu method concat işlemlerinde daha kullanışlı olmaktadır.
 *                                  Satır sonuna yeni bir karakter eklemez.
 *
 */
