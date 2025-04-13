package org.basics.ocp17.chapter04;

public class Example5 {

    public static void main(String[] args) {

        String str = "Line1\\nLine2\\tTabbed";
        System.out.println("Original: " + str);
        System.out.println("Translate: " + str.translateEscapes());

        System.out.println("------------");

        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("".isBlank());

        System.out.println("------------");

        var name = "ÖMER ALTAN";
        var age = 40;

        System.out.println("Hello " + name + " your age is : " + age);
        System.out.println(String.format("Hello %s your age is : %d", name, age));
        System.out.println("Hello %s your age is : %d".formatted(name, age));

    }

}
