package org.basics.ocp8.chapter02.supertype;

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bark");
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

