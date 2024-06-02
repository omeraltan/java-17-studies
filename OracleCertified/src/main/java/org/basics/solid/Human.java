package org.basics.solid;

/**
 * (Interface Segregation Principle) - Arayüz Ayrımı Prensibi
 * Bir sınıf, kullanmadığı metodların yer aldığı arayüzleri implement etmek zorunda kalmamalıdır.
 * Daha küçük ve spesifik arayüzler, büyük ve genel arayüzlere tercih edilmelidir.
 */
interface Worker {
    void work();
}

interface Eater {
    void eat();
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

public class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}
