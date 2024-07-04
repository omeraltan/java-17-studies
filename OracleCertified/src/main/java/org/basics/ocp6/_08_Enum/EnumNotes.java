package org.basics.ocp6._08_Enum;

enum CoffeeSize {

    SHORT(3), MEDIUM(5), GRANDE(7), VENTI(10);

    private int price;

    CoffeeSize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Coffee{
    enum Size{SHORT, MEDIUM, LARGE}
}



public class EnumNotes {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.SHORT;
        System.out.println(coffeeSize.equals(CoffeeSize.SHORT)); // true

        System.out.println(coffeeSize.getPrice());
        System.out.println("------------");
        for (CoffeeSize cs : CoffeeSize.values()) {
            System.out.println(cs.getPrice());
        }
    }
}

/**
 *
 * enum -> keyword
 * sıralı, listeli, numaralı gibi anlamlara gelir.
 * bir değişkenin alabileceği değerleri sınırlandırabiliyorsak bu durumda enum kullanmayı tercih edebiliriz.
 * Month -> 12 tane değer alabilir.
 * DayOfWeek -> 7 tane gün değeri alabilir.
 *
 * Employees Tipleri olsun :
 * 1 - Full Time çalışan
 * 2 - Part Time çalışan
 * 3 - Stajyer
 * 4 - Danışman
 *
 * Size lar için kullanılabilir:
 * 1 - SHORT
 * 2 - MEDIUM
 * 3 - LARGE
 * 4 - XLARGE
 *
 * Enumları bir sınıf olarak tanımlayabiliriz.
 * Enumları bir sıfının içinde de tanımlayabiliriz.
 * Enumlar büyük harfle tanımlanır.
 * Her enum, "java.lang.enum" sınıfını kalıtmaktadır. Göremeseniz bile kalıtır. Dolayısıyla bir başka sınıfı kalıtamaz.
 * Her enum değeri için bir tane obje oluşur.
 * Enumlar başka bir sınıfı kalıtamaz. Özel yapılardır.
 */


