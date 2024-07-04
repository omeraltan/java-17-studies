package org.basics.ocp6._36_Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherExample3 {

    public static void main(String[] args) {
        getTest1();
        System.out.println("------------");
        getTest2();
    }

    public  static void getTest1(){
        String content = "cont566ent1 ctn2tent25k.";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println("index : " + m.start() + " the number : " + m.group());
        }
    }

    public  static void getTest2(){
        String content = "cont566ent15a ct889n2tent25k.";
        Pattern p = Pattern.compile("\\d{3,}"); // \\d\\d\\d
        Matcher m = p.matcher(content);

        while (m.find()) {
            System.out.println("index : " + m.start() + " the number : " + m.group());
        }
    }

}

/**
 *
 * quantifier -> kaç defa geçiyor bilgisi için kullanıyoruz.
 * *        -> 0 veya daha fazla {0,}
 * +        -> 1 veya daha fazla {1,}
 * ?        -> 0 veya 1 tane {0,1}
 * {X}      -> X tane kadar
 * {X,}     -> X tane kadar yada daha fazla
 * {X,Y}    -> min X, max Y kadar tane olsun.
 */

