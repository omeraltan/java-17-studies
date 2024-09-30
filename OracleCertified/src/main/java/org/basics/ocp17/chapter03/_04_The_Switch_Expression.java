package org.basics.ocp17.chapter03;

public class _04_The_Switch_Expression {

    public static void main(String[] args) {
        printDayOfWeek(1);
        printSeason(2);
        System.out.println(consistentDataType(3));
    }

    public static void printDayOfWeek(int day) {
        var result = switch (day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Invalid value";
        };
        System.out.println(result);
    }

    public static void printSeason(int month) {
        switch (month){
            case 1,2,3 -> System.out.println("Winter");
            case 4,5,6 -> System.out.println("Spring");
            case 7,8,9 -> System.out.println("Summer");
            case 10,11,12 -> System.out.println("Fall");
        }
    }

    public static int consistentDataType(int measuremet) {
        int size = switch (measuremet){
            case 5 -> 1;
            case 10 -> (short)2;
            default -> 5;
            // case 20 -> "3";      // -> DOES NOT COMPILE      String bir ifade int değere atanamaz. Çünkü dönüş değeri int
            // case 40 -> 4L;       // -> DOES NOT COMPILE      Long bir ifadeyi int e atayamayız.
            // case 50 -> null;     // -> DOES NOT COMPILE      null bit ifadeyi int local variable a atamayız.
        };
        return size;
    }

    public static void yieldRequired(){
        int fish = 5;
        int length = 12;
        var name = switch (fish){
            case 1 -> "GoldFish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10)
                    yield "BlobFish";
                else yield "Green";
            }
            default -> "SwordFish";
        };

    }

}

/**
 *
 * 1. Switch Expression, Switch Statement tan daha compact bir yapıya sahiptir böylelikle daha fazla boilerplate kodu temizlemiş oluruz.
 * 2. Switch Expression'ı bir değişkene atayabiliriz.
 * 3. Switch Expression iki tip branch destekler bir tanesi expression bir tanesi ise kod bloklarıdır.
 * 4. Switch Expression larda lamda operatörü kullanılmaktadır ancak her hangi bir lambda işlemi yoktur.
 * 5. Switch Expression larda "break" kullanmaya gerek yoktur.
 * 6. Switch Expression larda kod bloğu kullandığınızda "yield" kullanmanız gerekir.
 * 7. "yield" ifadesi return e karşılık gelir.
 * 8. Switch Expression larından sonra noktalı virgül gerekir.
 * 9. Switch Expression ları bir değişkene atandığı için kod bloğunun sonunda (caselerin ve switch in sonunda) bir noktalı virgül gerekir.
 * 10.Switch Expression ları geriye bir değer dönüyorsa ve bütün case leri desteklemiyorsa, default değerin kullanılması gerekir. Bu yüzden default değerin tanımlı olması gerekmektedir.
 * 11.Switch Expression larında random, uyumsuz bir değer dönemeyiz.
 * 12.Switch Expression larında "default" branch kullanmak zorunludur.
 * 13.
 *
 */
