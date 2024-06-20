package org.basics.oca8._09.inheritance;

public class InheritanceTest {

}

abstract class CarModels {

    public abstract String brand();
    public abstract int getPrice();

    // bu methodlar kalıtım / extends vasıtasıyla kullanılabilir.
    // böylelikle Mercedes, Toyota ... sınıflar için yazmamış oluruz.
    // code duplication önlenir.
    public void drive(){
        System.out.println("drive...");
    }

    public void stop(){
        System.out.println("stop...");
    }

    public int door(){
        return 5;
    }
}

class Mercedes extends CarModels {

    @Override
    public String brand() {
        return "Mercedes Modeli";
    }

    @Override
    public int getPrice() {
        return 1_000_000;
    }

    @Override
    public int door() {
        return 2;
    }
}

class Toyota extends CarModels {

    @Override
    public String brand() {
        return "Toyota Modeli";
    }

    @Override
    public int getPrice() {
        return 500_000;
    }
}

class Ford extends CarModels {

    @Override
    public String brand() {
        return "Ford Modeli";
    }

    @Override
    public int getPrice() {
        return 750_000;
    }
}
