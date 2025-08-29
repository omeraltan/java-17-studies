package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.List;

public class _15_Working_With_Generics {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);

    }

    static void printNames(List list){
        for (int i = 0; i < list.size(); i++){
            String name = (String) list.get(i); // ClassCastException (Bir StringBuilder'ı String'e cast edemeyiz.) Bunun gibi hataları ortadan kaldırmak için generic yapısını kullanırız.
            System.out.println(name);
        }
    }

}

class GenericExample{

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jack");

        legacyList(names);
        System.out.println(names);

        String name0 = names.get(0);
        System.out.println(name0);

        String name1 = names.get(1);    // java.lang.ClassCastException
    }

    private static void legacyList(List legacy){    // Burada bir generic kullanılmadığı için her türlü tipi kabul edecektir.
        legacy.add(new StringBuilder("adam"));
        legacy.add(10);
    }

}

// Bu class a verilen "T" parametresi class altındaki değişken ve methodlar içinde geçerlidir.
// Eğer böyle bir yapı olmasaydı, methodların farklı tiplere göre parametre alması gerekecekti (Kod duplikasyonlarına neden olur).
class Crate<T>{

    private T contents;

    public T lookInCrate(){
        return contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }

}

class CrateExample{

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElement = new Crate<>();
        crateForElement.packCrate(elephant);
        Elephant inNewHome = crateForElement.lookInCrate();

        System.out.println("---------------");

        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);
        Robot atDestination = robotCrate.lookInCrate();

        System.out.println("---------------");

        Elephant elephant1 = new Elephant();
        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant1, numPounds);
    }

}

class Elephant{ }
class Robot{ }

class SizeLimitedCrate<T, U>{
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit){
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }

}

/**
 *
 * --------------- Working With Generics ---------------
 * Generic lere neden ihtiyaç duyarız?
 * Eğer generic'leri kullanmazsak kodumuz run time da hata fırlatacaktır.
 * generic yapısının nongeneric yapısına karşı avantajları;
 * - compile time zamanında güçlü bir type check kontrolü sağlar.
 * - cast etme işlemini ortadan kaldırır.
 * -  run time da alınan hatalar daha maliyetlidir. Bizi bundan kurtarır.
 * --------------- Creating Gneric Classes --------------
 * Generic özelliğini class'larımızı tanımlarken kullanabiliriz (<T> Buradaki büyük T harfi tipi ifade eder. Aslında bir tip parametresi almaktadır.).
 *
 * --------------- Naming Conventions For Generics -----
 * E -> element ler için kullanılır.
 * K -> bir map teki key'i ifade eder.
 * V -> bir map teki value'yu ifade eder.
 * N -> bir number için kullanılır.
 * T -> bir generic data type için kullanılır.
 * S, U, V ve daha çoğu çoklu generic type'lar için kullanılır.
 * R -> Functional interface lerde dönüş tipini ifade eder.
 *
 * Generic class lar teki bit tip parametresi almak zorunda değildir.
 *
 */
