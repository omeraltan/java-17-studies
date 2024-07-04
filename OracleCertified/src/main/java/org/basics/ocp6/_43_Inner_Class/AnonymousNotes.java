package org.basics.ocp6._43_Inner_Class;

interface MyInterface{

}

class Person {

    public void printMessage() {

        System.out.println("Hello Message!");


    }
}

public class AnonymousNotes {

    public static void main(String[] args) {

        Person person = new Person();
        person.printMessage();

        Person anonimClass = new Person(){

            @Override
            public void printMessage() {
                System.out.println("Hello anonimClass!!");
            }

        };

        System.out.println(person.getClass());
        System.out.println(anonimClass.getClass());

        anonimClass.printMessage();

        Runnable runnable = new Runnable() {

            @Override
            public void run() {

            }
        };

        MyInterface myInterface = new MyInterface() {

        };

    }

}

/**
 *
 *
 *
 */
