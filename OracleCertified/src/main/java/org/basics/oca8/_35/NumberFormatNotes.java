package org.basics.oca8._35;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatNotes {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();

        double number = 23346.35447;
        System.out.println(number);
        System.out.println(nf.format(number));

        NumberFormat nf2 = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(nf2.format(number));

        NumberFormat nf3 = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(nf3.format(number));
    }

}

/**
 *
 * java.text.NumberFormat
 * public abstract class NumberFormat extens Format
 *
 */
