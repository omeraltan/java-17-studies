package org.basics.ocp17.chapter09;

public class _17_Working_With_Generics {

    public static void main(String[] args) {



    }

}

interface Shippable<T> {
    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot>{
    public void ship(Robot t){}
}

class ShippableAbstractCrate<U> implements Shippable<U>{
    public void ship(U t){}
}

class ShippableCrate implements Shippable{
    public void ship(Object t){}
}

/**
 *
 * --------------- Implementing Generic Interfaces ---------------
 * Class'lar için tanımlandığı gibi interface'ler içinde type parameter tanımlanabilir.
 * Generic tiplerin bazı kısıtlamaları vardır. Bu kısıtlamaların nedeni, tip bilgisinin silinmesi durumudur.
 * Çalışma zamanında tip bilgisi belirli olan yapılara "reifiable" yapılar denir.
 * Type bilgisi silinen yapılara ise "non reifiable" yapılar denir.
 *
 *
 */
