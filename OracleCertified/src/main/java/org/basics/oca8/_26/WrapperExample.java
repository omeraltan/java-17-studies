package org.basics.oca8._26;

public class WrapperExample {

    public static void main(String[] args) {
        Integer number1 = 10;
        Integer number2 = 10;

        Integer number3 = 1000;
        Integer number4 = 1000;

        // == kontrolü, referans type değişken için bu 2 değişken aynı objeyi mi gösteriyor?
        System.out.println(number1 == number2);
        System.out.println(number3 == number4);

        System.out.println("----------------");

        //
        System.out.println(number1.equals(number2));
        System.out.println(number3.equals(number4));



    }
}
