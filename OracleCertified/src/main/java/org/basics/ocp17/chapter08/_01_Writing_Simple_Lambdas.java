package org.basics.ocp17.chapter08;

public class _01_Writing_Simple_Lambdas {



}

interface MyInterface{
    void deneme(String s);
}

interface InterfaceV1{
    boolean deneme();
}

interface InterfaceV2{
    boolean deneme(String d);
}

interface InterfaceV3{
    boolean deneme(String a, String b);
}

class ValidLambdas{

    MyInterface myInterface = s -> {};

    InterfaceV1 v1 = () -> true;

    InterfaceV2 v2 = x -> x.startsWith("test");

    InterfaceV3 v3 = (x,y) -> {
        return x.startsWith("test");
    };

    InterfaceV3 v32 = (String x, String y) -> x.startsWith("test");
}

/**
 *
 * "Functional Programming" kavramı, "Object Oriented" 'a alternatif bir yaklaşım değildir.
 * "Object Oriented" ile kullanacağımız başka bir programlama yaklaşımdır.
 * "Object Oriented Programming", "Functional Programming" ve "Aspect Oriented Programming" birbirini tamamlayan programlama yaklaşımlarıdır.
 * "Functional Programming", kodu daha deklaratif (bildirimsel) yazmanın bir yöntemidir. Objelerin durumu yani state yerine ne yapmak istediğimizi belirtiriz.
 * Döngülerden çok ifadelere odaklanır. "Functional Programming" 'de kod yazmak için "lambda" ifadelerini kullanırız.
 * Lambda expression, etrafta dolaşan bir kod bloğudur.
 * Bir lambda ifadesi, Anonim sınıflar içerisinde var olan isimsiz bir method gibi düşünülebilir.
 * Bir lambda ifadesi, parametrelere ve body'lere sahip olacaktır fakat bir ismi yoktur.
 * Lambda ifadeleri, "Deferred execution" konseptini kullanır. Kod tanımlandığı noktada değil daha sonra çalışacaktır.
 * Lambda ifadeleri interfaceler ile birlikte çalışır ve bu interfacelerin bir tane abstract methodunun olması gerekir.
 * Lambda ifadesi ile interface'in abstract methodunun birbiri ile uyumlu olması gerekmektedir.
 * a -> a.canHop() ile (Animal a) -> { return a.canHop } arasında bir fark yoktur. İlk tanımı yapılan lamda ifadesi ikincinin kısaltılmış halidir.
 *
 * a -> a.canHop()
 * 1. İsmi "a" olan bir parametre tanımlandı.
 * 2. Arraw (->) operatörü, parametreler ile kod body'sini ayırmakta ve zorunludur.
 * 3. Body kısmı bir methodu çağırır ve geriye bir değer döner.
 *
 *         Parameter name
 *              |
 *              a -> a.canHop()   -> Body
 *                 |
 *               Arrow
 *
 * Bir lambda ifadesinde "return" kullanıldığında ";" ifadesinin kullanımı zorunludur.
 * Parametrenin tipi belirtildiğinde parantez de kullanılması gerekmektedir "(Animal a) -> { return a.canHop(); }".
 * Tek bir parametre tanımlandığında ve bu parametrenin tipi belirtilmediğinde parantez kullanmayabiliriz.
 * Aşağıdaki ifadelerin ikiside geçerlidir:
 * a -> { return a.canHop(); }
 * (Animal a) -> a.canHop()
 *
 * Geçerli lambda kullanımları:
 *
 * Lambda                                               # of parameters
 * --------------------------------------------------------------------
 * () -> true                                           0
 * x -> x.startsWith("test)                             1
 * (String x) -> x.startsWith("test")                   1
 * (x, y) -> { return x.startsWith("test"); }           2
 * (String x, String y) -> x.startsWith("test")         2
 *
 * Lambda ifadesi herhangi bir parametre almadığı durumda da parantez zorunludur.
 * return'ün kullanıldığı durumlarda süslü parantezin kullanılması zorunludur.
 *
 * Geçersiz lambda kullanımları:
 *
 * Invalid Lambda                                       Reason
 * ---------------------------------------------------------------------
 * x, y -> x.startsWith("fish")                         Missing parentheses on left
 * x -> { x.startsWith("camel"); }                      Missing return on right
 * x -> { return x.startsWith("giraffe") }              Missing semicolon inside braces
 * String x -> x.endsWith("eagle")                      Missing parentheses on left
 *
 * Birden fazla parametrenin kullanıldığı durumda parantez kullanılmak zorundadır.
 *
 */
