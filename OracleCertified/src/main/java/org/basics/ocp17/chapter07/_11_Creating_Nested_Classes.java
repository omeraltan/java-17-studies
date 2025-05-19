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
        Room.greet("Hello");
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
 * Java'da 4 tipte nested class tanımlayabiliriz. Bunlar: "Inner Class", "Static Nested Class", "Local Class" ve "Anonymous Class"
 * Bu dört tip nested class'ın özellikleri:
 *
 * Inner Class:
 * 1. Dış sınıfın instance'ına ihtiyaç duyar.
 * 2. Outer.Inner inner = outer.new Inner(); şeklinde oluşturulur.
 * 3. Dış sınıfın tüm üyelerine erişebilir.
 *
 * Static Nested Class:
 * 1. Dış sınıfın instance'ına ihtiyaç duymaz.
 * 2. Outer.StaticNested nested = new Outer.StaticNested(); şeklinde oluşturulur.
 * 3. Sadece static üyelere erişebilir.
 *
 * Local Inner Class:
 * 1. Sadece tanımlandığı method içinde kullanılabilir.
 * 2. Method'un değişkenlerine erişebilir (final veya effectively final).
 * 3. Method dışında oluşturulamaz.
 *
 * Anonymous Inner Class:
 * 1. İsimsizdir.
 * 2. Tek seferlik kullanım için uygundur.
 * 3. Genellikle "event handling" gibi durumlarda kullanılır.
 *
 * Nested class'lar yardımcı class'lar olarak kullanılabilir. Bunun için private tanımlanması yeterlidir.
 * Inner class'lar 4 access level'e sahip olabilir (public, protected, package ve private).
 * Inner class'lar bir class'ı kalıtabilir veya birden fazla interface'i implement edebilir.
 * Inner class'lar abstract yada final olabilir.
 * Outher class'ın üyelerine (private access level'e sahip olanlarda dahil) erişim sağlayabilir.
 * Nested class'lar 4 access level'e de sahip olabilirler (package level, private, public, protected). Bu konuda normal class tanımlamalarından farklıdırlar.
 * Java 16 ile birlikte nested class'lar içerisinde static methodların ve değişkenlerin tanımlamaları yapılabilmektedir.
 * Bir inner class'ın object'ini oluşturabilmek için ilk önce dışarıdaki class'ın nesnesinin oluşturulması gerekmektedir.
 * Home$Room.class : inner class'ın derlenmesi sonucu böyle bir dosya oluşur (Outer$Inner.class).
 * Outer class'lar inner class'ların üyelerine, aynı şekilde, inner class'lar outer class'ların üyelerine erişim sağlayabilirler (Bunlar private olmalarına rağmen.).
 * static bir method instance bir methoda erişim sağlayamaz.
 * class'lar içerisinde bir nested record (inner) tanımı yapılabilir ve varsayılan olarak "static" 'tir.
 * Outer class ile Inner class aynı değişken veya method isimlerine sahip olurlarsa bu durumda "shadowing" meydana gelecektir.
 *
 */
