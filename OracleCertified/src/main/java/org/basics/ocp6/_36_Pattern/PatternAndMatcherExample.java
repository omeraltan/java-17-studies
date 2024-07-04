package org.basics.ocp6._36_Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherExample {

    public static void main(String[] args) {

        getTest1();
        System.out.println("-------------");
        getTest2();


    }

    public static void getTest1(){
        String content = "abababa";
        Pattern p = Pattern.compile("ab");

        Matcher m = p.matcher(content);
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest2(){
        String content = "abababa";
        Pattern p = Pattern.compile("aba");

        Matcher m = p.matcher(content);
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

}


