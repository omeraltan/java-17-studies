package org.basics.oca8._36;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherNotes {

    public static void main(String[] args) {
        getTest1();
        System.out.println("------------");
        getTest2();
        System.out.println("------------");
        getTest3();
        System.out.println("------------");
        getTest4();
        System.out.println("------------");
        getTest5();
        System.out.println("------------");
        getTest6();
        System.out.println("------------");
        getTest7();
        System.out.println("------------");
        getTest8();
        System.out.println("------------");
        getTest9();
        System.out.println("------------");
        getTest10();
    }

    public static void getTest1(){
        String content = "java";
        Pattern p = Pattern.compile("v");

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest2(){
        String content = "omeraltan";
        Pattern p = Pattern.compile("t");

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest3(){
        String content = "omeraltantan";
        Pattern p = Pattern.compile("ta");

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest4(){
        String content = "omeraltantan";
        Pattern p = Pattern.compile("an|u"); // | -> or veya

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest5(){
        String content = "omeraltantan";
        Pattern p = Pattern.compile("[anu]"); // a|n|u

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest6(){
        String content = "omeraltantan";
        Pattern p = Pattern.compile("[ae][nr]"); // "an" geçen yerleri ve "er" geçen yerleri bulur

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest7(){
        String content = "omeraltantan";
        Pattern p = Pattern.compile("[a-e]"); // a|b|c|d|e

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest8(){
        String content = "71426";
        Pattern p = Pattern.compile("[2-7]"); // [2-7] -> bu aralıktaki sayıların yerleri ve sayıları yazdırır.

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest9(){
        String content = "ömeraltan84";
        Pattern p = Pattern.compile("[^mer]"); // mer ile başlamasın anlamına gelmektedir. carat işareti: bunların dışında anlamına gelmektedir.

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

    public static void getTest10(){
        String content = "ömeralatan84";
        Pattern p = Pattern.compile("[^mer]a"); // mer ile başlamasın anlamına gelmektedir. carat işareti: bunların dışında anlamına gelmektedir.

        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }

}

/**
 *
 * regex -> regular expression
 *
 * java.util.regex.Matcher
 * java.util.regex.Pattern
 *
 */
