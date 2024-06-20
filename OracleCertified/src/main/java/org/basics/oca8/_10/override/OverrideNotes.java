package org.basics.oca8._10.override;

class Computer{

    int processor = 2;
    static int ram = 4;

    public void boot(){
        System.out.println("Computer Booting...");
    }
    public static void shutdown(){
        System.out.println("Computer Shutdown...");
    }
    private void reset(){
        System.out.println("Computer Reset...");
    }
    public final void install(){
        System.out.println("Computer Install...");
    }
}

class Laptop extends Computer{

    int processor = 8;
    static int ram = 16;

    public void boot(){
        System.out.println("Laptop Booting...");
    }
    public static void shutdown(){
        System.out.println("Laptop Shutdown...");
    }
    private void reset(){
        System.out.println("Computer Reset...");
    }
//    public final void install(){
//        System.out.println("Computer Install...");
//    }
}

public class OverrideNotes {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.boot();
        Laptop laptop = new Laptop();
        laptop.boot();
        Computer laptopComputer = new Laptop();
        laptopComputer.boot();
        laptopComputer.shutdown();

        System.out.println(laptopComputer.processor);
        System.out.println(laptopComputer.ram);
    }

}

/**
 *
 * override kavramından bahsedebilmek için :
 * extends yada implements keyword'ü olmalıdır. IS-A ilişkisi gereklidir.
 * static methodlar override edilemezler.
 * @Override anotasyonu sadece override edilen metodların üstüne koyulabilir.
 * private methodlar override edilemezler. Çünkü görünür değillerdir.
 * final methodlar override edilemezler.
 * override methodlar için dynamic dispatch denilen mekanizma işler
 * hangi override metodun çalışacağına java run time da karar verir.
 * objenin tipine göre ilgili method çalışır.
 * değişken tipi önemlidir. LaptopComputer reference type değişkenin tipi Computer sınıfında yer alan değerler yazılır.
 * değişkenler için override diye bir kavram söz konusu değildir.
 */
