package org.basics.oca8._32;

public class StringExample2 {
    public static void main(String[] args) {
        String lang1 = "java8";
        String version = "8";
        String lang2 = "java" + version;
        System.out.println(lang1 == lang2);

        System.out.println("------------");

        String lang3 = "java8";
        final String version3 = "8"; // değişken final olduğunda constant olduğu için true döner.
        String lang4 = "java" + version3;
        System.out.println(lang3 == lang4);

        System.out.println("------------");

    }
}

/**
 *
 * Her zaman String nesnelerini equals ile karşılaştırabilirsiniz.
 *
 */
