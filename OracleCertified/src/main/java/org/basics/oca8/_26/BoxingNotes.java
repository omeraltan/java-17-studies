package org.basics.oca8._26;

public class BoxingNotes {
    public static void main(String[] args) {

        //Integer number = new Integer(100);            // boxing işlemi
        Integer number = Integer.valueOf(100);       // boxing işlemi
        Integer number2 = 200;                          // Autoboxing. Otomatik şekilde primitive -> wrapper a dönüşüm

        int unboxing = number.intValue();               // Unboxing
        int autounboxing = number2;                     // Autounboxing
    }
}

/**
 *
 * AutoBoxing / Boxing
 * primitive -> Reference type / wrapper
 *
 * AutoUnboxing / Unboxing
 * Wrapper -> primitive
 *
 * Integer ları ne zaman kullanmamız gerekir? Collection larda, webservice lerde kullanılabilir. Entity sınıflarda
 *
 */
