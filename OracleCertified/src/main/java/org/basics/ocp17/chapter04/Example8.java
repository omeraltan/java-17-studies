package org.basics.ocp17.chapter04;

public class Example8 {

    public static void main(String[] args) {

        String message = "Welcome, Java World!";
        System.out.println("String length: " + message.length());

        System.out.println("Second character : " + message.charAt(1));

        System.out.println(message.contains("Java"));

        System.out.println("---------------");

        String[] words = message.split(" ");
        for (var word : words){
            System.out.println(word);
        }

        System.out.println("---------------");

        String letters = "programming";
        System.out.println(letters.charAt(1));
        System.out.println(letters.charAt(4));

        System.out.println("---------------");

        String sentence = "hello world";
        System.out.println(sentence.indexOf("o"));
        System.out.println(sentence.lastIndexOf("o"));

        System.out.println("---------------");

        String sentence2 = "hello world";
        System.out.println(sentence2.substring(0,4));
        System.out.println(sentence2.substring(sentence2.length() -4));

        System.out.println("---------------");

        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println("---------------");

        String newWord = "hello world";
        System.out.println(newWord.startsWith("hell"));
        System.out.println(newWord.endsWith("world"));

        System.out.println("---------------");

        String changeWord = "banana";
        System.out.println(changeWord.replace('a', 'o'));

        System.out.println("---------------");

        String charWord = "hello";
        char[] chars = charWord.toCharArray();
        for (char c : chars){
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("---------------");

        String word3 = "hello world";
        char[] dest = new char[5];
        word3.getChars(0,5,dest,0);
        System.out.println(dest);

        System.out.println("---------------");

        String word4 = "comando";
        System.out.println(word4.replaceAll("o","a"));
        System.out.println(word4.replaceFirst("a","o"));

        System.out.println("---------------");

        String email = "example@example.com";
        boolean isValid = email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        System.out.println("Is Valid e-mail: " + isValid);  // true

        System.out.println("---------------");

        String word5 = "hello world";
        String word6 = "world";
        boolean isMatch = word5.regionMatches(6, word6, 0, 5);
        System.out.println("Is Matching : " + isMatch);

        System.out.println("---------------");

        int number = 123;
        String strNumber = String.valueOf(number);
        System.out.println(strNumber);

        System.out.println("---------------");

        String name = "John";
        int age = 25;
        String formattedString = String.format("Name : %s, Age: %d", name, age);
        System.out.println(formattedString);

        System.out.println("---------------");

        String sentences = "hello world";
        System.out.println(sentences.contains("world"));
        System.out.println(sentences.contains("java"));

        System.out.println("---------------");

        String str3 = "Hello";
        String str4 = " World";
        System.out.println(str3.concat(str4));

        System.out.println("---------------");

        String str5 = "apple";
        String str6 = "banana";
        System.out.println(str5.compareTo(str6));
        System.out.println(str5.compareToIgnoreCase(str5));

        System.out.println("---------------");

        String str7 = "  hello world  ";
        System.out.println(str7.strip());           // baştaki ve sondaki karakterleri kaldırır.
        System.out.println(str7.stripLeading());    // baştaki karakteri kaldırır.
        System.out.println(str7.stripTrailing());   // sondaki karakteri kaldırır.

        System.out.println("---------------");

        String str8 = new String("hello");
        String str9 = "hello";
        System.out.println(str8 == str9);           // false
        System.out.println(str8.intern() == str9);  // true
        System.out.println(str8 == str9.intern());  // false (new ile yeni nesne oluşturulan String değerler için)

        System.out.println("---------------");

        String text = "Hello\nWorld\nJava";
        text.lines().forEach(System.out::println);

        System.out.println("---------------");

        String result = String.join(", ", "apple", "banana", "cherry");
        System.out.println(result);

        System.out.println("---------------");

        String str10 = "Hello ";
        System.out.println(str10.repeat(5));

        System.out.println("---------------");

        String tryIndent = "  Hello. How are you!";
        System.out.println(tryIndent.length());                 // 21
        System.out.println(tryIndent.indent(1).length());    // 23 indent sona bir karakter boşluk koyar
        System.out.println(tryIndent.indent(-1).length());   // 20 indent için negatif değer verirseniz sona boşluk bırakmaz.

        System.out.println(tryIndent.stripIndent().length());   // 19 soldaki boşlukları temizler

    }

}
