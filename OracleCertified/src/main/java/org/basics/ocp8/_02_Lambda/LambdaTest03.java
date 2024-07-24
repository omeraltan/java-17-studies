package org.basics.ocp8._02_Lambda;

@FunctionalInterface
interface Message{
    public void printMessage(String message);
}

public class LambdaTest03 {

    public static void main(String[] args) {
        Message lambda1 = (String message) -> System.out.println(message);
        Message lambda2 = (message) -> System.out.println(message);
        Message lambda3 = message -> System.out.println(message);
        Message lambda4 = System.out::println;

        lambda1.printMessage("Hello World1");
        lambda2.printMessage("Hello World2");
        lambda3.printMessage("Hello World3");
        lambda4.printMessage("Hello World4");
    }

}

/**
 *
 * Method sadece bir tane parametre alıyorsa ve parametre tipini belirtmediysek, bu durumda parantez kullanmasak da olur.
 * Lambda gramerini fonksiyonel interface lerde kullanabiliriz.
 *
 */
