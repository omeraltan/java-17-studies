package org.basics.ocp17.chapter01;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;       // -> Full path bilgisidir.

public class _04_Understanding_Package_Declarations_And_Imports {

    public static void main(String[] args) {
        Random r = new Random();                // -> Burada Random sınıfı import ediliyor.
        List<Integer> list = new ArrayList<>(); // -> Burada hem List sınıfı hemde ArrayList sınıfı import ediliyor.
        list.add(r.nextInt(10));
        list.add(r.nextInt(20));
    }

}

class WildCardImport{
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println(atomicInteger.get());
    }
}

class DateSiniflariKullanimi{
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    }
}

/**
 *
 * Java sınıfları package ler içerisinde kümelenir.
 * package ler sınıflarımızın adresini verir.
 * package isimleri tersten yazılır.
 * package ler aralarına nokta konularak ayrılır.
 * wildcard : Bunlar özel karakterler olarak adlandırılır.
 * import java.util.*;  ->  ilgili pakette yer alan bütün sınıflar import edilir.
 *
 * import java.util.*;                      -> Bu import'un anlamı sadece util paketinin atındaki sınıfları import eder.
 * import java.util.concurrent.*;           -> Bu import işlemi de aynısını geröekleştirir. atomic paketinin altındaki "AtomicInteger" sınıfına buradan erişemeyiz.
 * import java.util.concurrent.atomic.*;    -> "AtomicInteger" sınıfı bu paketin altında olduğu için import işlemi gerçekleştirilir.
 *
 * Redundant Imports : Gereksiz import işlemi demektir.
 *
 * import java.lang.System;                 -> Javada otomatik olarak java.lang paketi import edilir. Sınıflara bunu eklemeye gerek yoktur.
 * import java.lang.*;                      -> Javada otomatik olarak java.lang paketi import edilir. Sınıflara bunu eklemeye gerek yoktur.
 *
 * Eğer Random sınıfını kullanıyor isek bir sınıfta :
 * import java.util.*;                      -> Bu paketin tamamını import etmeye gerek yoktur çünkü Random sınıfı aşağıda import edilmiştir.
 * import java.util.Random;
 *
 * Import işlemleri ile ilgili olarak File ve Paths sınıflar için aşağı verilen import lara göz atalım (Bu sınıflar "java.nio.file" paketinin altındadır):
 * import java.nio.*;               -> Bu şekilde üst paketten alt pakete erişemezsiniz.
 * import java.nio.*.*;             -> İki tane wildcard ifadesi geçerli değildir. Sadece bir tane wildcard kullanabiliriz ve onunda sonda olması gerekir.
 * import java.nio.file.Paths.*;    -> Bu ifade geçerli değildir çünkü sınıfın altındaki bileşenlere bakan bir wildcard yoktur.
 *
 * Naming Conflicts : Import paketleri için anlaşmazlığa düşülen konular için geçerlidir.
 * Date sınıfı için hangisini import etmek istediğinizi belirtmelisiniz. -> java.util.*;    java.sql.*;
 *
 * import java.util.Date;
 * import java.sql.*;
 *
 * Date sınıfı için yukarıdaki durum (import lar için) geçerlidir çünkü Date sınıfı için import işlemi java.util.Date ile açık olarak yazılmıştır.
 * Burada wildcard ikinci önceliklidir (import java.sql.*;).
 *
 * İkiside açık bir şekilde yazılmak istenirse tekrar derleme hatası verecektir.
 * import java.util.Date;           -> Burada hangisini seçeceğine karar veremez.
 * import java.sql.Date;            -> Burada hangisini seçeceğine karar veremez.
 *
 * İki paketin altındaki Date sınıflarını aynı sınıf içinde kullanmak istiyorsanız eğer tam paket adları ile sınıf içerisinde kullanabilir siniz.
 *
 *
 */
