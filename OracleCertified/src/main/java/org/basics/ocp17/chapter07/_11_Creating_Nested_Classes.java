package org.basics.ocp17.chapter07;

public class _11_Creating_Nested_Classes {

    public static void main(String[] args) {

    }
}

class Home {
    private String greeting = "Hi";

    protected class Room {

        public int repeat = 3;

        public void enter(){
            for (int i = 0; i < repeat; i++){
                greet(greeting);
            }
        }
        private static void greet(String message){
            System.out.println(message);
        }
    }

    public void enterRoom(){
        var room = new Room();
        room.enter();
    }

    public static void main(String[] args) {
        var home = new Home();
        home.enterRoom();

        System.out.println("----------");

        var room = new Home().new Room();
        room.enter();
    }
}

class OuterClass{

    private String privateVariable = "OuterClass-instance-variable";
    private static String privateStatic = "OuterClass-static-variable";

    public static void main(String[] args) {
        OuterClass.InnerClass innerRef = new OuterClass().new InnerClass();
        innerRef.innerTestMethod();
        InnerClass.innerStaticMethod();
        OuterClass.InnerClass.innerStaticMethod();
        System.out.println(innerRef.privateInnerVariable);
        System.out.println(InnerClass.privateStaticInnerVariable);

    }

    private void outerTestMethod(){
        System.out.println("Outer Test Method");
    }

    private static void outerStaticTestMethod(){
        System.out.println("Outer Static Test Method");
    }

    class InnerClass{
        private String privateInnerVariable = "InnerClass-instance-variable";
        private static String privateStaticInnerVariable = "InnerClass-static-variable";

        protected static void innerStaticMethod() {
            System.out.println("Inner Static Test Method");
        }

        private void innerTestMethod() {
            System.out.println("Inner Test Method");
        }
    }

    static record Person(String name, String surname){

    }

}

class Outer {
    private int x = 10;
    class Inner {
        private int x = 20;
        class MoreInner {
            private int x = 30;
            public void allTheX(){
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(Inner.this.x);
                System.out.println(Outer.this.x);
            }
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Inner.MoreInner moreInner = inner.new MoreInner();
        moreInner.allTheX();
    }
}

class Fox {

    private class Den {

    }

    public void goHome(){
        new Den();
    }

    public static void visitFriend() {
        // new Den(); // DOES NOT COMPILE
        new Fox().new Den();
    }

}

/**
 *
 * Nested class'lar bir class içinde tanımladığımız başka class'lardır.
 * Java'da 4 tipte nested class tanımlayabiliriz. Bunlar:
 * Inner class          : non-static type'da, class'ın üyesi seiyesinde tanımladığımız class'lardır.
 * Static nested class  : static type'da class'ın üyesi seviyesinde tanımladığımız class'lardır.
 * Local class          : method body'si içerisinde tanımladığımız class'lardır.
 * Anonymous class      : local class'ların bir başka halidir. İsimleri yoktur.
 * Nested class'lar yardımcı class'lar olarak kullanılabilir. Bunun için private tanımlanması yeterlidir.
 *
 * Inner class'lar 4 access level'e sahip olabilir (public, protected, package ve private).
 * Inner class'lar bir class'ı kalıtabilir veya birden fazla interface'i implement edebilir.
 * Inner class'lar abstract yada final olabilir.
 * Outher class'ın üyelerine (private access level'e sahip olanlarda dahil) erişim sağlayabilir.
 * Nested class'lar 4 access level'e de sahip olabilirler (package level, private, public, protected). Bu konuda normal class tanımlamalarından farklıdırlar.
 * Java 16 ile birlikte nested class'lar içerisinde static methodların ve değişkenlerin tanımlamaları yapılabilmektedir.
 * Bir inner class'ın object'ini oluşturabilmek için ilk önce dışasıradki class'ın nesnesinin oluşturulması gerekmektedir.
 * Home$Room.class : inner class'ın derlenmesi sonucu böyle bir dosya oluşur (Outer$Inner.class).
 * Outer class'lar inner class'ların üyelerine, aynı şekilde, inner class'lar outer class'ların üyelerine erişim sağlayabilirler (Bunlar private olmalarına rağmen.).
 * static bir method instance bir methoda erişim sağlayamaz.
 * class'lar içerisinde bir nested record (inner) tanımı yapılabilir ve varsayılan olarak "static" 'tir.
 * Outer class ile Inner class aynı değişken veya method isimlerine sahip olurlarsa bu durumda "shadowing" meydana gelecektir.
 *
 */
