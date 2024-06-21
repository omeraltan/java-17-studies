package org.basics.oca8._17;

public class StaticNotes {

}

/**
 *
 * static -> keyword
 * static variables
 * static methods
 * static nested class
 * static initialize block
 * static import
 * instance variable lar obje ile beraber yaşarlar.
 * n tane Employee objesi olsun, bu durumda her objenin alt bir tane age alanı / property değeri / instance değişkeni mevcuttur.
 * obje sayısından bağımsız olarak sadece bir tane "count" değişkeni mevcuttur.
 * static variable -> class variable
 * instance variable -> instance variable / object variable
 * java da objeler heap memory de yaşar. instance variable lar da heap memory de yaşar, değişkenin kendisi
 * static değişkenin kendisi permgen denilen özel heap bölgesinde yaşar.
 * Eğer bir objeyi gösteriyorsa, bu obje yine heap alanında yaşar.
 * Her methodu her değişkeni static yapmak doğru bir yaklaşım değildir.
 * Utility olarak ifade edilen yardımcı / pratik sınıflardır.
 * projede farklı sınıfların, farklı methodların ihtiyacı olan bir formatlama (number, date, text işlemi, dosya okuma vb.) işlemleri için static methodlar tercih edilir.
 * static methodlar içerisinde non-static variable lar direkt olarak kullanılamazlar, çağırılamazlar.
 * static methodlar içerisinde non-static methodlar direkt olarak kullanılamazlar, çağrılamazlar.
 * Instance methodlar instance variable lara erişim sağlayabilir.
 *
 */

class Employee{

    private static int count = 10;  // static variable
    private int age;                // instance variable


}
