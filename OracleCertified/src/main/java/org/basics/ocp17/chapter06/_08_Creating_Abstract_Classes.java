package org.basics.ocp17.chapter06;

public class _08_Creating_Abstract_Classes {

    public static void main(String[] args) {



    }

}

abstract class Canine{
    public abstract String getSound();
    public void bark(){System.out.println(getSound());}
}
class Wolf extends Canine{

    @Override
    public String getSound() {
        return "Wooooooof!";
    }
}
class Fox extends Canine{

    @Override
    public String getSound() {
        return "Squeak!";
    }
}
class Coyote extends Canine{

    @Override
    public String getSound() {
        return "Roar!";
    }
}

class BarkingTest{
    public static void main(String[] args) {
        Canine w = new Fox();
        w.bark();

        w = new Wolf();
        w.bark();
    }
}

/**
 *
 * abstract Java'da bir anahtar kelimedir. Class'larda ve methodlarda bu anahtar kelime kullanılmaktadır.
 * abstract class; sınıf tanımında "abstract" modifier kullandığımız, içerisinde abstract methodların yer alabileceği, kendisinden object oluşturamayacağımız, fakat constructor'ının olduğu bir sınıf tipidir.
 * Bir abstract sınıf abstract bir methoda sahip olabilir aynı şekilde nunabstract methodlarada sahip olabilir.
 * abstract bir method "abstract" modifier ile tanımlanmış gövdesi olmayan bir methoddur.
 * abstract methodlar doğası gereği override edilmek için vardırlar.
 * Sadeee instance methodlar abstract olabilirler, değişkenler, constructorlar veya static methodlar abstract olamazlar.
 * abstract method sadece abstract class içinde tanımlanabilir.
 * bir nunabstract class extend ettiği abstract bir class'ın tüm abstract methodlarını inherit etmek zorundadır.
 * abstract bir class'ın nesnesi olamaz. Bu abstract class içerisindeki abstract methodlardan kaynaklanmaktadır.
 * Bir abstract method her zaman gövdesiz bir şekilde tanımlanır ve noktalı virgül ile son bulur.
 * final modifier'larda olduğu gibi abstract modifier da access modifier'lardan önce ve sonra gelebilir.
 * abstract keyword'ü class keyword'ünden önce olmalı ayrıca abstract keyword'ü method dönüş tipinden önce olmalıdır.
 *
 */
