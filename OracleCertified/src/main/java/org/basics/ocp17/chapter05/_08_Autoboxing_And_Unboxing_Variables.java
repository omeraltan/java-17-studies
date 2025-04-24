package org.basics.ocp17.chapter05;

public class _08_Autoboxing_And_Unboxing_Variables {

    public static void main(String[] args) {

        int quack = 5;
        Integer quackquack = Integer.valueOf(quack);    // Convert int to Integer
        int quackquackquack = quackquack.intValue();    // Convert Integer to int

        int quack2 = 5;
        Integer quackquack2 = quack2;                   // Autoboxing
        int quackquackquack2 = quackquack2;             //

        Short tail = 8;                                 // Autoboxing
        Character p = Character.valueOf('p');
        char paw = p;                                   // Unboxing
        Boolean nose = true;                            // Autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e;                                  // Unboxing, then implicit casting

    }

}

/**
 *
 *
 *
 */
