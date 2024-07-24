package org.basics.ocp8._02_Lambda;

public class LambdaTest01 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Runnable line1");
                System.out.println("Running Runnable line2");
            }
        };
        runnable.run();

        // Burada en solda yer alan parantez fonksiyonel interface'deki methodun parametre listesidir.
        // run() methodu parametre almasada yinede "()" parantez konulması gereklidir. Aksi durumda compile time da derleme hatası verecektir.
        Runnable runnable1 = () -> {
            System.out.println("Running Runnable1 line1"); System.out.println("Running Runnable1 line2");
        };
        runnable1.run();

    }

}

/**
 *
 * @FunctionalInterface : Lambda gramerini @FunctionalInterface ler ile kullanabiliriz.
 * @FunctionalInterface ler bir tane abstract methodu olan interface lerdir.
 *
 *
 */
