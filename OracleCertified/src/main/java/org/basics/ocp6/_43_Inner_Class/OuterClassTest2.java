package org.basics.ocp6._43_Inner_Class;

public class OuterClassTest2 {
    private int value = 200;

    class Inner{
        private int value = 300;

        void test(){
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(OuterClassTest2.this.value);
        }
    }
}

class OuterClassTest3{
    public static void main(String[] args) {
        OuterClassTest2.Inner inner = new OuterClassTest2().new Inner();
        inner.test();
    }
}
