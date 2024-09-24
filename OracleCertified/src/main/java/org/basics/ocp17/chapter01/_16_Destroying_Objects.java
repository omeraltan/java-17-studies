package org.basics.ocp17.chapter01;

class ReferenceExample{

}

public class _16_Destroying_Objects {

    public static void main(String[] args) {
        ReferenceExample obj;   // -> Reference example

        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }

}

/**
 *
 * 1. Garbage Collection mekanizması memory kaynak yönetiminin adıdır.
 * 2. Javada memory yönetimi garbage collector tarafından sağlanmaktadır.
 * 3. Garbage collector otomatik memory yönetimi ile bellek sızıntılarına engel olur.
 * 4. Java da nesneler ve bu nesnelerin instance değişkenleri "heap" te yaşarlar.
 * 5. Garbage collector un amacı heap te bulunan ve ulaşılamayan sahipsiz nesneleri heap alanından silmektir.
 * 6. Java kodumuz JVM içerisinde çalışmaktadır.Garbage collector JVM içerisinde çalışan yapılardan biridir.
 * 7. System.gc() methodu ile garbage collector ün çalışmasını teşvik edebiliyoruz ancak bu methodun bir garantisi yoktur.
 * 8. System.gc() methodu ile biz aslında çöpümüzü çöp kutusuna attığımızı garbage collector'e söylüyoruz. Silip silmemek ona kalmıştır.
 * 9. Reference bir değişkendir ve bir nesneye erişim için kullanılır.
 * 10. Bir reference başka bir reference a atanabilir.
 * 11. Reference ların hepsi tiplerden bağımsız olarak aynı size dadır.
 * 12. Bir nesne heap'te yer alır ve ismi yoktur.
 * 13. Bir nesneye direkt erişim söz konusu değildir.
 * 14. Nesneler farklı tipte ve size da olabilirler ve memory tüketirler.
 * 15. Bir nesne başka bir nesneye atanamaz, methoda gönderilemez ve methoddan dönemez.
 * 16. Yapılan işlemlerin tamamı bir reference üzerinden yapılmaktadır.
 * 17. Bir reference ı bir methoda parametre olarak geçtiğimizde aslında adres bilgisini geçmekteyiz.
 * 18. Reference değişkenler heap teki nesnenin adres bilgisini tutarlar.
 * 19.
 *
 */
