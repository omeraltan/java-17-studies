package org.basics.ocp17.chapter05;

public class _05_Accessing_Static_Data {

    String name;
    static String nameOfTallestPenguin;

    public static void main(String[] args) {

        var p1 = new _05_Accessing_Static_Data();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "Lilly";
        var p2 = new _05_Accessing_Static_Data();
        p2.name = "Willy";
        p2.nameOfTallestPenguin = "Willy";

        System.out.println(p1.name);
        System.out.println(p1.nameOfTallestPenguin);
        System.out.println(p2.name);
        System.out.println(p2.nameOfTallestPenguin);

    }

}

/**
 *
 * "static" anahtar kelimesi, değişkenlere, methodlara, sınıflara (nested class) uygulanabilirler.
 * "import" statement'ı ile birlikte de kullanılabilirler.
 * "static" anahtar kelimesini değiişkene veya methoda uyguladığımızda ilgili değişken veya method nesneye değil sınıfa ait olur.
 * static methodlar nesne oluşturmadan direkt olarak çağırılabilir. Instance methodlar veya variable lar için ortada bir nesne olması gerekir.
 * static değişkenler sınıfa ait olduğu için bütün nesneler arasında paylaşılabilir.
 * static variable lar ve methodlar genel olarak utility veya helper olarak ifade edilen methodlarda nesne kullanmamıza gerek olmadan bu methodları veya değişkenleri kullanırız.
 * bütün nesneler ile paylaşımlı bir durum olduğunda static kullanılır.
 * Bir static member direkt olarak instance member'ı çağıramaz. Yani static bir methoddan nesne oluşturmadan instance bir member çağırılamaz.
 * Instance methodlar static methodları direkt olarak çağırabilirler.
 * Instance methodlar instance methodları direkt olarak çağırabilirler.
 * Instance methodlar bir referans üzerinden instance methodları çağrabilirler.
 * this anahtar kelimesi nesneyi ifade etmektedir.
 * this anahtar kelimesi static methodlarda kullanılamazlar.
 * static bir method içerisinde instance bit variable direkt olarak kullanılamaz.
 * static variable larda final, transient ve volatile anahtar kelimelerini kullanabiliyoruz.
 * "static final" veya "final static" kullanımını genellikle constant lar için tercih ediyoruz.
 * "static final" tanımlanmış bir değişkene değer ataması static initializer block içerisinde yapılabilir.
 *
 *
 */
