package org.basics.ocp17.chapter02;

public class _11_Ternary_Operator {

    public static void main(String[] args) {

        int owl = 5;
        int food = owl < 2 ? 3 : 4;
        System.out.println(food);

        System.out.println("------------");

        int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        System.out.println(food1);

        System.out.println("------------");

        int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);
        System.out.println(food2);

        System.out.println("------------");

        int stripes = 7;
        System.out.println(stripes > 5 ? 21 : "Zebra");

        System.out.println("------------");

        Object obj = stripes > 5 ? 21 : "Zebra";
        System.out.println(obj);

        System.out.println("------------");

        // int animal = (stripes < 9) ? 3 : "Horse";        // -> DOES NOT COMPILE




    }

}

/**
 *
 * 1. Ternary Operator: booleanExpression ? expression1 : expression2
 * 2. Soru işaretinden önceki boolean ifade sağlandığında soru işaretinin sağındaki ifade çalışıcak sağlanmazsa iki nokta nın sağındaki ifade çalışıcaktır.
 *
 *
 */
