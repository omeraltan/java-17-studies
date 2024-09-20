package org.basics.ocp17.chapter01;

class AnimalClassStructure{    // -> class
    String name; // -> field (değişken)


    public void method(){
        System.out.println("Animal method called");
    }

    public void method2(int param){
        System.out.println();
    }
}

public class _02_Understanding_The_Class_Structure {

    //      -> single-line comment

    /*
    *       -> multi-line comment
    */

    /**
     *      -> java-doc comment (özel parametreler alır)
     */

    // Examples :

    //                  -> single-line

    // //               -> single-line

    // /* dog */        -> single-line

    /*
     * //               -> multi-line
     */

    /* elephant */ //   -> multi-line

    // compile time error
    //      /*
    //      * /* ferret */
    //      */

}

/**
 *
 * Java programlarında class'lar temel yapı taşlarıdır.
 * Bir class tanımladığımızda bu milestone'un tüm özelliklerini tanımlarız.
 * Diğer yapıtaşlarına örnek olarak : interface'ler, enum'lar ve record'lar örnek olarak verilebilir.
 * Bir çok sınıfı kullanabilmek için nesne oluşturmamız gereklidir.
 * Bir nesne, bir sınıfın memory deki çalışma zamanı örneğidir.
 * Bir referans değişken memory deki ilgili nesneyi gösterir.
 * Java sınıflarının iki temel elemanı vardır. Bunlardan biri "method" diğeri "field" olarak isimlendirilir.
 * Field bizim değişken olara kullandığımız yapılardır.
 * Bu iki kavrama members yani sınıfın üyeleri denir.
 * Değişkenler programın state ini tutarlar.
 * Methodlar ise stateler üzerinde işlem yaparlar.
 * Yorum satırları kodumuzun daha kolay okunmasını sağlar.
 * 3 farklı yorum satırı vardır. Bunlar single-line, multi-line, java-doc
 * Java sınıfları kendi .java sınıflarında tanımlanır. Bunlar top-level yapılardır.
 * Sınıflar "public" ile tanımlanır. Bir sınıf public olduğunda top-level olduğu anlaşılır.
 * Sınıf public olduğunda kendi source file ında olması gerekir.
 * Bir kaynak dosyada birden fazla sınıf tanımlayabiliriz.
 * Ancak public olan sınıfımız bir tane olabilir ve bu public olan sınıfımız source file ile aynı isimde olması gerekir.
 *
 *
 */
