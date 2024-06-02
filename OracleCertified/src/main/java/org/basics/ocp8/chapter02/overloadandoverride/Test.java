package org.basics.ocp8.chapter02.overloadandoverride;

class Animal {
    public void doSomething(Animal a) {
        System.out.println("Animal version");
    }

    public void doSomething(Horse h) {
        System.out.println("Horse version");
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Horse extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Neigh");
    }

    public void doSomething(Horse h) {
        System.out.println("Horse version in Horse class");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Horse();
        animal.doSomething(animal); // Bu "Animal version" yazdırır
        animal.makeSound(); // Bu "Neigh" yazdırır
    }
}
