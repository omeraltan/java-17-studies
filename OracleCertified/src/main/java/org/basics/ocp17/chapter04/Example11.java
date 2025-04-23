package org.basics.ocp17.chapter04;

import java.util.Random;

public class Example11 {

    public static void main(String[] args) {

        double value = Math.min(12.2, 10.2);
        float value2 = Math.min(9.21f, 23.21f);
        int value3 = Math.min(12, 23);
        long value4 = Math.min(123, 12323);

        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);

        System.out.println("---------------");

        long low = Math.round(123.45);
        long high = Math.round(123.50);
        int fromFloat = Math.round(123.45f);

        System.out.println("Low rounded : " + low);
        System.out.println("High rounded : " + high);
        System.out.println("From float rounded : " + fromFloat);

        System.out.println("---------------");

        double c = Math.ceil(3.14);
        double f = Math.floor(3.14);

        System.out.println("Ceil : " + c);
        System.out.println("Floor : " + f);

        System.out.println("---------------");

        double squared = Math.pow(5,2);
        double area = Math.pow(5,3);

        System.out.println("Squared : " + squared);
        System.out.println("Area : " + area);

        System.out.println("---------------");

        double num = Math.random();
        System.out.println("Random number : " + num);

        System.out.println("---------------");

        Random random = new Random();

        System.out.println("Random Double : " + random.nextDouble());
        System.out.println("Random Integer : " + random.nextInt());
        System.out.println("Random Integer (0-10) : " + random.nextInt(10));

        System.out.println("---------------");

        System.out.println("Random Integer (0-100) : " + random.nextInt(100));
        System.out.println("Pow (2^5): " + Math.pow(2,5));
        System.out.println("Round negative number : " + Math.round(-12.54));

    }

}
