package org.basics.ocp17.chapter08;

public class _22_Example {

    public static void main(String[] args) {



    }

}

interface Climb2{
    boolean isTooHigh(int height, int limit);
}

class Climber{
    public static void main(String[] args) {
        check((h, a) -> h > 3, 5);
    }
    private static void check(Climb2 climb, int height){
        if (climb.isTooHigh(height, 10));
        System.out.println("too high");
    }
}
