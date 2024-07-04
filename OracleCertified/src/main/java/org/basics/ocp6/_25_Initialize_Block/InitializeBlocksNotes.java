package org.basics.ocp6._25_Initialize_Block;

class Initialize{

    // Genel olarak bir tane tanımlanır.
    // Fakat birden fazla da tanımlanabilir. Legaldir.
    // Çalışma sırası yukarıdan aşağıya doğrudur.
    // ilgili sınıf tipinde nesne oluşturduğumuzda çalışır.
    static {
        System.out.println("Static initialize block - 1");
    }

    Initialize(){
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static initialize block - 2");
    }

    // Birden fazla tanımlanabilir.
    // Çalışma sırası yukarıdan aşağıya doğrudur.
    {
        System.out.println("Instance initialize block - 1");
    }

    {
        System.out.println("Instance initialize block - 2");
    }

}

class Car{

}

public class InitializeBlocksNotes {

    public static void main(String[] args) {
        Initialize initialize1 = new Initialize();
        Initialize initialize2 = new Initialize();

        Car car1 = new Car();
    }

}

/**
 *
 * static initialize block; sınıf yüklendiğinde çalışır ve bir kez çalışır.
 * instance initialize block; nesne her oluştuğunda çalışır.
 *
 */
