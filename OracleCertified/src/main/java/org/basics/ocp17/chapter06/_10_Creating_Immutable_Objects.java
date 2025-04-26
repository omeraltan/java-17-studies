package org.basics.ocp17.chapter06;

import java.util.ArrayList;
import java.util.List;

public class _10_Creating_Immutable_Objects {

    public static void main(String[] args) {



    }

}

final class Person {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies); // Defensive copy
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies); // Defensive copy
    }
}

/**
 *
 * Immutable object'ler bir kez oluşturulduğunda değeri değiştirilemeyen object'lerdir.
 * Immutable Object Pattern bir Object Oriented Design Pattern'dir.
 * Immutable bir class yapmak için:
 * 1- Sınıfı final yap:
 *      Böylece bu sınıfı extend eden (miras alan) başka bir sınıf olamaz.
 *      Çünkü alt sınıflar değiştirilebilirlik ekleyebilir.
 * 2- Tüm alanları (fields) private ve final yap:
 *      private olması dışarıdan doğrudan erişimi engeller.
 *      final olması bir kere atandıktan sonra değiştirilememesini sağlar.
 * 3- Değeri yalnızca constructor'da (kurucu metodda) ver:
 *      Alanları sadece constructor üzerinden set etmelisin.
 *      Sonradan setter metodlar (setName gibi) eklenmemeli.
 * 4- Setter metodları eklememelisin:
 *      Yani hiçbir şekilde alanları değiştirecek bir metod olmamalı.
 * 5- Getter'larda koruma yap:
 *      Eğer alan basit bir değer (primitive veya String) ise doğrudan dönebilirsin.
 *      Eğer alan bir nesne (örneğin Date, List, Map) gibi mutable (değişebilir) bir nesne ise, kopyasını döndürmelisin.
 *
 */
