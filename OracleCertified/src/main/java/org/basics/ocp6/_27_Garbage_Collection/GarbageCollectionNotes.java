package org.basics.ocp6._27_Garbage_Collection;

class Person{
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

public class GarbageCollectionNotes {

    public static void main(String[] args) {
        Person person = new Person("John", "Smith");

        person = null;

        /**
         *
         * person = null dediğimizde, person değişkeni ilgili nesneyi göstermez.
         * bu nesneyi gösteren başka bir referans değişken yoktur.
         * bu nokta itibariyle artık sahipsiz kalmıştır.
         * Bu nedenle artık garbage collector tarafından temizlenmeye uygun hale gelmiştir.
         * Hemen temizleneceğinin bir garantisi yoktur.
         *
         */
    }

}

/**
 *
 * Herhangi bir program/yazılım çalıştığında kaynak tüketir.
 * Memory / Ram  ve cpu
 * Operating system, bigisayarımızda kaynakları yönetmekten soruludur.
 * JVM e belirli bir kaynak ayrılır.
 * C gibi bir dilde calloc, malloc, free gibi methodları/fonksiyonları kullanırız.
 * Javada is bu işlem garbage collector tarafından otomatik olarak yapılmaktadır.
 * Nesneler için kendimiz alan oluşturup alan boşaltmayız. Bu işlemi javaya bırakırız.
 * Bu işlem developerdan alındığı için memory leak lere karşı önlem alınmış olur.
 * Bu özellik Javanın Robust özelliğine katkı sağlar.
 * Pointer larla uğraşmadığımız için, Javanın simple özelliğini sağlamaktadır.
 * JVM, OS den memory allocate eder.
 * Bir nesnenin sahibi yoksa yani erişen bir referans değişken yoksa, nesne temizlenmeye uygun hale gelir.
 *
 *
 */
