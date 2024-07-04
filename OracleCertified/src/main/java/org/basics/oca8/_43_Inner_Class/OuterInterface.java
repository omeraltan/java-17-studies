package org.basics.oca8._43_Inner_Class;

public interface OuterInterface {

    interface NestedInterface {
        // private abstract void method();
    }

    // public static final değişkendir.
    int value = 100;

    public void method();

}

/**
 *
 * Nested interfaceler için access level public olmalıdır (methodlar için)
 * Nested interfaceler static özellik gösterirler
 *
 *
 */
