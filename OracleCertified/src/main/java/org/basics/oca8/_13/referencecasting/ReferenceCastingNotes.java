package org.basics.oca8._13.referencecasting;

class Animal{
    public void eat(){
        System.out.println("Animal eat...");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eat...");
    }
    public void bark(){
        System.out.println("Dog bark...");
    }
}

class Kangal extends Dog{

}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eat...");
    }
    public void meow(){
        System.out.println("Cat meow...");
    }
}

public class ReferenceCastingNotes {
    public static void main(String[] args) {
        // Nesne tipi Dog, değişken tipi Animal
        Animal animalDog = new Dog();

        // DOWNCASTING
        Dog dogDog = (Dog) animalDog;
        dogDog.eat();
        dogDog.bark();

        // Cat cat = (Cat) animalDog; // java.lang.ClassCastException verir. Cat referans değişkeni Dog objesini gösteremez.

        // Animal animal = new Animal(); // java.lang.ClassCastException verir.
        // Animal tipindeki bir objeyi Dog tipindeki bir referans değişken göstersin denmektedir.
        // Dog dog = (Dog) animal;

        Animal animalKangal = new Kangal();
        // Kangal IS-A Dog and Dog IS-A Animal because of this Kangal IS-A Animal
        Dog dogKangal = (Dog) animalKangal;

        Dog upcastingDog = new Dog();
        Animal animalUpcastingDog = upcastingDog; // UPCASTING
    }
}

/**
 *
 * upcasting   :
 * downcasting :
 *
 */
