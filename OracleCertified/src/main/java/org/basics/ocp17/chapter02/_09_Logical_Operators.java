package org.basics.ocp17.chapter02;

public class _09_Logical_Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Bitwise
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        int c = 9;
        int d = 8;

        System.out.println(c & d);
        System.out.println(c | d);
        System.out.println(c ^ d);

        System.out.println("----------------");

        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;       // -> Durumların farklı olması durumunda true döner.
        System.out.println(resting);
        System.out.println(asleep);
        System.out.println(awake);

    }

}

/**
 *
 * 1. Logical Operators yani mantıksal operatorler and (&), or (|) ve xor (^) operatorleridir.
 * 2. Bu operatorler boolean ve numeric data tiplerine uygulanabilirler.
 * 3. Boolean data tiplerine uygulandığında logical operator adını alır. Numeric data tipine uygulandığında ise bitwise operator adını alır.
 * 4. Logical operatorler için kullanıldığında;
 *      a. (x & y) -> İki değer true olduğunda true döneektir.
 *      b. (x | y) -> En az bir tanesi true olduğunda true döner.
 *      c. (x ^ y) -> Biri true biri false ise o zaman true dönecektir.
 *
 */
