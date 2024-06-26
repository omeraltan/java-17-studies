package org.basics.oca8._36;

import java.util.StringTokenizer;

public class TokenizerNotes {

    public static void main(String[] args) {
        getTest1();
        System.out.println("------------");
        getTest2();
    }

    public static void getTest1(){
        String content = "key1 key2 key3";
        StringTokenizer st = new StringTokenizer(content); // default boşluğa göre ayırır.
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }

    public static void getTest2(){
        String content = "key1 key2 key3";
        StringTokenizer st = new StringTokenizer(content, ","); // default boşluğa göre ayırır.
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }

}

/**
 *
 *
 *
 */
