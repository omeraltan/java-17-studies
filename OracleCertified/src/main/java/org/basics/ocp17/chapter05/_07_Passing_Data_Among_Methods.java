package org.basics.ocp17.chapter05;

public class _07_Passing_Data_Among_Methods {

    public static void main(String[] args) {
        int num = 4;
        newNumber(4);
        System.out.println(num);    // -> num = 4

        System.out.println("---------------");

        String name = "Webby";
        speak(name);
        System.out.println(name);

        System.out.println("---------------");

        var sb = new StringBuilder("Webby");
        speak(sb);
        System.out.println(sb);

    }

    public static void newNumber(int num){
        num = 8;
    }

    public static void speak(String name){
        name = "Georgette";
        System.out.println(name);
    }

    public static void speak(StringBuilder s){
        s.append("George");
    }

}

/**
 *
 * Java "Pass By Value" özelliğine sahip bir programlama dilidir.
 * Bunun anlamı değişkenin bir kopyası yapılır ve programa bu kopya geçer.
 *
 *
 */
