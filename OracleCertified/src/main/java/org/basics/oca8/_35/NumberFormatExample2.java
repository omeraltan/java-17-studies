package org.basics.oca8._35;

import java.text.NumberFormat;

public class NumberFormatExample2 {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        System.out.println(nf.getMinimumFractionDigits());

        int number = 100;
        System.out.println(nf.format(number)); // 100
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(number)); // 100.00

        double number2 = 234234.23432423;
        System.out.println(nf.format(number2));

        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(number2));
    }

}

/**
 *
 * NumberFormat virgülden sonra 3 hane destekler.
 *
 */
