package org.basics.ocp8._03_Interface;

interface MyInterface {

    public  void testMethod1();
    public  void testMethod2();

    // default methodları override etmek zorunda değiliz.
    public default void defaultMethod() {
        System.out.println("default method");
    }

    public static void staticMethod() {
        System.out.println("static method");
    }

}

public class InterfaceTest01 implements MyInterface {

    @Override
    public void testMethod1() {

    }

    @Override
    public void testMethod2() {

    }
}

/**
 *
 * Bir interface abstract olduğu için extend ettiği diğer bir interface in abstract methodlarını override etmek zorunda değildir.
 *
 *
 */
