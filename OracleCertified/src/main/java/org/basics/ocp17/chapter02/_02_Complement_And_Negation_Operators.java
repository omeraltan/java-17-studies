package org.basics.ocp17.chapter02;

public class _02_Complement_And_Negation_Operators {

    public static void main(String[] args) {

        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep);
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep);

        System.out.println("------------");

        int value = 3;                      // Stored as 0011
        int complement = ~value;            // Stored as 1100
        System.out.println(value);
        System.out.println(complement);

        System.out.println("------------");

        double zooTemperature = 1.21;
        System.out.println(zooTemperature);
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature);

        System.out.println("------------");

        // int pelican = !5;            -> DOES NOT COMPILE
        // boolean penguin = -true;     -> DOES NOT COMPILE
        // boolean peacock = !0;        -> DOES NOT COMPILE



    }

}

/**
 *
 * 1. Logical complement operator (!), ilgili ifadeyi tersine çevirecektir.
 * 2. Bitwise complement operator (~), ikilik tabanda bulunan sıfırları bir, birleride sıfır yapar. Bu operator sadece byte, short, int, long ve char ile tanımlamış değişkenlerde kullanılabilir.
 *
 */
