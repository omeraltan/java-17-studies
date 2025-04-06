package org.basics.ocp17.chapter03;

record Dog(String name, int age){}
record Cat(String name, String favoriteToy){}

public class Example3 {

    public static void main(String[] args) {
        printAnimalInfo(new Dog("Rex", 5));
        printAnimalInfo(new Cat("Whiskers", "yarn ball"));
        printAnimalInfo("Not an animal");
    }

    public static void printAnimalInfo(Object obj){
        if (obj instanceof Dog dog){
            System.out.println("Dog named " + dog.name() + " is " + dog.age() + " years old");
        } else if (obj instanceof Cat cat) {
            System.out.println("Cat named " + cat.name() + " loves " + cat.favoriteToy());
        } else {
            System.out.println("Unknown animal");
        }
    }

}


