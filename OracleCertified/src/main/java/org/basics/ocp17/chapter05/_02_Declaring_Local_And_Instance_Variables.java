package org.basics.ocp17.chapter05;

import org.basics.ocp6._49_Javac_And_Java.pack1.Animal;

public class _02_Declaring_Local_And_Instance_Variables {

    int hunger = 4;     // instance variable

    public static void main(String[] args) {

        int snack = 10;     // local variable

    }

    {
        int val = 12;       // local variable
    }

    public int feedZooAnimals(){
        int loop = 10;      // local variable
        if (loop > 4){
            long dinnerTime = loop++;   // local variable
            hunger--;
        }
        return loop;
    }

    public void zooAnimalCheckup(boolean isWeekend){
        final int rest;
        if (isWeekend){
            rest = 5;
        }else {
            rest = 20;
        }
        System.out.println(rest);


        final var giraffe = new Animal();
        final int[] friends = new int[5];

        // rest = 10;               // DOES NOT COMPILE
        // giraffe = new Animal();  // DOES NOT COMPILE
        // friends = null;          // DOES NOT COMPILE
    }

    public void zooAnimalCheckup2(boolean isWeekend){
        final int rest;
        if (isWeekend) rest = 5;
        // System.out.println(rest);    // -> DOES NOT COMPILE because we don't use "else"
    }

    public String zooFriends(){
        String name = "Harry the Hippo";    // Effectively final
        var size = 10;
        boolean wet;                        // Effectively final
        if (size > 100) size ++;
        name.substring(0);
        wet = true;
        return name;
    }

}

class Polarbear{
    final int age = 10;
    final int fistEaten;
    final String name;
    {fistEaten = 10;}

    public Polarbear(){
        name = "Robert";
    }
}

/**
 *
 * Local Variables              : Methodlarda veya block larda tanımladığımız değişkenlerdir.
 * Instance Variables           : Sınıfın üyesi olan değişkenlerdir.
 * Local Variable Modifiers     : Bir local variable a sadece final anahtar kelimesi uygulanabilir. Bir final değişkene iki kez değer ataması yapılamaz.
 * Effectively Final Variables  : Bir local variable a final anahtar kelimesini eklediğimizde bir değişiklik olmuyorsa effectively final variable dır diyebiliriz.
 * Instance Variable Modifiers  : package level methodlar için her hangi bir access modifiers kullanılmadığında olacak olan erişim seviyesidir.
 * 1- final anahtar kelimesi local variabler lar için kullanılabildiği gibi insance variable lar içinde kullanılabilir.
 *
 */
