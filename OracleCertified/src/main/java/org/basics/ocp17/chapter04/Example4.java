package org.basics.ocp17.chapter04;

public class Example4 {

    public static void main(String[] args) {

        var name = """
            ÖMER
                ALTAN
            FATHER""";

        System.out.println(name.length());
        System.out.println(name.indent(1).length());
        System.out.println(name.indent(-2).length());
        System.out.println(name.stripIndent().length());

    }

}
