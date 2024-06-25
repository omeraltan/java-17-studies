package org.basics.oca8._32;

public class StringNotes {

    public static void main(String[] args) {
        String x = "java";
        x.concat(" Rules!");
        System.out.println(x);

        String y = "java";
        y = y.concat(" Rules!");
        System.out.println(y);

        String z = "java";
        z.toUpperCase();
        System.out.println(z);
    }

}

/**
 *
 * String sınıfı java.lang paketinde yer alır. (java.lang.String)
 * Javada otomatik olarak java.lang paketi import edilir.
 * Stirng in her karakteri 16-bit Unicode bir karakterdir.
 * immutable -> değişmez anlamına gelmektedir.
 *
 */
