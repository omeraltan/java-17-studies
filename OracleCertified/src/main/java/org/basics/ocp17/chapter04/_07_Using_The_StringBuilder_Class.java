package org.basics.ocp17.chapter04;

public class _07_Using_The_StringBuilder_Class {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        System.out.println(same);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("----------");
        StringBuilder sb1 = new StringBuilder();            // -> Sadece boş bir constructor kullanılıyor.
        StringBuilder sb2 = new StringBuilder("animal");    // -> Nesne için bir başlatma değeri verilmektedir.
        StringBuilder sb3 = new StringBuilder(10);  // -> Bu nesnenin kapasitesi belirlenmektedir.

        System.out.println("----------");
        var sb4 = new StringBuilder("animals");
        String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
        int len = sb4.length();
        char ch = sb4.charAt(6);
        System.out.println(sub + " " + len + " " + ch);     // -> anim 7 s

        System.out.println("----------");
        var sb5 = new StringBuilder().append(1).append('c');
        sb5.append("-").append(true);
        System.out.println(sb5);

        //sb5.append(null);             // -> DOES NOT COMPILE
        sb5.append("null");
        System.out.println(sb5);

        System.out.println("----------");
        var sb6 = new StringBuilder("animals");
        sb6.insert(7,"-");
        sb6.insert(0,"-");
        sb6.insert(4,"-");
        System.out.println(sb6);

        System.out.println("----------");
        var sb7 = new StringBuilder("abcdef");
        sb.delete(1,3);                 // -> sb = adef
        sb.deleteCharAt(5);       // -> exception

        System.out.println("----------");
        var sb8 = new StringBuilder("abcdef");
        sb.delete(1,100);               // -> Hata vermez.

        System.out.println("----------");
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3,6,"sty");
        System.out.println(builder);

        System.out.println("----------");
        var sb9 = new StringBuilder("pigeon");
        sb9.reverse();
        System.out.println(sb9);



    }

}

/**
 *
 * 1. StringBuilder sınıfı ThreadSafe olmadığı için daha hızlı çalışır. Mutable özelliğe sahiptir.
 * 2. StringBuilder için 3 farklı şekilde constructor oluşturulabilir.
 * 3. StringBuilder da kullanılan methodların bir kısmı String ile ortaktır.
 * 4. append();         -> StringBuilder dizisine eklemeler yapar.
 * 5. insert();         -> StringBuilder dizisinin istediğimiz konumuna eklemeler yapar.
 * 6. delete();         -> StringBuilder dizisinin istediğimiz konumunu siler (Aralıklı da silebilir).
 * 7. deleteCharAt();   -> StringBuilder dizisinin karakterini siler.
 * 8. replace();        -> StringBuilder dizisinde değiştirme yapar.
 * 9. reverse();        -> StringBuilder dizisinde ters çevirme işlemi yapar.
 *
 */
