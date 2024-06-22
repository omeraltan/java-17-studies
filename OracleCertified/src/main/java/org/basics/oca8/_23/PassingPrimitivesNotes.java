package org.basics.oca8._23;

public class PassingPrimitivesNotes {

    public static void main(String[] args) {
        int age = 10;
        System.out.println(age);
        // değişkenin kendisi değil kkopyası verilir.
        // kopya değer alınıp, methoda geçirilir.
        // 10 değerini ifade eden bit pattern'inin kopyası alınıp methoda verilir.
        updateNumber(age);
        System.out.println(age);
    }

    static void updateNumber(int number){
        number = number + 20;
        System.out.println(number);
    }

}

/**
 *
 *
 *
 */
