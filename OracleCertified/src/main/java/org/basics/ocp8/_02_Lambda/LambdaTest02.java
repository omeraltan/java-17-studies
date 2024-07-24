package org.basics.ocp8._02_Lambda;

@FunctionalInterface
interface Calculator{

    int operator(int a, int b);

    // İkinci abstract method için hata verir çünkü @FunctionalInterface anotasyonu ile işaretlenmiştir.
    // int operator2(int a, int b);

    // Tanımlanabilir sorun olmaz.
    public static void method1(int a, int b){
        System.out.println(a+b);
    }

    // Tanımlanabilir sorun olmaz.
    default void method2(int a, int b){
        System.out.println(a+b);
    }

}

public class LambdaTest02 {

    public static void main(String[] args) {
        Calculator method1 = (int a, int b) -> {
            return a + b;
        };

        // Parametre tipini vermek zorunda değiliz. Parametre listesinde bir tanesinin tipini yazarsak diğerininkinide yazmamız gerekir.
        Calculator method2 = (a, b) -> a - b;

        // Calculator method3 = (a, b) -> return a * b; -> legal değildir. return anahtar kelimesini kullandığımızda süslü parantez kullanmamız gerekir.
        Calculator method3 = (a, b) ->{
            if(b == 10){
                System.out.println("test message!");
            }
            return a * b;
        };

        System.out.println(method1.operator(1,2));
        System.out.println(method2.operator(3,2));
        System.out.println(method3.operator(3,10));
    }

}

/**
 *
 * Fonksiyonel interface bir tane abstract methodu olan interface dir.
 * Birden fazla abstract methodu olamaz. Eğer fonksiyonel interface ise.
 * Bu interfacelerde static yada default methodlar olabilir. Her hangi bir problem teşkil etmezler.
 *
 */
