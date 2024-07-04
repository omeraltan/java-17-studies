package org.basics.oca8._43_Inner_Class;

class OuterClassV2{
    private int privateNumber = 100;
    private static int privateStaticNumber = 200;
    class InnerClass{
        private int innerInstanceNumber = 200;
        private static int innerStaticNumber = 300;
        public void method(){
            System.out.println(privateNumber);
            // inner classlar outer classların private değişkenlerine erişim sağlayabilir.
            System.out.println(innerInstanceNumber);
            System.out.println(innerStaticNumber);
        }

        private static void t1(){

        }
    }
}

public class OuterClassTest {

    public static void main(String[] args) {
        OuterClassV2 outRef = new OuterClassV2();
        OuterClassV2.InnerClass inner = outRef.new InnerClass();
        OuterClassV2.InnerClass inner2 = outRef.new InnerClass();
        OuterClassV2.InnerClass inner3 = new OuterClassV2().new InnerClass();
    }

}
