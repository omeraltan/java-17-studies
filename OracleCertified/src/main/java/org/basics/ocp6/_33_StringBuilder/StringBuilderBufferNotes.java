package org.basics.ocp6._33_StringBuilder;

public class StringBuilderBufferNotes {

    public static void main(String[] args) {

        // StringBuilder compilerError  = "compiler error";
        StringBuilder sb=new StringBuilder("Java");
        // sb = sb + "rules"; // not works!
        sb.append(" Rules!");
        System.out.println(sb); // obje mutable özelliğe sahiptir. Kendisine atama yapmaya gerek yoktur.

        sb.delete(0,3);
        System.out.println(sb);
        sb.insert(0,"Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        // String str = sb; // StringBuilder IS-A String değildir.
        String str = sb.toString();
        System.out.println(str);
    }

}

/**
 *
 * java.lang.StringBuffer  -> thread-safe       synchronized
 * java.lang.StringBuilder -> not thread-safe   daha hızlı
 * Bu sınıfların methodları aynıdır.
 * StringBuffer ın methodları synchronized özelliğe sahiptir.
 * StringBuilder ın methodları synchronized değildir. Bu nedenle daha hızlı çalışır.
 *
 */
