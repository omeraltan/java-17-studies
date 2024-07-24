package org.basics.ocp8._03_Interface;

interface Interface1{

    public default void defaultTestMethod(){
        System.out.println("interface1 default method1");
    }

}
interface Interface2{

    public default void defaultTestMethod(){
        System.out.println("interface2 default method2");
    }

}

public class DiamondProblem implements Interface1, Interface2{

    public static void main(String[] args) {
        Interface1 interface1 = new DiamondProblem();
        interface1.defaultTestMethod();
        Interface2 interface2 = new DiamondProblem();
        interface2.defaultTestMethod();
    }

    // DiamondProblem sınıfı, Interface1 ve Interface2 yi implements etmektedir.
    // Bu interfacelerde aynı isimde methodlar tanımlıdır (default).
    // Bu durumda diamond problem ortaya çıkmaktadır.
    // Sınıfımızda bu methodu override etmemiz gerekmektedir.
    @Override
    public void defaultTestMethod() {
        Interface1.super.defaultTestMethod(); // Bu şekilde de interface default methodu çağırılabilir. Legaldir.
        System.out.println("DiamondProblem defaultTestMethod"); // Bu method olmaz ise diamond problem olur.
    }
}
