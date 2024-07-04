package org.basics.ocp6._20_Assignment;

class Person{

}

public class AssignmentNotes {
    public static void main(String[] args) {
        Person person = new Person();   // "person" değişkeni, "Person" nesnesinin adres bilgisini tutar.
        Person person2 = person;        // assignment yaptığımızda, "person2" de ilgili "Person" nesnesini göstermektedir.
        person2 = null;                 // "person2" referansı artık her hangi bir nesneye bakmıyor demektir. Nesneye herhangi bir müdahale yapılmamıştır.

        int number = 10;

        byte b1 = 100;                  // 2 -> int literalidir. int 2 değerini daraltıyor, casting yapıyor.
        byte b2 = 80;                   // 3 -> int literalidir. int 3 değerini daraltıyor, casting yapıyor.
        // byte b3 = b1 + b2;           // compile time error verir. Otomatik olarak daraltma işlemi yapılmaz.
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
    }
}

/**
 *
 * assignment operatörü
 * byte değerler [-128, 127] aralığındadır. Toplamda 8 bittir. Toplam 256 sayı içerir.
 */
