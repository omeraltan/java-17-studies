package org.basics.ocp17.chapter06;

public class _09_Creating_A_Concrete_Class {

    public static void main(String[] args) {



    }

}

abstract class Carnivorous{
    public abstract String getName();
}

// class Walrus extends Carnivorous{} // -> DOES NOT COMPILE

abstract class Mammall{
    abstract void showHorn();
    abstract void eatLeaf();
}

abstract class Rhinno extends Mammall{
    void showHorn(){}
}

class BlackRhino extends Rhinno{
    void eatLeaf(){}

}

abstract class Whale{
    // private abstract void sing(); // -> DOES NOT COMPILE
}

/**
 *
 * Bir abstract class "concrete" class tarafından extend edildiğinde anlamlı hale gelecektir.
 * Bir concrete class abstract bir class'ı extend ettiğinde abstract class'ın ve onun üstünde bulunan abstract class'ların implement edilmeyene bütün abstract methodlarını uygulamak zorundadır.
 * Java da "abstract" ve "final" keyword'leri birbirinin zıttıdır. Bundan dolayı bir arada kullanılamazlar.
 * Bir class'a final dediğimizde bu class'ı kalıtamayız abstract class'lar ise kalıtılmak için vardır.
 * Bir method abstract ve private olarak tanımlanamaz.
 * static methodlar hidden (tekrardan tanımlanabilir) olabilirler override edilemezler. Java da sadece isntance methodlar override edilebilir, static methodlar override edilemezler.
 * static methodlar class'a aittir object'e ait değildir. Dolayısıyla bir method hem static hemde abstract olarak tanımlanamaz.
 *
 *
 */
