package org.basics.ocp8._02_Lambda;

@FunctionalInterface
interface Functional{
    @Override
    public boolean equals(Object obj); // -> Bu method functional interface liği sağlamaz.

    public boolean equalsX(Object obj);
}

public class FunctionalInterface01 {

}


/**
 *
 * Bu method java.lang.Object sınıfında yer aldığı için abstract method sayısını artırmaz.
 * FunctionalInterface için gerekli olan sadece tek bir tane abstract method şartını bozmaz.
 * Bunun bir etkisi olmaz.
 * Her sınıf için IS-A java.lang.Object önermesi doğrudur.
 * Fakat interfaceler sınıf hiyerarşisinde yer almazlar.
 * Bununla birlikte böyle bir özel durum vardır.
 *
 */
