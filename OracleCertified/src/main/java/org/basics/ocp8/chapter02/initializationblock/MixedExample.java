package org.basics.ocp8.chapter02.initializationblock;

class MixedExample {
    // Instance initialization block
    {
        System.out.println("Instance Initialization Block 1");
    }

    // Static initialization block
    static {
        System.out.println("Static Initialization Block 1");
    }

    MixedExample() {
        System.out.println("Constructor");
    }

    // Another instance initialization block
    {
        System.out.println("Instance Initialization Block 2");
    }

    // Another static initialization block
    static {
        System.out.println("Static Initialization Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        MixedExample ex1 = new MixedExample();
        MixedExample ex2 = new MixedExample();
    }
}
