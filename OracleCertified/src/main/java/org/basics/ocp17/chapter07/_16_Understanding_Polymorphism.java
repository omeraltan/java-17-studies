package org.basics.ocp17.chapter07;

public class _16_Understanding_Polymorphism {

    public static void main(String[] args) {

    }

}

class Bird{

}

class Fish{
    public static void main(String[] args) {
        Fish fish = new Fish();
        // Bird bird = (Bird)fish;     // DOES NOT COMPILE
    }
}

interface Canine5{}
interface Dog5{}
class Wolf5 implements Canine5{}

class BadCasts{
    public static void main(String[] args) {
        Wolf5 wolfy = new Wolf5();
        Dog5 badWolf = (Dog5) wolfy; // COMPILE-TIME ClassCastException
    }
}

class Rodent{

}

class Capybara extends Rodent{

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        // var capybara = (Capybara) rodent;

        if (rodent instanceof Capybara){
            var capybara = (Capybara) rodent;
            System.out.println("instanceof true!");
        }
    }

}

/**
 *
 * Casting Objects :
 * Primate primate = lemur;         // Implicit Cast to supertype
 * Lemur lemur2 = (Lemur) primate   // Explicit Cast to subtype
 * Lemur lemur3 = primate           // DOES NOT COMPILE (missing cast)
 * Cast işlemi yapığımız Object cast ettiğimiz class ile uyumlu değilse bu durumda çalışma zamanında "ClassCastException" hatası alırız.
 *
 * 1. Subtype'dan Supertype'a casting işlemi (explicitly) açık bir şekilde ihtiyaç duyulmaz.
 * 2. Supertype'dan subtype'a casting işlemi (explicitly) açık bir şekilde ihtiyaç duyulur.
 * 3. Çalışma zamanında, uyumsuz bi referans tipine casting işlemi "ClassCastException" fırlatacaktır.
 * 4. Compiler, birbiri ile alakasız tipler için derleme hatası verecektir.
 * Aralarında hiyerarşik bir duru olmayan class'lar için casting işlemi (IS-A, HAS-A) söz konusu değildir.
 * Cating Interface :
 * Birbirleri ile alakasız yani unrelated tipindeki class'lar için casting işlemi her zaman derleme hatası verecektir. Fakat bu durum interface'ler için her zaman geçerli değildir.
 * Belirli bir sınıf, bir inerface'i implement etmezken, bazı sub class'ları interface'i implements edebilir.
 *
 *
 *
 */
