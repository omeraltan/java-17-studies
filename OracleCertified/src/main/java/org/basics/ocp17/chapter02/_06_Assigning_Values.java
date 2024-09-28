package org.basics.ocp17.chapter02;

public class _06_Assigning_Values {

    public static void main(String[] args) {
        int fur = (int) 5;                  // -> Buradaki casting geçerli ama gereksizdir.
        int hair = (short) 2;
        String type = (String) "Bird";      // -> Buradaki casting geçerli ama gereksizdir.
        short tail = (short) (4 + 10);
        // long feathers = 0(long);         // -> DOES NOT COMPILE

        // float egg = 2.0 / 9;             // -> DOES NOT COMPILE  (double bir sayının 9 a bölünmesi sonucu double olur ve double sayısı float a verilemez.)
        // int tadpole = (int)5 * 2L;       // -> DOES NOT COMPILE  (int e cast edilen 5 sayısının Long tipindeki iki sayısı ile çarpımı long olur. Bu yüzden int e verilemez.)
        // short frog = 3 - 2.0;            // -> DOES NOT COMPILE  (int tipindeki 3 literali double bir sayıdan çıkarıldığında sonuç double olduğundan short a verilemez.)

        //  int fish = 1.0;                 // -> DOES NOT COMPILE
        // short bird = 1921222;            // -> DOES NOT COMPILE (outside the short range)
        // int mammal = 9f;                 // -> DOES NOT COMPILE (float int a atanamaz.(açık bir cast işlemi olmadan))
        // long reptile = 192_301_398_193_810_323; // -> DOES NOT COMPILE

        System.out.println(Integer.MAX_VALUE);      // 2147483647
        System.out.println(Integer.MAX_VALUE + 1);  // -2147483648

        System.out.println(Integer.MIN_VALUE);      // -2147483648
        System.out.println(Integer.MIN_VALUE - 1);  // 2147483647

        byte b = (byte) -200;                       // byte max = 127, byte min = -128
        System.out.println(b);

        short mouse = 10;
        short hamster = 3;
        // short capybara = mouse * hamster;        // -> DOES NOT COMPILE (iki short literal inin çarpım sonucu "int" e yükseltilir. Bundan dolayı short a aktarılamaz.)

        short mouse2 = 10;
        short hamster2 = 3;
        short capybara2 = (short) (mouse2 * hamster2);

        short mouse3 = 10;
        short hamster3 = 3;
        // short capybara3 = (short) mouse2 * hamster2; // -> DOES NOT COMPILE

        short mouse4 = 10;
        short hamster4 = 3;
        // short capybara4 = 1 + (short) (mouse4 * hamster4); // -> DOES NOT COMPILE

        // byte değeri -128 ile 127 aralığında olduğu ve aşağıdaki değerlerin bu aralığın içinde olduklarından casting işlemine gerek yoktur.
        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;

        // Bir değişkeni bir literal ile topladığınızda veya diğer işlemleri için casting yapmanız gerekir. Aralığın içinde olsa bile hata verir.
        // short boots = 2 + hat;   // -> DOES NOT COMPILE (Bir değişken ile literalin işlemi sonucu int dir. İkiside literal olmadığı için hata verir.)
        // byte gloves = 7 * 100;   // -> DOES NOT COMPILE (Burada derleme hatası vermesinin nedeni maksimum değeri aştığı içindir.)

        int camel = 2, giraffe = 3;
        camel = camel * giraffe;    // -> Simple assignment operator
        camel *= camel;             // -> Compound assignment operator

        long goat = 10;
        int sheep = 5;
        // sheep = sheep * goat;    // -> DOES NOT COMPILE (long ile int çarpıldığında long meydana gelir ve bu değeri int e atayamazsınız.)

        long goat2 = 10;
        int sheep2 = 3;
        sheep2 *= sheep2;          // -> Burada otomatik olarak bir casting işlemi vardır. Bu yüzden hata vermez.


    }

}

/**
 *
 * 1. Assignment operator, eşittir operatörüdür. Sağdaki değeri soldaki değişkene atar. Sağdan sola doğru çalışır.
 * 2. Casting: Bir veri tipinin açıkça başka bir veri tipi olarak yorumlandığı unary bir işlemdir.
 * 3. Casting opsiyonel bir işlemdir ve larger data tipine dönüşümlerde gereksizdir ancak smaller data tiplerine dönüşümlerde gereklidir.
 * 4. Smaller işlemlerde casting kullanılmaz ise compile time error verecektir.
 * 5. Geniş bir data tipini daha küçük bir data tipine atamaya çalıştığımızda compile time error alırız.
 * 6. Overflow (yukarı taşma durumu) : Bir sayının artık veri tipine sığmayaak kadar büyük olması durumunda en küçün negatif sayıya wrap edilmesi ve oradan saymaya başlamasıdır.
 * 7. Underflow (aşağı taşma durumu) : Bir sayının veri tipine sığmayacak kadar küçük olması durumunda ortaya çıkacak bir durumdur.
 * 8. Literaller ile çalışırken işlemin sonucu data tipine uyarsa casting yapmaya gerek yoktur.
 * 9. Compound Assignment Operator ler (+=, -=, /=, *=) 'in kısayol olarak kullanımlarından başka açık bir şekilde cast işlemi yapmamıza gerek kalmaz.
 *
 */
