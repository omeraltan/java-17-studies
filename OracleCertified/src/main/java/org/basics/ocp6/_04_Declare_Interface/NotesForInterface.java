package org.basics.ocp6._04_Declare_Interface;

import java.io.Serializable;

public class NotesForInterface {

}

/**
 *
 * interface, implements
 * java8 e kadar interface lerde abstract methodlar tanaımlanabiliyordu.
 * java8 ile birlikte artık static ve default methodlar tanımlanabilir.
 * interface in methodları : public ve abstracttır.
 * interface in değişkenleri : public static ve final dır.
 *
 *
 */

interface MyRunnable extends Runnable, Serializable {

    // all of them same
    static int x = 1;
    final static int y = 2;
    public static final int z = 3;
    public final int w = 4;
    static final int e = 5;
    public static final String VALUE_NAME = "OMER";


    public abstract void run();
    abstract  public void testMethod();
    void testMethod2();
    int sum(int a, int b);

    default void myMethod(){
        System.out.println("My Method");
    }

    public static void myStaticMethod(){
        System.out.println("My Static Method");
    }

    static void myStaticMethod2(){
        System.out.println("My Static Method 2");
    }
}
