package org.basics.ocp17.chapter01;

class Chicken{
    int numEggs=12;
    String name;
    Chicken(){
        name="Duke";
    }
}

public class _05_Creating_Objects {

}

/**
 *
 * Bir nesne sınıfın bir örneğidir.
 * Park park = new Park(); ile default constructor çağırılır.
 * Constructor ların ismi ile sınıfın ismi aynı olmak zorundadır.
 * Constructor ların dönüş tipi yoktur (void, String, int vb.).
 * Constructor ların amacı instance değişkenlere ilk değer atamasını yapmaktır.
 * Constructor lara istediğimiz kodu da ekleyebiliriz.
 * Initializer block lar içinde değişken ataması yapıyorsak eğer bu değişkenler blockların üstünde olmalıdır.
 * Bu kural Constructor lar için geçerli değildir.
 *
 */
