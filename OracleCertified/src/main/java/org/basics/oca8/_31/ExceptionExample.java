package org.basics.oca8._31;

public class ExceptionExample {

    public static void main(String[] args) {

        try{
            System.out.println(100/0);
            System.out.println("not work");
            // kod/proje crash olur.
            // catch bloğu yok.
            // finally bloğı yine de çalışır.
        }finally {
            System.out.println("finally works!\n");
        }

        System.out.println("not works");
    }


}

/**
 *
 * try-catch-finally
 * try-catch-catch-finally n -> 0,1,2...
 * try-finally
 * finally tek başına kullanılamaz.
 * catch-finally şeklinde de olamaz.
 * finally bloğu, kodumuzda exception olsun yada olmasın çalışmasını istediğimiz bir kod bloğunu finally bloğu içerisine alırız.
 * close resource, clean up gibi kavramlar olarak geçer (kaynakların kapatılması)
 * aksi durumda memory leak'ler memory şişmeleri ortaya çıkabilir (OutOfMemoryError)
 * yada veritabanı şişer, isteklere cevap veremez.
 */
