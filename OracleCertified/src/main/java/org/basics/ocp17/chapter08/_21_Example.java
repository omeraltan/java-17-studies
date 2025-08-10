package org.basics.ocp17.chapter08;

import java.util.function.Predicate;

public class _21_Example {

    public static void main(String[] args) {

    }

}

class Panda{

    static int age;

    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;
        check(p1, p -> age < 5);
    }

    private static void check(Panda panda, Predicate<Panda> pred){
        String result = pred.test(panda) ? "match" : "not match";
        System.out.println(result);
    }

}
