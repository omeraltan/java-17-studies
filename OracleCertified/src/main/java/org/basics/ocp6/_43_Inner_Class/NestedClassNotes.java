package org.basics.ocp6._43_Inner_Class;

public class NestedClassNotes {

    public static void main(String[] args) {
        NestedClassNotes obj = new NestedClassNotes();
        obj.createMyLocalClass();
    }

    private String password = "12345";

    public void createMyLocalClass(){

        String name = "test";
        // name = "test2"; // Nested class lardaki değişkenler final veya efektif olarak final olması gerekmektedir.

        class LocalInner{
            private void method(){
                System.out.println(name);
                System.out.println(password);
            }
        }

        LocalInner obj = new LocalInner();
        obj.method();

    }

}


/**
 *
 * local inner class içerisinde tanımladığınız değişkenler private olamazlar.
 * Nested class lardaki değişkenler final veya efektif olarak final olması gerekmektedir (thread-safe olmasından kaynaklanmaktadır.).
 * Local Inner Class Outer class ın değişkenlerine erişebilir.
 * Local Inner Class ların içinde static kullanılamaz.
 */
