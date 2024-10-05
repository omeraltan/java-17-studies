package org.basics.ocp17.chapter03;

public class _05_Writing_While_Loops {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }

        System.out.println("----------");

//        while (int x = 0; x < 5) {            // -> Böyle bir tanımlama yapamazsınız.
//            System.out.println(x);
//        }

        System.out.println("----------");

        eatCheese(10);

    }

    public static void eatCheese(int bitesOfCheese){
        int roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " piece of cheese left");
    }
}

/**
 *
 * 1. While döngüsü bir boolean Expression almak zorundadır.
 * 2. While döngüsünün içerisinde eğer bir satır varsa curly braces gerekli değildir. Birden fazla satır varsa curly braces zorunludur.
 * 3.
 *
 */
