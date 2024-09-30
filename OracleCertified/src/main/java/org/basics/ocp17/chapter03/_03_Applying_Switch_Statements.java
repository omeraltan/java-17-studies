package org.basics.ocp17.chapter03;

public class _03_Applying_Switch_Statements {

    public static void main(String[] args) {
            getSwitchTraditional(1);
            getSwitchTraditional(2);
    }

    public static void getSwitchTraditional(Integer value){
        switch(value){
            case 1: case 2:
                System.out.println("Lion");
                break;
            case 3:
                System.out.println("Tiger");
                break;
            default:
                System.out.println("Cat");

        }
    }

    public static void getSwitchWithJava14(Integer value){
        switch(value){
            case 1, 2:
                System.out.println("Lion");
                break;
            case 3:
                System.out.println("Tiger");
                break;
            default:
                System.out.println("Cat");
        }
    }

    static final int getCookies(){return 4;}
    public static void getSwitchWithEvaluate(Integer value){
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch(numberOfAnimals){
            case bananas:
            // case apples:             // -> DOES NOT COMPILE
            // case getCookies():       // -> DOES NOT COMPILE
            // case cookies:            // -> DOES NOT COMPILE
            case 3 * 5:
        }
    }


}

/**
 *
 * 1. Eğer tek bir değere karşı birçok branch ihtimali olsaydı bu durumda bir çok if-else bloğu kullanmamız gerekecekti.
 * 2. Switch statement ı ile bunun alternatifi olarak kodumuzu yazabiliriz.
 * 3. "switch" ve "case" java da birer anahtar kelimedir. Ayrıca switch yapısında "default" ve "break" gibi anahtar kelimeleride kullanabiliriz.
 * 4. Bir switch ifadesi karar verici bir yapıya sahiptir. Kodun nasıl akacağına karar verir (flow-control).
 * 5. switch ifadelerinde : int, Integer, byte, Byte, short, Short, char, Character, String, enum ve var kullanılır.
 * 6. switch ifadelerine verilen değerler sabit değerler ve switch teki data tipi ile aynı olmalıdır.
 * 7. literal, enum ve final değişken kullanabiliriz.
 * 8.
 *
 */
