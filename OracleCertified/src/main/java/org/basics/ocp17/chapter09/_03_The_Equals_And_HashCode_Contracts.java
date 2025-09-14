package org.basics.ocp17.chapter09;

import java.util.Objects;

public class _03_The_Equals_And_HashCode_Contracts {

    public static void main(String[] args) {

        String a1 = new String("Ömer");
        String a2 = a1;
        String a3 = "Ömer";
        System.out.println(a1 == a2);           // true (iki referans değişkende aynı nesneye bakıyor.)
        System.out.println(a1.equals(a2));      // true (iki referans değişkende aynı içeriğe sahip.)
        System.out.println(a1 == a3);           // false (iki referans değişken farklı nesneye bakıyor.)
        System.out.println(a1.equals(a3));      // true (iki referans değişken aynı içeriğe sahip.)

        System.out.println("--------------------");

        Company x = new Company(1,"company-name", "Turkey");
        // reflexive
        System.out.println(x.equals(x));
        // symmetric
        Company y = new Company(1,"company-name","Turkey");
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        // transitive
        Company z = new Company(1,"company-name-2","Turkey");
        System.out.println(z.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
        // consistent
        System.out.println(x.equals(null));

        System.out.println("--------------------");

        System.out.println(x.equals(y));                    // true ise
        System.out.println(x.hashCode() == y.hashCode());   // true olmak zorundadır.

        System.out.println(x.equals(z));                    // false ise
        System.out.println(x.hashCode() == z.hashCode());   // false olmak zorunluluğu yoktur.


    }

}

class Company{
    private int id;
    private String name;
    private String country;

    public Company(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && Objects.equals(name, company.name) && Objects.equals(country, company.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }
}

/**
 *
 * "==" operatörü için, bu iki referans değişkeni aynı nesneyi mi gösteriyor doğrulamasını yapar.
 * Eğer iki referans değişken aynı nesneyi gösteriyorsa true göstermiyorsa false döner.
 * String sınıfı equals methodunu override eder. Benzer şekilde Integer sınıfı ve dğer wrapper class larda equals methodunu override ederler.
 * Eğer iki integer nesnesi 5 değerini tutuyorsa bu iki object için equals true olacaktır.
 * Eğer equals methodunu override etmezsek, bu durumda java.lang.Object sınıfında yer alan equals() methodu kullanılacaktır.
 * Eğer equals() methodu override edilmezse aynı "==" operatörünün yaptığı işi yapacaktır.
 *
 * ----- The equals() Contract -----
 * "reflexive"  dir. "x.equals(x)" değeri "true" dönmelidir.
 * "symmetric"  dir. "x.equals(y)" "true" ise bu durumda "y.equals(x)" değeri de "true" dönmelidir.
 * "transitive" dir. "x.equals(y) "true" ise ve y.equals(z) true ise bu durumda x.equals(z) true olmalıdır.
 * "consistent" dir. x ve y referans değişkenleri için birden fazla x.equals(y) değerini çağırdığımızda tutarlı bir şekilde true veya false dönmelidir.
 * "null" olmayan bir x referans değişkeni için x.equals(null) her zaman false değerini dönmelidir.
 *
 * hashCode() methodu java.lang.Object sınıfında yer alan bir methoddur.
 * hashMap, hashSet ve hashTable gibi Collection lar, ilgili object ler tutmak için bu object lerin hashCode değerlerini kullanırlar.
 * Bunu daha iyi anlamak için bucket (sepet) kavramını düşünebiliriz.
 * Bir grup object i tutmak için bunları tek sepete koymak yerine bir gruplama yapıp birden fazla sepet kullanıp bu object lere koymak sonradan bu objectlere erişim açısından
 * daha kolay olacaktır. Kitapları türlerine göre gruplayıp koymak daha sonra aradığımızda bulmamız daha kolay olacaktır.
 * Bucket kavramı tekil bir hashCode bilgisi anlamına gelmektedir. örneğin 10 tane bucket bilgisi olduğunu düşünürsek on tane hashCode bilgisi olduğunu düşünebiliriz.
 * Birden fazla object'in aynı hashCode bilgisi olabilir.
 * Bir adres bilgisindeki sokak bilgisine hashCode bilgisi dersek daire bilgisi de equals bilgisi olabilir.
 *
 * ----- Te hashCode() Contract -----
 * "x.equals(y) == true" ise bu durumda "x.hashCode() == y.hashCode" bilgisi "true" olmalıdır.
 * "x.hashCode() == y.hashCode()" ise bu durumda "x.equals(y) == true" olması gerekmez.
 * "x.equals(y) == false" ise bu durumda her hangi bir zorunluluk yoktur.
 * "x.hashCode() != y.hashCode()" ise bu durumda "x.equals(y) == false" bilgisi olmalıdır.
 *
 *
 *
 */
