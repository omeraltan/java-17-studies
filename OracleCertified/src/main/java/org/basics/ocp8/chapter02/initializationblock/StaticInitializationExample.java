package org.basics.ocp8.chapter02.initializationblock;

public class StaticInitializationExample {
    static {
        // Statik başlatma bloğu
        System.out.println("Static initialization block");
    }

    public StaticInitializationExample() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new StaticInitializationExample();
    }
}
