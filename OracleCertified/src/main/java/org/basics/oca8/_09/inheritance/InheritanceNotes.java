package org.basics.oca8._09.inheritance;

interface Speedy{

}

class Vehicle{

}
class Car extends Vehicle{

}

class Computer{
    private int price;
    private Keyboard keyboard; // Computer HAS-A Keyboard önermesi doğrudur.
}

class Keyboard {

}


class BMW extends Car implements Speedy{

}

public class InheritanceNotes {

}

/**
 *
 * inheritance :
 * inheritance / kalıtım ın iki temel amacı vardır.
 *
 * 1 - kod tekrarını önlemek / kodun tekrar kullanılabilir olmasını sağlamak
 * 2 - polymorphism i sağlamaktır.
 *
 * IS - A nedir?
 * extends ve implements için geçerlidir.
 * Car IS-A Vehicle önermesi doğrudur.
 * BMW IS-A Car ve BMW IS-A Speedy önermeleri doğrudur.
 *
 * HAS - A nedir? (Composition)
 * Composition ın inheritance ile ilişkisi yoktur.
 * bir class içerisinde bir başka class tipinde instance değişken tanımlı ise bu durumda bir HAS-A ilişkisi vardır.
 *
 */
