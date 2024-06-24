package org.basics.oca8._31;

import java.io.FileNotFoundException;

public class ExceptionExample2 {

    public static void main(String[] args) {
        throwUnCheckedException();
        try {
            throwCheckedException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void throwUnCheckedException() {
        throw new NullPointerException("This is a checked exception");
    }

    public static void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException("This is a checked exception");
    }
}
