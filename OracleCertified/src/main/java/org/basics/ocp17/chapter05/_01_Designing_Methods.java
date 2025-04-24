package org.basics.ocp17.chapter05;

public class _01_Designing_Methods {

    public static void main(String[] args) {



    }

    public void skip1(){} // -> Legal

    // default void skip1(){} // DOES NOT COMPILE
    // -> default anahtar kelimesi açık olarak sadece interface lerde kullanılabilir.

    // void public skip3(){}  // DOES NOT COMPILE
    // -> public (access modifier'ı) sadece başta kullanılır. Ortada kullanılamaz.

    void skip4(){}  // -> Legal



}

class Exercise {
    public void bike1(){}                   // -> Legal
    public final void bike2(){}             // -> Legal
    public static final void bike3(){}      // -> Legal
    public final static void bike4(){}      // -> Legal
    // public modifier void bike5(){}       // -> DOES NOT COMPILE modifier anahtar kelimesi yoktur
    // public void final bike6(){}          // -> DOES NOT COMPILE final anahtar kelimesi void den sonra kullanılamaz. Yani aslında burada methodun imzasından sonra kullanılamaz.
    final public void bike7(){}             // -> Legal
}

class Hike{
    public void swim(int distance){
        if (distance <=0){
            // Exit early, nothing to do!
            return; // Bu örnekteki return, void bir metotta kullanılmış. Yani geri değer döndürmüyor ama metottan erken çıkmayı sağlıyor.
        }
        System.out.println("Fish is swimming " + distance + " meters");
    }

    public void hike1(){}
    public void hike2(){return;}
    public String hike3(){return "";}
    // public String hike4(){}              // -> DOES NOT COMPILE
    // public hike5(){}                     // -> DOES NOT COMPILE
    // public String int hike6(){}          // -> DOES NOT COMPILE

    // String hike7(int a){if (1<2) return "orange";}   // -> DOES NOT COMPILE

}

class Measurement{
    int getHeight1(){
        int temp = 9;
        return temp;
    }

//    int getHeight2(){
//        int temp = 9L;      // DOES NOT COMPILE
//        return temp;
//    }

//    int getHeight3(){
//        long temp = 9L;
//        return temp;        // DOES NOT COMPILE
//    }
}

class PhysicalEducation{
    public void run1(){}
    // public void run2{}                       // DOES NOT COMPILE
    public void run3(int a){}
    // public void run4(int a; int b){}         // DOES NOT COMPILE
    public void run5(int a, int b){}
}

class Trip{
    public void visitZoo(String name, int waitTime){}
    // public void visitZoo(String attraction, int railFall){} // DOES NOT COMPILE method yapısı aynı olduğu için Java üstteki methodla ayort edemez.


}

/**
 *
 *              Eelement                Value in nap() example              Required?
 *              --------                ----------------------              ---------
 *              Access modfier          public                              No
 *              Optional specifier      final                               No
 *              Return type             void                                Yes
 *              Method name             nap                                 Yes
 *              Parameter list          (int minutes)                       Yes, but can be empty parentheses
 *              Method signature        nap(int minutes)                    Yes
 *              Exception list          throws InterruptedException         No
 *              Method body             {                                   Yes, except for abstract methods
 *                                      // take a nap
 *                                      }
 *
 * Access Modifiers : Bir methoda veya değişkene hangi sınıflar erişebilir buna karar verir.
 * private          : private bir methoda sadece kendi sınıfından erişilebilir anlamına gelmektedir.
 * package access   : Methoda aynı pakette yer alan sınıflar erişim sağlayabilir.
 * protected        : methoda aynı paketten erişim sağlanabilir ayrıca kalıtım yoluyla farklı paketlerden erişim sağlanabilmektedir.
 * public           : methoda erişim bütün sınıflardan olabilir.
 * Bir method tanımında opsiyonel olarak kullanabileceğimiz anahtar kelimeler yer almaktadır. Birden fazla ketword'ü birlikte kullanabiliriz.
 * Tüm kombinasyonlar legal değildir. Örneğin final ile abstract beraber kullanılamaz. Legal değildir.
 * return type      : methodun dönüş tipi zorunludur. access modifier ve optional specifier lardan sonra ve method isminden önce gelmelidir.
 * Eğer dönüş tipi yoksa bu durumda void anahtar kelimesi kullanılmaktadır.
 * Method name      : Method isimlerinde ilk karakter rakam olamaz. Tek başına "_" karakteri olamaz. Method ismi en sağda olmalıdır.
 * Parameter List   : Parametre listesi zorunlu değildir. Birden fazla parametre varsa aralara virgül kullanmak gereklidir.
 * Method Signature : method signature; method ismi ve parametre listesinden oluşur. java bir methodu metthod isminden ve parametre listesinden tanır.
 *
 *
 */
