package org.basics.ocp17.chapter06;

public class _02_Creating_Classes {

    public static void main(String[] args) {



    }

}

class Insect{
    protected int numberOfLegs = 4;
    String label = "buggy";
}

class Beetle extends Insect{
    protected int numberOfLegs = 6;
    short age = 3;

    public static void main(String[] args) {
        new Beetle().prindtData();
    }

    public void prindtData(){
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
        // System.out.println(super.age); DOES NOT COMPILE
        System.out.println(numberOfLegs);
    }
}

/**
 *
 * Sub class'lar hiç bir zaman parent'larının private üyelerini kalıtamazlar.
 * package level üyeler ise sadece sub class ve super class aynı pakette yer alıyorsa bu durumda inherit edilebilirler.
 * protected ve public ise farklı pakette olsalarda sub class super class'ın üyelerini inherit edecektir.
 * Bir source içerisinde birden fazla class tanımı yapabiliriz. public olan sınıf dosya ismi ile aynı olan sınıftır.
 * "this" keyword'ünün kullanımı bis sınıftaki değişkenler için oluşturulan nesnenin ifade ettiği değişkeni göstermek için kullanılabilir.
 * Aslında "this" anahtar kelimesi ile o sınıfta bulunan instance variable lara oluşturulan nesne ile erişebilirsiniz.
 * "super" keyword'ü ile super class'ın izin verilen instance variable'larına erişim sağlanır.
 * "this" keywor'ü ile o class ta instance variable varsa onu kullanır bulamaz ise super class'ına bakar varsa onu kullanır.
 *
 *
 */
