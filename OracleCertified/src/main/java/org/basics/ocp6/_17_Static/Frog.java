package org.basics.ocp6._17_Static;

public class Frog {

    static int frogCount = 0; // Declare and initialize static variable

    public Frog() {
        frogCount += 1; // Modify the value in the constructor.
    }

    public static void main(String[] args) {
        new Frog();
        new Frog();
        new Frog();
        System.out.println("Frog count is now " + frogCount);
    }
}
