package org.basics.ocp17.chapter07;

public class _02_Implementing_Interfaces {
    public static void main(String[] args) {}
}

interface Nocturnal{
    public abstract int hunt();
}

interface CanFly{
    public abstract void flap();
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

    // Diamond  problem is solving
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}

interface A {
    void method();
}

interface B {
    void method();
}

class C implements A, B {
    @Override
    public void method() {
        System.out.println("Tek bir implementasyon");
    }
}


/**
 *
 * Class'larda olduğu gibi bir interface bir interface'i kalıtabilir (Burada "extends" anahtar kelimesi kullanılır.).
 * Class'ların aksine bir interface birden fazla interface'i kalıtabilir.
 * Bir Concrete class tarafından implements edilen bir interface için inherit edilmeyen bütün abstract methodların implemente edilmesi gerekmektedir.
 * Bir class bir interface'i extends edemez.
 * Bir interface bir class'ı extends edemez.
 * Java birbirleri ile uyumlu iki abstract methodu kalıtmamıza izin verir (Bu ifade, Java'da iki farklı interface'den gelen aynı imzaya sahip (aynı isim, parametreler ve dönüş tipi) abstract metodları tek bir sınıfta uygulayabilmemiz anlamına gelir. Bu durum "diamond problem" (elmas problemi) olarak bilinen bir durumun çözümüdür.).
 * Bir interface başka bir interface'i extends anahtar kelimesi ile kalıttığında kalıttığı interface'in abstract methodlarını override etmek zorunda değildir. Çünkü ikiside abstract'tır.
 * Bir interface'i implement eden bir class interface tarafından override edilmeyen bütün abstract methodları override etmek zorundadır.
 */
