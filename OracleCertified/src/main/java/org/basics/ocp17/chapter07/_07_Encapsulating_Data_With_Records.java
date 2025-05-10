package org.basics.ocp17.chapter07;

public class _07_Encapsulating_Data_With_Records {

    public static void main(String[] args) {

    var mommy = new Crane(4, "Cammy");
        System.out.println(mommy.numberEggs()); // 4
        System.out.println(mommy.name());       // Cammy

     var father = new Crane(0,"Craig");
        System.out.println(father);             // Crane[numberEggs=0, name=Craig]

     var copy = new Crane(0,"Craig");
        System.out.println(copy);                                       // Crane[numberEggs=0, name=Craig]
        System.out.println(copy.toString());                            // Crane[numberEggs=0, name=Craig]
        System.out.println(father.equals(copy));                        // true
        System.out.println(father.hashCode() + " " + copy.hashCode());  // 1007, 1007

        // var mommy1 = new Crane("Cammy", 4);                          // DOES NOT COMPILE
        // var mommy2 = new Crane("Craig");                             // DOES NOT COMPILE



    }

}

record Crane(int numberEggs, String name){}

record Crane2(){}

/**
 *
 * Bir record, özel bir tipte data oriented bir sınıftır.
 * Compiler bizim için boilerplate denilen standart kodları ekleyecektir.
 * Record'lar Java 14 ile gelen bir özelliktir.
 * Bir "record" tanımladığınızda; toSting(), hashCode(), equals() gibi methodlarda arka planda override edilir ve uygun bir şekilde tanımlanır.
 * Record'un constructor'ına gönderilen parametreler record class'ında tanımladığı şekilde olmalıdır.
 * Members Automatically Added to Records (Bir record tanımlandığında arka tarafta otomatik olarak oluşturulan kodlarımız aşağıdadır.):
 * 1. Constructor : Record tanımındaki parametreler ile aynı sırada ve aynı şekilde parametre yapısına sahiptir.
 * 2. Buradaki constructo'a canonical constructor da denilir.
 * 3. Accessor method : Her bir field'a karşı bir accessor method oluşturulur.
 * 4. equals()   : java.lang.object sınıfından override edilir. Eğer property'ler aynı ise equals() methodu true döner.
 * 5. hashCode() : java.lang.object sınıfından override edilir.
 * 6. toString() : java.lang.object sınıfından override edilir.
 *
 * Her hangi bir field olmadan da bir record tanımı yapılabilir.
 *
 *
 *
 */
