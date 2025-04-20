package org.basics.ocp17.chapter04;

public class _13_Multi_Dimensional_Array {

    public static void main(String[] args) {

        // int[] [] values = new int[][5]; // DOES NOT COMPILE
        int[] [] values = new int[3][4];

        values[0] = new int[5];
        values[1] = new int[3];
        values[2] = new int[10];

        int[] intArray = new int[3];
        int[][] intMultiArray = new int[5][];

        intMultiArray[0] = intArray;

    }

}

/**
 *
 *
 * multi dimensional array için ilk değerin verilmesi gerekiyor.
 *
 *
 */
