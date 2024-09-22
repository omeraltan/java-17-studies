package org.basics.ocp17.chapter01;

public class _11_Text_Blocks {

    public static void main(String[] args) {

        /*
                "Java Study Guide"
                    by Scott & Jeanne

             Not: Yukarıdaki kodu yazdırabilmek için aşağıdaki gibi bir kod yazmamız gerekir.
         */

        String eyeTest = "\"Java Study Guide\"\n    by Scott & Jeanne";
        System.out.println(eyeTest);
        System.out.println();

        // Yukarıdaki kodun yerine aşağıdakini yazabiliriz.
        String eyeTest2 = """
            Java Study Guide
                by Scott & Jeanne
            """;
        System.out.println(eyeTest2);
        System.out.println();
        String pyramid = """
            *
          *   *
        *   *   *
        """;
        System.out.println(pyramid);
        System.out.println();

        String pyramid2 = """
                *
               ***
              *****
        """;
        System.out.println(pyramid2);

        System.out.println("----- Examples -----");
        String textBlock1 = """
                \"sample"
            """;
        System.out.println(textBlock1);
        System.out.println();

        String textBlock2 = """
                \"""line1"
            """;
        System.out.println(textBlock2);
        System.out.println();

        String textBlock3 = """
                \"\"\"line1"
            """;
        System.out.println(textBlock3);
        System.out.println();

        String textBlock4 = """
                \\\\\\line1"
            """;
        System.out.println(textBlock4);
        System.out.println();

        String textBlock5 = """
                \"\sline1"
            """;
        System.out.println(textBlock5);
        System.out.println();

        String textBlock6 = """
                line1 \
                   line1-part2 \
                  line1-line3
            """;
        System.out.println(textBlock6);
        System.out.println();

        // String block = """doe""";       // -> DOES NOT COMPILE

        // Bu kodun tamamı aynı satırdadır.
        String block2 = """
            doe \
            deer""";
        System.out.println(block2);
        System.out.println();

        // Bu kodda iki satır arasında bir boşlukta vardır.
        String block3 = """
            doe \n
            deer
            """;
        System.out.println(block3);
        System.out.println();

        String block6 = """
            "doe\"\"\"
            \"deer\"""
           """;
        System.out.println("*" + block6 + "*");
    }

}

/**
 *
 * 1.   Text Blocks jAVA 15 ile Standart olarak eklenmiştir.
 * 2.   Text Blocks 3 tane çift tırnak karakteri ile başlarlar.
 * 3.   String textBlock = """          ---> Start text block
 *       |  "Java Study Guide"
 *       |    | by Scott & Jeanne""";   ---> End text block
 *       |    |
 *       |   Essential whitespace (Zorunlu anlamına gelir.)
 *      Incidental whitespace (Önemsiz boşluklar anlamına gelmektedir.Kodun daha okunur olmasını sağlar. Koda herhangi bir etkisi yoktur.)
 * 4.   Text Blocks  açıldıktan sonra line break ile bir alt satıra geçmemiz gerekir. Yoksa hata verir.
 *
 */
