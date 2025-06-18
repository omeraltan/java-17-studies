package org.basics.ocp17.chapter07;

public class _18_Understanding_Polymorphism {

    public static void main(String[] args) {



    }

}

class Penguin2 {
    public static int getHeight(){
        return 3;
    }
    public void printInfo(){
        System.out.println(this.getHeight());
    }
}

class CrestedPenguin2 extends Penguin2 {
    public static int getHeight(){
        return 8;
    }
    public static void main(String... fish){
        new CrestedPenguin2().printInfo();
    }
}

class Marsupial{
    protected int age = 2;
    public static boolean isBiped(){
        return false;
    }
}

class Kangaroo extends Marsupial{
    protected int age = 6;
    public static boolean isBiped(){
        return true;
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        Marsupial moey = joey;
        System.out.println(joey.isBiped());
        System.out.println(moey.isBiped());
        System.out.println(joey.age);
        System.out.println(moey.age);
    }
}

/**
 *
 *      ---Overriding vs. Hiding Members---
 * Hiding Members: Bir polymorphism biçimi değildir. Method overriding in aksine burada önemli olan referans tipinin ne olduğudur.
 * Hiding durumu; static methodlar, instance ve static değişkenler için ortaya çıkacaktır. Instance methodlar için hiding durumu yoktur. Bu işlem override işlemidir.
 * getHeight() methodu static olduğu için override edilmemiş yeniden tanımlanmıştır. Bundan dolayı burada nesnenin tipi değil, değişkenin tipi önemlidir.
 *
 *
 */
