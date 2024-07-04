package org.basics.ocp6._26_Wrapper;

public class OverloadedExample {

    public static void main(String[] args) {
        // 100 -> primitive int tipinde literal
        overloaded(100);
        // long çalışır nesne tipi (Integer) yerine primitive tercih edilir.
    }

    // int -> widening
    public static void overloaded(long lo){
        System.out.println("long");
    }

    // int -> Integer boxing
    public static void overloaded(Integer lo){
        System.out.println("Integer");
    }

}
