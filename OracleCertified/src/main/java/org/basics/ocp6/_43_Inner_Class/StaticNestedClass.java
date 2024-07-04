package org.basics.ocp6._43_Inner_Class;


class Outer {

    private int value = 20;
    private static int valueStatic = 200;

    static class StaticNested {

        // sttatic nested classlar, outer classların static değişkenlerine yada static methodlarına erişim sağlayabilir.
        void method() {
            System.out.println("Inside StaticNested method");
            //System.out.println(value);
            System.out.println(valueStatic);
        }

        static void staticMethod() {
            System.out.println("Inside StaticNested method");
        }
    }

}



public class StaticNestedClass {

    public static void main(String[] args) {
        // regular inner class için; outer class ın objesi olmadan inner class ın objesinden bahsedemeyiz.
        Outer.StaticNested s = new Outer.StaticNested();
        Outer.StaticNested.staticMethod();

    }

}
