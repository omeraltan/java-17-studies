package org.basics.ocp17.chapter04;

public class _05_Translating_Escapes {

    public static void main(String[] args) {

        var str = "1\\t2";
        System.out.println(str);                        // -> 1\t2
        System.out.println(str.translateEscapes());     // -> 1     2

        System.out.println("------------");
        System.out.println("1\t2");
        System.out.println("1\"2");
        System.out.println("1\n2");
        System.out.println("1\s2");

        System.out.println("------------");
        var str2 = "1\\n2";
        System.out.println(str2);
        System.out.println(str2.translateEscapes());

        System.out.println("------------");
        var str3 = "1\\s2";
        System.out.println(str3);
        System.out.println(str3.translateEscapes());

        System.out.println("------------");
        var str4 = "1\\\"2";
        System.out.println(str4);
        System.out.println(str4.translateEscapes());

        System.out.println("------------");
        System.out.println(" ".isEmpty());      // -> false
        System.out.println("".isEmpty());       // -> true
        System.out.println(" ".isBlank());      // -> true
        System.out.println("".isBlank());       // -> true

        System.out.println("------------");
        var name = "Kate";
        var orderId = 5;
        System.out.println("Hello " + name + ", order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
        System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

        System.out.println("------------");
        var fullname = "Kate Middleton";
        var score = 90.25;
        var total = 100;
        System.out.println("%s:%n Score: %f out of %d".formatted(fullname, score, total));

        System.out.println("------------");
        var pi = 3.14159265359;
        System.out.format("[%f]\n", pi);
        System.out.format("[%12.8f]\n", pi);        // -> Toplam 12 haneli bir sayı vermesini ve noktadan sonra 8 hane vermesini istiyor. Geri kalan boş olarak doldurulur.
        System.out.format("[%012f]\n", pi);         // -> Toplam 12 haneli bir sayı ondalık kısmı belirtilmediği için altı haneli olacak ve boş kalan alanlara sıfır atayacaktır.
        System.out.format("[%12.2f]\n", pi);        // -> Toplam 12 haneli bir sayı ondalık kısmı 2 haneli diğer haneler boş olarak yansıtılır.
        System.out.format("[%.3f]\n", pi);          // -> Virgülden sonra üç hane olması istenmiştir.
    }

}

/**
 *
 * 1. translateEscapes();
 * 2. isEmpty();
 * 3. isBlank();
 * 4. format(String format, Object args...);
 * 5. format(Locale loc, String format, Object args...);
 * 6. formatted(Object args...);
 * 7.   %s          ->          String ifadeler için
 * 8.   %d          ->          int ve long için kullanılmaktadır.
 * 9.   %f          ->          float ve double için kullanılmaktadır. %f noktadan (.) sonra altı haneyi yazdırır (Örnek: 3.122345).
 * 10.  %n          ->          yeni bir satır eklemek için kullanılmaktadır.
 *
 */
