package org.basics.ocp17.chapter07;

public class _14_Creating_Nested_Classes {

    public static void main(String[] args) {

    }

}

interface OuterNestedInterface{

    // private interface PrivateNestedInterface {} // DOES NOT COMPILE (Bir interface içerisinde interface'ler private olarak tanımlanamazlar.)

    // Modifier 'public' is redundant for interface members
    public interface PublicNestedInterface {
        public abstract void testMethod();
    }

    // Modifier 'static' is redundant for inner interfaces
    public static interface PublicStaticNestedInterface{
        public static final int VALUE = 2023;
    }

    public static class NestedClass{

    }

}

interface OuterNestedInterface2{

    public abstract void outerMethod();

    public interface PublicNestedInterface{
        public abstract void innerMethod();
    }

}

class OuterNestedInterface2Test implements OuterNestedInterface2.PublicNestedInterface{

    @Override
    public void innerMethod() {}
}

class OuterNestedInterface3Test implements OuterNestedInterface2, OuterNestedInterface2.PublicNestedInterface{

    @Override
    public void outerMethod() {}

    @Override
    public void innerMethod() {}
}

class OuterNestedInterface4Test{

    static enum NestedEnum{
        RED, BLUE, BLACK;
    }

    public static final record ImmutableRecord(int value){

    }

    public static sealed class Parent {

    }

    public static final class Child extends Parent{

    }


}

/**
 *
 * Nested Clas'lar tanımlayabildiğimiz gibi Nested Interface'lerde tanımlayabiliriz.
 * Bir interface içerisinde sadece public olarak nested class'ları tanımlayabiliriz.
 * Bir interface içerisinde interface tanımladığımızda implicitly olarak public static'tir.
 * Bir interface içerisinde Class tanımladığımızda implicitly olarak public ve static'tir.
 * Bir class'tan başka bir interface içerisinde tanımlanmış bir interface'i implemente etmek isterseniz bunun için "implements OuterInterface.InnerInterface" demeniz gerekmektedir.
 * Bir interface içerisinde enum tanımladığınızda, eğer belirtmezsek (implicitly olarak) "public static" olacaktır.
 * Bir interface içerisinde "record" tanımladığımızda implicitly olarak "public static final" 'dır.
 * Bir interface içerisinde "sealed" class tanımladığımızda implicitly olarak "public static" 'tir.
 *
 *
 */
