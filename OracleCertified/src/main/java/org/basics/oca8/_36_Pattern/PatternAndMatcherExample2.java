package org.basics.oca8._36_Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherExample2 {

    public static void main(String[] args) {
        getTest1();
        System.out.println("------------");
        getTest2();
    }

    public static void getTest1(){
        String content = "content1 ctn2tent25k";
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest2(){
        String content = "content1 ctn2tent25k.";
        Pattern p = Pattern.compile("c.n");
        Matcher m = p.matcher(content);
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

}

/**
 *
 * \d digit
 * \s whitespace
 * \w harf, rakam
 * \D non-digit
 * \S non-whitespace
 * \W non-word
 * .
 *
 */
