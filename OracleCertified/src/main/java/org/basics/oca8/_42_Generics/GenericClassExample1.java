package org.basics.oca8._42_Generics;

public class GenericClassExample1 {

    public static<T> void genericMethod(T[] array) {
        for(T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Boolean[] booleanArray = {true, false, true, false, true, false};

        genericMethod(intArray);
        genericMethod(doubleArray);
        genericMethod(booleanArray);


    }

}
