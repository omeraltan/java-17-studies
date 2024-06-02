package org.basics.ocp8.chapter02.constructor;

class Animal {
    private String name;

    public Animal() {
        this("Unknown");
    }

    public Animal(String name) {
        this.name = name;
    }
}

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }
}

