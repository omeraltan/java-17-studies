package org.basics.ocp8._02_Lambda;

@FunctionalInterface
interface LambdaMessage{

    public void printMessage(String message);

}

public class LambdaTest05 {

    int number;

    public static void main(String[] args) {
        String localVariable = "injava";
        // localVariable = "compilerError"; // Compile time error. Değişkene iki kez atama yapılamaz.
        LambdaTest05 object = new LambdaTest05();
        object.number = 10;
        object.number = 20;
        LambdaMessage lambda1 = (String str) -> System.out.println(localVariable + " " + str + object.number);
        lambda1.printMessage("Hello World");
    }

}

/**
 *
 * Local değişkene iki kere assignment yaparsak, bu durumda "effectively finaly" özelliğini kaybeder.
 * Bu durumda lambda ifadesinde local değişkeni kullanamayız.
 * Local variable ya "final" olmalı ya da "effectively final" olmalıdır.
 * Instance değişkenler için bu kural geçerli değildir.
 *
 */
