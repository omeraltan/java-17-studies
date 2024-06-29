package org.basics.oca8._42;

public class GenericsExample4 {

    public static void main(String[] args) {
        boundedType(100);
        boundedType(100.05);
        boundedType(100L);
        // boundedType("compile error"); // String IS-A Number değildir.
        // Burada methodun demek istediği T extends Number -> T tipi Number sınıfının subclass'ı olsun diyor.
        unboundedType(100.05);
        unboundedType(100L);
        unboundedType("key");
        unboundedType("value");
        unboundedType(101);
        unboundedType(true);
    }

    // <T extends Number> -> Buna bounded type parameter denir.
    public static <T extends Number> void boundedType(T t){
        System.out.println(t.getClass());
    }

    public static <T> void unboundedType(T t){
        System.out.println(t.getClass());
    }

}
