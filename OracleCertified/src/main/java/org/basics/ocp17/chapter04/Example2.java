package org.basics.ocp17.chapter04;

import java.util.Locale;

public class Example2 {

    public static void main(String[] args) {

        String str1 = "Ömer";
        String str2 = new String("ALTAN");
        String str3 = """
            ÖMER
                ALTAN
            """;
        var str4 = "ÖMER ALTAN";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("------------------");

        String str5 = "ÖMER ALTAN";
        char[] chars = str5.toCharArray();
        for (char ch: chars){
            System.out.println(ch);
        }

        System.out.println("------------------");

        var animals = "animals-animals";
        System.out.println(animals.charAt(1));

        System.out.println("------------------");

        System.out.println(animals.indexOf('a'));
        System.out.println(animals.indexOf("ls"));
        System.out.println(animals.lastIndexOf('a'));
        System.out.println(animals.lastIndexOf("ls"));

        System.out.println("------------------");

        System.out.println(animals.substring(3));
        System.out.println(animals.substring(3,6));

        System.out.println("------------------");

        System.out.println(animals.toUpperCase());
        System.out.println(animals.toUpperCase(Locale.UK));
        System.out.println(animals.toUpperCase(new Locale("tr", "TR")));

        System.out.println("------------------");

        System.out.println(animals.equals("animals-animals"));
        System.out.println("abc".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        System.out.println("------------------");

        System.out.println(animals.startsWith("a"));
        System.out.println(animals.startsWith("A"));

        System.out.println("------------------");

        System.out.println(animals.endsWith("s"));
        System.out.println(animals.endsWith("S"));

        System.out.println("------------------");

        System.out.println(animals.contains("n"));
        System.out.println(animals.contains("ls"));

        System.out.println("------------------");

        System.out.println("ÖMER ALTAN".replace("ÖMER", "ADİL"));
        System.out.println("ÖMER ALTAN".replace("ÖMER",  "adil"));
        System.out.println("ÖMER ALTAN".replace('M', 'Z'));

        System.out.println("------------------");



    }

}
