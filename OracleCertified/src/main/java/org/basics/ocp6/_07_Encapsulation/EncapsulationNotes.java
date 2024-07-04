package org.basics.ocp6._07_Encapsulation;

class Person{

    private int age;
    private String firstName;
    // legaldir fakat encapsulation a uymaz.
    private String lastName; // n tane noktadan erişim sağlanabilir.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}

public class EncapsulationNotes {

}

/**
 *
 * encapsulation -> sarmalama / kapsulleme gibi türkçe anlamlara gelir.
 * 1 - instance değişkenleri private / protected tanımlarız.
 * 2 - bu instance değişkenlere erişim public getter / setter metodları ile olur.
 * 3 - bu getter / setter metodların isimleri standarda uygun olmalıdır.
 * bu 3 kurala uyduğumuzda tanımladığımız sınıf encapsulation a uygun hale gelir.
 * encapsulation ile kodun kontrolü bizim elimizdedir.
 * set ve get metodlar vasıtasıyla veritabanına yazılacak veriler için kontrol sağlanabilir (set()).
 * Veritabanından getirilecek veriler için kontrol sağlanabilir (get()).
 *
 */
