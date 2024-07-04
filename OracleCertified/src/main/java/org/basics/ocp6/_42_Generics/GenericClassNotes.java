package org.basics.ocp6._42_Generics;

class GenericTypes<T>{

    private T genericReference;

    public GenericTypes(T genericReference) {
        this.genericReference = genericReference;
    }

    public T getGenericReference() {
        return genericReference;
    }

    public void setGenericReference(T genericReference) {
        this.genericReference = genericReference;
    }
}

public class GenericClassNotes {

    public static void main(String[] args) {

        GenericTypes<Integer> genericInteger = new GenericTypes<Integer>(10);
        GenericTypes<Double> genericDouble = new GenericTypes<Double>(10.0);
        GenericTypes<Float> genericFloat = new GenericTypes<Float>(10.0f);
        GenericTypes<Boolean> genericBoolean = new GenericTypes<Boolean>(true);
        GenericTypes<Character> genericCharacter = new GenericTypes<Character>('A');
        GenericTypes<Short> genericShort = new GenericTypes<Short>(Short.MAX_VALUE);
        GenericTypes<Byte> genericByte = new GenericTypes<Byte>(Byte.MAX_VALUE);
        GenericTypes<Long> genericLong = new GenericTypes<Long>(Long.MAX_VALUE);
        GenericTypes<String> genericString = new GenericTypes<String>(String.class.getName());

        System.out.println(genericInteger.getGenericReference());
        System.out.println(genericDouble.getGenericReference());
        System.out.println(genericFloat.getGenericReference());
        System.out.println(genericBoolean.getGenericReference());
        System.out.println(genericCharacter.getGenericReference());
        System.out.println(genericShort.getGenericReference());
        System.out.println(genericByte.getGenericReference());
        System.out.println(genericLong.getGenericReference());
        System.out.println(genericString.getGenericReference());

    }

}

/**
 *
 * E Element
 * K Key
 * V Value
 * T type
 * N Number
 *
 */
