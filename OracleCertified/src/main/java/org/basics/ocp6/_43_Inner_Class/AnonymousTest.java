package org.basics.ocp6._43_Inner_Class;

class Keyboard{

    void write(){
        System.out.println("Write");
    }

}


public class AnonymousTest {

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.write();

        //

        Keyboard keyboard2 = new Keyboard(){
            void write(){
                System.out.println("override for anonymous!");
            }
        };

        keyboard2.write();
    }

}
