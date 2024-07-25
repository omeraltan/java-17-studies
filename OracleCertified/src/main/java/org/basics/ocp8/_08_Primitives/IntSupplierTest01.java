package org.basics.ocp8._08_Primitives;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class IntSupplierTest01 {

    public static void main(String[] args) {

        Supplier<Integer> s1 = IntSupplierTest01::getMyNumber;
        Random random = new Random();
        Supplier<Integer> s2 = random::nextInt;
        IntSupplier is1 = random::nextInt;
        IntSupplier is2 = IntSupplierTest01::getMyNumber;

        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(is1.getAsInt());
        System.out.println(is2.getAsInt());

    }

    public static int getMyNumber(){
        return 100;
    }

}
