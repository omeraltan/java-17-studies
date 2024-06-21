package org.basics.oca8._17;

public class HelloWorld {

    String name = "levent"; // instance variable. Instance variable nesneye aittir.

    public static void main(String[] args) {
        // hangi nesnenin name alanı?
        // ortada bir nesne yok.
        // static methoddan direkt olarak instance methoda veya instance variable a erişim sağlanamaz.
        // System.out.println(name);
        // testMethod();
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.name);
        helloWorld.testMethod();


    }

    // Bu methoda erişim olduğu noktada ortada bir nesnenin olması gerekmektedir.
    // Dolayısıyla nesne varsa instance variable da vardır.
    private void testMethod(){
        System.out.println(this.name);
    }
}
