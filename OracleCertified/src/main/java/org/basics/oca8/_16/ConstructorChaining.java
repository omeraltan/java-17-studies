package org.basics.oca8._16;

class Animal{
    Animal(){
        //super();
        System.out.println("Animal constructor...");
    }
}

class Dog extends Animal{
    Dog(){
        // super();
        System.out.println("Dog constructor...");
    }
}

class Kangal extends Dog{
    Kangal(){
        super(); // super(); ifadesi açık şekilde yazılırsa, constructor içerisindeki ilk ifade olmalıdır.
        System.out.println("Kangal constructor...");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Kangal d = new Kangal();
    }
}

/**
 *
 * Constructor chaining/yapılandırıcı zinciri
 * Constructor, yapılandırıcı, kurucu gibi türkçe karşılıklar görülebilir.
 * Dog objesi oluşturulduğunda ilk önce super class taki constructor çalışır.
 * Çalışma sonucu :
 * Animal constructor...
 * Dog constructor...
 * Kangal constructor...
 * Dog constructor ı içerisinde gözükmese bile bir "super();" ifadesi vardır ve constructor içindeki ilk ifadedir.
 * super(); ifadesi super class taki constructor ı çağırır.
 * En üst sınıfın constructor ı super(); i ile Object sınıfının constructor ını çağırır.
 */
