package org.basics.ocp17.chapter08;

import java.util.Random;
import java.util.function.*;

public class _14_Learn_Functional_Interfaces_For_Primitives {

    public static void main(String[] args) {

        // BooleanSupplier örneği:
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        BooleanSupplier b3 = PrimitiveBooleanHelper::isRandomNumGreaterThan5;
        String str = "not-empty";
        BooleanSupplier b4 = str::isEmpty;
        System.out.println(b1.getAsBoolean()); // true
        System.out.println(b2.getAsBoolean());
        System.out.println(b3.getAsBoolean());
        System.out.println(b4.getAsBoolean());

        System.out.println("----- double supplier -----");

        doubleSupplierExample();

        System.out.println("----- int supplier -----");

        intSupplierExample();

        System.out.println("----- long supplier -----");

        longSupplierExample();

    }

    private static void doubleSupplierExample(){
        DoubleSupplier ds1 = () -> 10.0;
        DoubleSupplier ds2 = () -> Math.random();
        DoubleSupplier ds3 = Math::random;
        DoubleSupplier ds4 = () -> new Random().nextDouble();
        DoubleSupplier ds5 = PrimitiveSupplierHelper::randomDouble;
        Supplier<Double> s1 = Math::random;
        Supplier<Double> s2 = () -> Math.random();

        System.out.println(ds1.getAsDouble());
        System.out.println(ds2.getAsDouble());
        System.out.println(ds3.getAsDouble());
        System.out.println(ds4.getAsDouble());
        System.out.println(ds5.getAsDouble());
        System.out.println(s1.get());
        System.out.println(s2.get());
    }

    private static void intSupplierExample(){
        IntSupplier is1 = () -> 10;
        IntSupplier is2 = () -> (int) Math.random();
        IntSupplier is3 = () -> new Random().nextInt();
        IntSupplier is4 = PrimitiveSupplierHelper::randomInt;
        Supplier<Integer> s1 = PrimitiveSupplierHelper::randomInt;

        System.out.println(is1.getAsInt());
        System.out.println(is2.getAsInt());
        System.out.println(is3.getAsInt());
        System.out.println(is4.getAsInt());
        System.out.println(s1.get());
    }

    private static void longSupplierExample(){
        LongSupplier ls1 = () -> 10;
        LongSupplier ls2 = new Random()::nextInt;
        LongSupplier ls3 = new Random()::nextLong;
        LongSupplier ls4 = PrimitiveSupplierHelper::randomInt;
        LongSupplier ls5 = PrimitiveSupplierHelper::randomLong;
        Supplier<Long> s2 = PrimitiveSupplierHelper::randomLong;

        System.out.println(ls1.getAsLong());
        System.out.println(ls2.getAsLong());
        System.out.println(ls3.getAsLong());
        System.out.println(ls4.getAsLong());
        System.out.println(ls5.getAsLong());
        System.out.println(s2.get());

    }

}

class PrimitiveBooleanHelper{
    static boolean isRandomNumGreaterThan5(){
        return new Random().nextInt(10) > 5;
    }
}

class PrimitiveSupplierHelper{

    static double randomDouble(){
        return new Random().nextDouble();
    }

    public static Integer randomInt() {
        return new Random().nextInt();
    }

    public static long randomLong() {return new Random().nextLong();}

}

/**
 *
 * primitive tip'lere özel bir çok functional interface bulunmaktadır.
 * Bir çok functionda interface, double, long ve int ile ilişkilidir. Bunun tekbir istisnası "BooleanSupplier" 'dır.
 * BooleanSuplier geriye bir değer döner ve methodunun ismi "getAsBoolean" 'dır.
 * getAsBoolean(): Parametre almaz ve geriye bir boolean değer döner.
 *
 * ---------- Functional Interfaces double, int and long ----------
 * ------------------------------------------------------------------------------------------------------------------
 * Functional Interfaces                Return type             Single abstract method           #of parameters
 * ------------------------------------------------------------------------------------------------------------------
 * DoubleSupplier                       double                  getAsDouble                      0
 * IntSupplier                          int                     getAsInt
 * LongSupplier                         long                    getAsLong
 *
 * DoubleConsumer                       void                    accept                           1 (double)
 * IntConsumer                                                                                   1 (int)
 * LongConsumer                                                                                  1 (long)
 *
 * DoublePredicate                      boolean                 test                             1 (double)
 * IntPredicate                                                                                  1 (int)
 * LongPredicate                                                                                 1 (long)
 *
 * DoubleFunction<R>                    R                       apply                            1 (double)
 * IntFunction<R>                                                                                1 (int)
 * LongFunction<R>                                                                               1 (long)
 *
 */
