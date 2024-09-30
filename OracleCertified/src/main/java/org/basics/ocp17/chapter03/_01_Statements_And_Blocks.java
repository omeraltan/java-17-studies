package org.basics.ocp17.chapter03;

public class _01_Statements_And_Blocks {

    public static void main(String[] args) {
        getData(14);
    }

    public static void getData(int hourOfDay){
        if(hourOfDay < 11){
            System.out.println("Good Morning");
        }
        // 2
        if(hourOfDay > 13)
            System.out.println("Good Afternoon");
    }

}
/**
 *
 * 1. Bir java statement ifadesi noktalı virgül ile tamamlanan bir java ifadesidir.
 * 2. Bir if bloğunda "curly braces" {} tek bir satır için gerekli değildir.
 * 3. Boolean değişkenleri bir if bloğu içerisinde koşul olarak kullanabiliriz.
 * 4. Else statement içinde tek bir satır varsa "curly braces" {} gerekli değildir.
 * 5. Tek bir satır dahi olsa "curly braces" {} kullanılmaması tavsiye edilmez. Okunurluğun artırılması için curly braces'ın her zaman kullanılması tavsiye edilir.
 * 6. If bloğuna gönderiler argumanın boolean bir arguman olması gerekmektedir.
 * 7.
 *
 */
