package org.basics.oca8._42;

import java.util.ArrayList;
import java.util.List;

class Animal{

}

class Dog extends Animal{

}

class Cat extends Animal{

}

public class GenericsExample2 {

    public static void main(String[] args) {


        Animal animalRef = new Dog();
        // Dog IS-A Animal
        // List<Animal> list1 = new ArrayList<Dog>();
        // Legal değildir. Sol taraf neyse sağ tarafta öyle olmalıdır.
        // Burada Dog IS-A Animal olsa da durum değişmez.

        List<Animal> listAnimal = new ArrayList<Animal>();
        List<Animal> listAnimalV2 = new ArrayList<>();



        Animal[] array1 = new Dog[5];
        // bu durum arrayler için legaldir.
        arrayRuleV1(array1);
        listRuleV1(listAnimal);


    }

    private static void arrayRuleV1(Animal[] arrayAnimal) {
        arrayAnimal[0] = new Dog();
        arrayAnimal[1] = new Cat(); // java.lang.ArrayStoreException
    }

    private static void listRuleV1(List<Animal> animalList) {
        animalList.add(new Dog());
        animalList.add(new Cat());
    }

}
