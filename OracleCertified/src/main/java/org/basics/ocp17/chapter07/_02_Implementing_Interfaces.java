package org.basics.ocp17.chapter07;

public class _02_Implementing_Interfaces {

    public static void main(String[] args) {

    }

}

interface Nocturnal{
    public int hunt();
}

interface CanFly{
    public void flap();
}

interface HasBigEyes extends Nocturnal, CanFly{

}

class Owl implements HasBigEyes{
    public int hunt(){return 5;}
    public void flap(){System.out.println("Flap!");}
}

interface Herbivore { void eatPlants(); }

interface Omnivore { void eatPlants(); }

class Bear implements Herbivore, Omnivore {

    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}


/**
 *
 * Class'larda olduğu gibi bir interface bir interface'i kalıtabilir. Burada "extends" anahtar kelimesi kullanılır.
 * Class'ların aksine bir interface birden fazla interface'i kalıtabilir.
 * Bir Concrete class tarafından implements edilen bir interface için inherit edilmeyen bütün abstract methodların implemente edilmesi gerekmektedir.
 * Bir class bir interface'i extends edemez.
 * Bir interface bir class'ı extends edemez.
 * Java birbirleri ile uyumlu iki abstract methodu kalıtmamıza izin verir.
 *
 *
 */
