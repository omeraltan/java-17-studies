package org.basics.ocp6._33_StringBuilder;

public class StringBuilderBufferExample {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        System.out.println(sb1.equals(sb2)); // false olur

        System.out.println(sb1.toString().equals(sb2.toString()));

    }
}

/**
 *
 * StringBuilder nesnesi üzerinden equals kullanılmaz
 * Bunun anlamı direkt == ile aynı anlama gelir.
 * Çünkü bu sınıflarda equals methodu override edilmemiştir.
 *
 */
