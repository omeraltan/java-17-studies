package org.basics.ocp8._13_Exception;

import java.util.Scanner;

public class ExceptionTest04 {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
            s.close();
        }

        try (Scanner s2 = new Scanner(System.in)) {
            s2.nextLine();
        }catch (Exception e) {
            // s2.nextInt(); // DOES NOT COMPILE
        }finally {
            // s2.nextInt(); // DOES NOT COMPILE
        }

    }

}

/**
 *
 * Burada "close" methodunu çağırmaya gerek yoktur.
 * "try-with resource" yaklaşımını kullandık. close methodunu açık bir şekilde çağırmaya gerek yoktur.
 *
 * try-with-resource yaklaşımında, değişkenin (s2) lifecycle'ı try bloğu ile sınırlıdır.
 *
 *
 */
