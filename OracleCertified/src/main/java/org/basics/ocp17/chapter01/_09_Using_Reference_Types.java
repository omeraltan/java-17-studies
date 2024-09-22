package org.basics.ocp17.chapter01;

public class _09_Using_Reference_Types {

    /**
     * İki String referansı farklı nesnelere bakarken "greeting" referansı "anotherObject" referansının baktığı nesneye
     * bakmaya başlıyor.
     */
    public static void main(String[] args) {
        String greeting = new String("Hello World!");
        String anotherObject = "anotherObject";
        greeting = anotherObject;
        System.out.println(anotherObject);
    }

}

/**
 *
 * 1.   Bir reference type objeyi refer eder. Yani nesneni gösterir.
 * 2.   Primitive type ların aksine reference type lar bir nesnenin adres bilgisini tutarlar.
 * 3.
 *
 */
