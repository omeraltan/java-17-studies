package org.basics.ocp17.chapter04;

public class _09_String_Pool {

    public static void main(String[] args) {

        var x = "Hello World";
        var y = "Hello World";
        var z = "Hello " + "World";
        System.out.println(x == y);     // -> true
        System.out.println(x == z);     // -> true
        System.out.println(y == z);     // -> true

        var x2 = "Hello World";
        var y2 = "Hello";
        var z2 = " World";
        var z3 = y2 + z2;
        System.out.println(x2 == z3);   // -> false

        System.out.println("------------");
        var x4 = "Hello World";
        var y4 = " Hello World".trim();
        System.out.println(x4 == y4);   // -> false

        System.out.println("------------");
        var singleString = "Hello World";
        var concat = "Hello ";
        concat += "World";
        System.out.println(singleString == concat);

        System.out.println("------------");
        String fullMessage = "hello world";
        final String msg1 = "hello";
        final String msg2 = " world";
        String msg3 = msg1 + msg2;
        System.out.println(fullMessage == msg3);

        System.out.println("------------");
        var name = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(name == name2);              // -> true

        System.out.println("------------");
        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);            // -> true
        System.out.println(first == second.intern());   // -> true
        System.out.println(first == third);             // -> false
        System.out.println(first == third.intern());    // -> true

    }


}

/**
 *
 * 1. Aynı literal e sahip String değişkenler aynı pool içerisinde bulundukları için aynı nesneye bakarlar.
 * 2. Literal birleştirmeleri aynı ise sonuç true döner.
 * 3. Literal yerine değişkenleri concat ederseniz sonuç false dönecektir.
 * 4. String ler immutable özelliğe sahiptir ve literaller havuzdan gönderilmektedir.
 * 5. JVM literal için bir tane nesne oluşturur.
 * 6. Literaller için trim() kullanılırsa da eştlik sağlanmaz. trim() kullanıldığında String pool da yeni bir nesne oluşur.
 * 7. String literaller için concat işlemi yaptığınızda da eşitlik sağlanmaz.
 * 8. Literaller de final değişkenler kullanırsanız eşitliği sağlayabilirsiniz.
 * 9. Method dan dönen String değerler için değerler aynı olsalar bile eşitlik sağlanmaz. Çünkü farklı nesneler üretilir.
 * 10. "intern()" methodu ile String Pool daki değer kullanılır.
 *
 */
