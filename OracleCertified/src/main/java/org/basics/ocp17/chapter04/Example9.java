package org.basics.ocp17.chapter04;

public class Example9 {

    public static void main(String[] args) {

        var str = "Hello\\tWorld";
        System.out.println(str);
        System.out.println(str.translateEscapes());

        System.out.println("---------------");

        var str2 = "Line1\\nLine2";
        System.out.println(str2);
        System.out.println(str2.translateEscapes());

        System.out.println("---------------");

        var name = "Kate";
        var age = 30;

        System.out.println(String.format("Hello %s, you are %d years old", name,age));
        System.out.println("Hello %s, you are %d years old".formatted(name, age));

        System.out.println("---------------");

        double pi = 3.14159265359;

        System.out.printf("[%f]\n", pi);
        System.out.printf("[%12.8f]\n", pi);
        System.out.printf("[%012f]\n", pi);
        System.out.printf("[%12.2f]\n", pi);
        System.out.printf("[%.3f]\n", pi);

        System.out.println("---------------");

        var start = "AniMal     ";
        var trimmed = start.trim();
        var lowerCase = trimmed.toLowerCase();
        var result = lowerCase.replace('a', 'A');
        System.out.println(result);

        String reslut2 = "AniMal    ".trim().toLowerCase().replace('a', 'A');
        System.out.println(reslut2);

        System.out.println("---------------");

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append("World").append("!");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(5, ",");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Hello World");
        sb3.delete(5,11);
        System.out.println(sb3);

        sb3.deleteCharAt(4);
        System.out.println(sb3);

        System.out.println("---------------");

        StringBuilder sb4 = new StringBuilder("Hello World");
        sb4.replace(6,11,"Java");
        System.out.println(sb4);

        System.out.println("---------------");

        StringBuilder sb5 = new StringBuilder("Hello World");
        sb5.reverse();
        System.out.println(sb5);

        System.out.println("---------------");

        StringBuilder sb6 = new StringBuilder("Hello World");
        sb6.append(100).append('A').append(true).append("test");
        System.out.println(sb6);


    }

}
