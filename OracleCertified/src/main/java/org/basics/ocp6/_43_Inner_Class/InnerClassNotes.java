package org.basics.ocp6._43_Inner_Class;

class OuterClass{

    private String name = "testuser";
    private class RegularInnerClass{

        private String password = "1244";
        private static String compilerError = "test";
        private void printMessage(){
            System.out.println(name); // Nested class lar private üyelere erişim sağlayabilir.
        }

    }

    private static String staticName = "static user!";
    protected static class StaticNestedClass{
        private String name = "test";
        private static String staticName = "test2";
    }

    public static void main(String[] args) {

        //RegularInnerClass inner = new RegularInnerClass(); // compiler error

        OuterClass outer = new OuterClass();
        RegularInnerClass inner = outer.new RegularInnerClass();
        inner.printMessage();
        OuterClassExample.InnerClass inner2 = new OuterClassExample().new InnerClass();
        System.out.println(outer.name);

        System.out.println(staticName);
        StaticNestedClass staticNested = new StaticNestedClass();
    }

    public void createInnerObject(){
        RegularInnerClass reg = new RegularInnerClass();
        System.out.println(reg.password);
    }

}

public class InnerClassNotes {

    public static void main(String[] args) {

    }
}

/**
 *
 * Nested Interface
 * Nested Class
 *  1 - non-static nested class(inner class)
 *      a - regular inner class
 *      b - local inner class
 *      c - anonymous inner class
 *  2 - static nested class
 *  3 - Nested interface ler
 *
 * mantıksal gruplama / logically grouping
 * nested class lar yardımcı classlardır.
 * bir class sadece bir class için anlamlı ise bu durumda iki class ı bir arada tutabiliriz.
 * outer class lar inner class ların private üyelerine erişim sağlayablir.
 * inner class lar outer class ların private üyelerine erişim sağlayabilir.
 * inner class larda static değişkenler tanımlanamazlar.
 * static nested class ta static değişken tanımlanabilir.
 *
 * ------------------------------------------------------
 *
 * source file oluşumu ;
 * javada bir .java dosyası / bir sınıf derlendiğinde .class dosyası oluşur.
 * "MyOuter$MyInner.class" şeklinde bir dosya daha oluşur!!!!
 * For Example:
 * class MyOuter{
 *     class MyInner{
 *
 *     }
 * }
 *
 * ------------------------------------------------------
 *
 * Mantıksal gruplama (logically grouping)
 * Bir sınıf / class sadece bir sınıf için anlamlıysa, bu durumda bu 2 sınıfı mantıksal olarak gruplayabiliriz.
 * Bu iki sınıfı bir arada tutabiliriz. Outer - Inner ilişkisi içerisinde.
 * Encapsulation artışı :
 * Javada bir private değişkene sadece ilgili sınıftan erişim sağlanabilir.
 * Kalıtım da olsa bu değişkene erişim sağlanamaz.
 * Nested class lar , outer class ların private üyelerine (instance değişken / method) erişim sağlayabilir!!1
 * Kalıtımla bu özellik sağlanamaz.
 *
 * Readable , maintainable özelliğine katkı sağlar.
 *
 */
