package org.basics.oca8._24;

public class ArrayInitialize {
    public static void main(String[] args) {
        int[] numbers = {20,30,40,50,60,70,80,90,100};
        int[] compileError;
        // compileError = {30,40,50}; // compile error
        compileError = new int[]{30,40,50}; // OK
    }
}
