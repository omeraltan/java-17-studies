package org.basics.ocp17.chapter07;

public class _08_Encapsulating_Data_With_Records {

    public static void main(String[] args) {

        Tomb tomb = new Tomb(1,"tomb");
        System.out.println(tomb instanceof Tomb);
        System.out.println(tomb instanceof Object);
        System.out.println(tomb instanceof Record);

    }

}

record Tomb(int value, String name){}

// record BlueTomb() extends Tomb(int numberEggs, String name){}        // DOES NOT COMPILE

record Creak(int numberEggs, String name){
    // public Creak(int numberEggs, String name){}      // DOES NOT COMPILE
}

/**
 *
 * "record" 'ların setter methodları yoktur. Her bir field final özelliğe sahiptir ve constructor'da değer ataması sonrasında modifiye edilemezler.
 * "record" 'lar dolaylı olarak final'dır (implicit olarak).
 * Bir "record" kalıtılamaz.
 * Bir "record" bir başka sınıfı kalıtamaz. Implicit olarak bir "record" java.lang.record sınıfını kalıttığı için başka class'ları kalıtamaz.
 * Ancak bir record bir interface'i implements edebilir.
 * "record" 'lar final olduğu için record tanımlarında final keyword kullanmak gereksizdir (implicitly final).
 * Bir "record" yada bir class, bir başka "record" 'u kalıtamaz.
 * Bir "record" bir yada daha fazla interface'i yada sealed interface'i implements edebilir.
 * "record" 'larda iki tip constructor vardır. Her zaman kullandığımız constructor ve "compact constructor"
 * Bir "record" 'da tanımlanan field sırasına göre default olarak constructor tanımlanır.
 * Bir "record" 'da tanımlanan field'lar "final" 'dır ve constructor da değer ataması yapılmak zorundadır.
 * field'lara final keyword'ü yazılmaz ama final'dır.
 *
 */
