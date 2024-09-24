package org.basics.ocp17.chapter01;

public class _13_Initializing_Variables {

    public static void main(String[] args) {
        final int y = 10;
        int x = 20;
        // y = x + 10;  -> DOES NOT COMPILE

        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
        // favoriteNumbers = null;      -> DOES NOT COMPILE

    }

    public int notValid(){
        int y = 10;
        int x;
        int reply = 0;
        // int reply = x + y;   -> DOES NOT COMPILE
        return reply;
    }

}

/**
 *
 * Değişkenlere değer atanması:
 * 1. Java da değişkenleri local, instance ve class variables (static variables) olarak üçe ayırabiliriz.
 * 2. Local variables bir method da bir constructor da veya initializer block ta tanımlanan değişkenlerdir.
 * 3. Local variable lar javada stack memory de yaşarlar. Bu nedenle stack variable olarakta isimlendirilirler.
 * 4. Local variable lar sadece final anahtar kelimesini alabilir.
 * 5. Bir değişken final olduğunda constant yani sabit bir değer olarak adlandırılır.
 * 6. Local variables varsayılan olarak bir değere sahip değildir. Kullanılmadan önce mutlaka initialize edilmelidir.
 *
 */
