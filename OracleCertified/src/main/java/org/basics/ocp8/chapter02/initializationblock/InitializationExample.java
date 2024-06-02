package org.basics.ocp8.chapter02.initializationblock;

public class InitializationExample {
    {
        // Örnek başlatma bloğu
        System.out.println("Instance initialization block");
    }

    public InitializationExample() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new InitializationExample();
    }
}
