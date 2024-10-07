package org.basics.ocp17.chapter04;

public class _01_Creating_And_Manipulating_String {

    public static void main(String[] args) {

        // String tanımlama yöntemleri
        String name1 = "Fluffy";
        String name2 = new String("Fluffy");
        String name3 = """
            Fluffy""";

        // equals methodu sadece içeriklere bakar.
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name1.equals(name3));

        System.out.println(1 + 2);              // -> Toplama işlemi anlamına gelir. 3
        System.out.println("a" + "b");          // -> ab
        System.out.println("a" + "b" + 3);      // -> ab3
        System.out.println(1 + 2 + "c");        // -> 3c
        System.out.println("c" + 1 + 2);        // -> c12
        System.out.println("c" + null);         // -> cnull

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);   // -> 64

        var s = "1";
        s += "2";
        s += 3;
        System.out.println(s);                  // -> 123


    }

}

/**
 *
 * 1. String sınıfı "java.lang" paketinde yer alır. java.lang paketi otomatik olarak import edilir (Her class için).
 * 2. String bir biri ardına gelen karakterlerden oluşur.
 * 3. String sınıfı "CharSequence" interface ini implement eder.
 * 4. Concatenating :
 *      a. Eğer iki operand da sayı ise bu durumda bir toplama işlemi anlamına gelir.
 *      b. Eğer iki operand dan biri String ise bu durumda "concatenating" anlamına gelecektir.
 *      c. İşlemler soldan sağa doğru değerlendirilir.
 *
 */
