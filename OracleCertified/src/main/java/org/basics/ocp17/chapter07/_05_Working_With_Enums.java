package org.basics.ocp17.chapter07;

public class _05_Working_With_Enums {

    public static void main(String[] args) {

        var s = Season.WINTER;
        System.out.println(Season.SPRING);              // SPRING
        System.out.println(s == Season.WINTER);         // true
        System.out.println(s.equals(Season.SUMMER));    // false

        System.out.println("---------------");

        for (var season : Season.values()){
            System.out.println(season.name() + " " + season.ordinal());
        }

        // if (Season.SUMMER == 2){} // -> DOES NOT COMPILE

        System.out.println("---------------");

        Season season = Season.valueOf("SUMMER");
        System.out.println(season);
        // Season season1 = Season.valueOf("summer");
        // System.out.println(season1);    // -> IllegalArgumentException

        System.out.println("---------------");

        Season summer = Season.SUMMER;
        switch (summer){
            case WINTER:
                System.out.println("Get out the sled!");
            case SUMMER:
                System.out.println("Time for the pool!");
            default:
                System.out.println("Is it summer yet?");
        }

        Season summer2 = Season.SUMMER;
        var message = switch (summer2){
            // case Season.SUMMER -> "Get out the sled!";      // DOES NOT COMPILE (Böyle bir deklarasyon geçerli değildir. Season.SUMMER)
            // case 0 -> "Time for the pool!";                 // DOES NOT COMPILE (Enum'ların ordinal değerleri bu şekilde verilemez.)
            default -> "Is it summer yet?";
        };

        Season summer3 = Season.SUMMER;
        var message2 = switch (summer3){
            case WINTER -> "Get out the sled!";
            case SUMMER ->  "Time for the pool!";
            default -> "Is it summer yet?";
        };
    }


}

enum Season{
    WINTER, SPRING, SUMMER, FALL;       // Noktalı virgül opsiyoneldir.
}

enum CoffeeSize{
    SHORT, TALL, GRANDE;

    CoffeeSize(){
        System.out.println("constructor-invoked");
    }
}

class CoffeeSizeTest{
    public static void main(String[] args) {
        System.out.println(CoffeeSize.SHORT);
        System.out.println(CoffeeSize.TALL);
        System.out.println(CoffeeSize.GRANDE);      // Bu çağırılmasada constructor'ı çalışacaktır.

        System.out.println(CoffeeSize.TALL instanceof CoffeeSize);
        System.out.println(CoffeeSize.SHORT instanceof Enum<CoffeeSize>);
    }
}

// enum ExtendedSeason extends Season{} // -> DOES NOT COMPILE

enum NewSeason{

    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String expectedVisitors;

    NewSeason(String expectedVisitors){
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}

enum OnlyOne{

    ONCE(true), TWICE(false);

    OnlyOne(){
        System.out.println("Enum Constructor is running...");
    }

    OnlyOne(boolean b){
        System.out.print("constructing, ");
    }
}

class PrintTheOne{

    public static void main(String[] args) {
        System.out.print("begin, ");
        OnlyOne firstCall = OnlyOne.ONCE;       // Prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE;      // Doesn't print anything
        System.out.print("end");
    }

}

enum legalSeason{
    WINTER{
        public String getHours(){return "10am-3pm";}
    },
    SPRING{
        public String getHours(){return "9am-5pm";}
    },
    SUMMER{
        public String getHours(){return "9am-7pm";}
    },
    FALL{
        public String getHours(){return "9am-5pm";}
    };
    public abstract String getHours();
}

interface Weather{
    int getAverageTemperature();
}

enum Season3 implements Weather{
    WINTER, SPRING, SUMMER, FALL;
    @Override
    public int getAverageTemperature() {
        return 30;
    }
}

/**
 *
 * Enums Java'da bir anahtar kelimedir. Programlamada sınırlı değerler kümesine sahip olan veritiplerini kullanmak yaygındır.
 * Bu sınırlı değerler kümesi haftanın günleri, mevsimler, aylar, temel renkler olabilir.
 * Enum, fix setup constant'tır. Yani belirli sayıdaki sabit değerlerden oluşan bir değerler kümesidir.
 * Enum kullanmak bir dizi constant kullanmaktan daha iyi ve güvenlidir.
 * Enumları kullandığımızda invalid bir değer kullanmamız mümkün olmaz. Bu durumda kodumuz derlenme hatası verir.
 * Enum class'ları public veya hiçbirşey yazmassak package level olacaktır.
 * Enum tanımlarında noktalı virgül opsiyoneldir.
 * Enum tanımlarında value'ların alt tire li olması uygundur (VANILLA, ROCKY_ROAD, MINT_CHOCOLATE_CHIP)(snake case).
 * Enum'larda == veya equals() kontrolü yapılabilir. İkiside çalışacaktır.
 * Bir Enum başka bir Enum'ı kalıtamaz.
 * Enum'larda bütün enum değerlerini dönen bir method vardır: "values()" . İlgili enum'ın tipinde bir array döner.
 * "name()" methodu enum değerinin ismini verir.
 * "ordinal()" methodu enum değerinin sırasını verir.
 * Enum'lar "java.lang.enum" sınıfını kalıtmaktadır. Enum'ların super sınıfı java.lang.enum sınıfıdır.
 * valueOf(String param) : Bu methoda bir String değer verilir ve sonucunda enum döner. Verilen değer enum sınıfının içindeki değerler ile eşleşmelidir yoksa "IllegalArgumentException" verecektir.
 * Bir enum'ın constructor'ları implicitly olarak private'tır.
 * Bir main class'ı içerisinden enum değerlerinden herhangi birisini çalıştırdığınızda enum constructor enum miktarı kadar çalışır (Her bir enum için çalışır).
 * Switch statement'larda enum kullanabiliriz. Enum'ları switch expression'larda da kullanabiliriz.
 * Enum'larda değişken, constructor ve methodlar tanımlanabilir.
 * Bir enum tanımında, enum tanımlarından sonra field'lar constructorlar veya methodlar varsa enumların bitiminde noktalı virgül olmak zorundadır.
 * Enum constructor'ları implicit olarak private'tır.
 * Enum'larda ilk constructor çağırımında bütün constructorlar bir kez çalışır diğer çağırımlarda çalışmazlar. Yani her bir enum değer için birkez çalışacaktır.
 * Enum'lar interface'leri implemente edebilirler.
 * Bir Enum sınıfında önce value'lar bulunmak zorundadır (Örneğin: WINTER, SPRING, SUMMER, FALL;). Noktalı virgül; eğer bu value'lardan sonra değişken gibi, method gibi özellikler varsa noktalı virgül konulmak zorundadır.
 *
 *
 */
