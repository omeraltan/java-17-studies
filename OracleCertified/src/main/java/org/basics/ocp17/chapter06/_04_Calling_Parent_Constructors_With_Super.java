package org.basics.ocp17.chapter06;

public class _04_Calling_Parent_Constructors_With_Super {

    public static void main(String[] args) {



    }

}

class Animal{
    private int age;
    public Animal(int age){
        super();    // Refers to constructor in java.lang.Object
        this.age = age;
    }
}

class Zebra extends Animal {
    public Zebra(int age){
        super(age); // Refers to constructor in Animal
    }
    public Zebra(){
        this(4); // Refers to constructor in Zebra with int argument
    }
}

class Mammal{
    public Mammal(int age){}
}

// class Seal extends Mammal{} // -> DOES NOT COMPILE

// class Elephant extends Mammal{public Elephant(){}     // -> DOES NOT COMPILE}

/**
 *
 * Bir constructor'ın ilk ifadesi ya this() olmalı veya super() olmalıdır.
 * "this()" ile overloaded constructor'lar çağırılır. "super()" ile super sınıfın constructor'ları çağırılır.
 * "super()" ve "this()" aynı constructor içinde kullanılamaz.
 * super ve super() arasındaki fark; super kullandığımızda parent sınıftaki member'lara erişiriz. super() ile ise parent ta bulunan constructor çağırılır.
 * Bir class içerisinde constructor tanımladığımızda Java bizim için bir parametresiz constructor tanımlayacak ve içine de super() koyacaktır.
 *
 *
 */

