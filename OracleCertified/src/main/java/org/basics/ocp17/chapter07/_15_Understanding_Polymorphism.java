package org.basics.ocp17.chapter07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _15_Understanding_Polymorphism {

    public static void main(String[] args) {

    }
}

class Primate {
    public boolean hasHair(){
        return true;
    }
}

interface HasTail{
    public abstract boolean isTailStriped();
}

class Lemur extends Primate implements HasTail{
    public boolean isTailStriped(){
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }
}

class UsingInterfaceReference{
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("horse");
        System.out.println(animals.getClass());

        sortAndPrintZooAnimals(animals);
        System.out.println();

        List<String> animalsLinkedList = new LinkedList<>();
        animalsLinkedList.add("cat");
        animalsLinkedList.add("dog");
        animalsLinkedList.add("bird");
        animalsLinkedList.add("horse");
        System.out.println(animalsLinkedList.getClass());

        sortAndPrintZooAnimals(animalsLinkedList);
    }

    private static void sortAndPrintZooAnimals(List<String> animals) {
        Collections.sort(animals);
        for (String a : animals) System.out.println(a);
    }


}

/**
 *
 * Bir java nesnesine erişim şekillerde olmaktadır:
 * 1. Object'in tipi ile aynı tipte bir referans değişken ile,
 * 2. bject'in super class tipinde bir referans değişken ile,
 * 3. Object'in super type interface tipinde bir referans değişken ile erişim sağlanmaktadır.
 *
 * Eğer bir object super type referans değişkene assign edilmiş ise bu durumda cast işlemine gerek yoktur.
 *
 * Object vs. Reference :
 * Java da object'lere erişim sadece referans değişkenler vasıtası ile olmaktadır.
 * Object'ler heap'te yer alır.
 * Java'da bütün sınıflar; java.lang.object sınıfını kalıtmaktadır. Dolayısıyla bütün sınıfların super sınıfı object sınıfıdır.
 * Bir class başka bir class'ı kalıtıyorsa, bu durumda substype yani child class için IS-A supertype mantıksal önermesi doğru olacaktır.
 * Bütün class'lar için IS-A Object önermesi doğrudur.
 * Object property'lerine erişim noktasında dikkat etmemiz gereken iki kural vardır:
 * 1. Nesnenin türü, nesnenin bellekte hangi özelliklerinin bulunacağını belirler.
 * 2. Referans değişkeni tipi, java programı tarafından hangi methodların ve değişkenlerin erişilebilir olduğunu belirlemektedir.
 *
 * "Code to Interface": Nesne yönelimli programlamada önemli bir prensiptir. Bu prensip, somut (concrete) sınıflar yerine interface'leri kullanarak kod yazmamızı önerir.
 *
 *
 *
 */
