package org.basics.ocp17.chapter03;

import java.util.List;

public class _02_Shorting_Code_With_Pattern_Matching {

    public static void main(String[] args) {
            compareIntegers(100);
            compareIntegers(200);

        patternVariablesAndExpressions(6);
        patternVariablesSubtypes(5);
    }

    public static void compareIntegers(Number number){
        if(number instanceof Integer){
            Integer data = (Integer)number;
            System.out.println(data.compareTo(5));
        }
    }

    // 3    -> Burada bir casting işlemi yapılmamaktadır.
    public static void compareIntegersWithPatternVariable(Number number){
        if(number instanceof Integer data){         // -> PATTERN MATCHING
            System.out.println(data.compareTo(5));
        }
    }

    public static void reassigningPatternVariables(Number number){
        if(number instanceof Integer data){
            data = 10;
        }
        if(number instanceof final Integer data){
            // data = 11;       -> DOES NOT COMPILE
        }
    }

    // 5    -> Pattern Variables And Expressions
    public static void patternVariablesAndExpressions(Number number){
        if(number instanceof Integer data && data.compareTo(5) > 0){
            System.out.println(data);
        }
    }

    public static void patternVariablesSubtypes(Number number){
        Integer value = 123;
        if(value instanceof Integer ){
            System.out.println("Correct");
        }
        // if(value instanceof Integer data){}     // -> Compile Time Error
        Number value2 = 123;
        if(value2 instanceof Integer data){        // -> Pattern Variables And Subtypes
            System.out.println(data.compareTo(5));
        }
    }

    public static void patternVariablesOtherTypes(Number number){
        Number value = 123;
        if(value instanceof List){}         // -> Hata vermez ama false döner
        if(value instanceof List data){}    // -> Hata vermez ama false döner

    }

    // 7 - 8
    public static void patternVariablesFlowScoping(Number number){
//        if(number instanceof Integer data || data.compareTo(5) > 0){    // -> DOES NOT COMPILE
//            System.out.println(data);
//        }
        if (number instanceof Integer data && data.compareTo(5) > 0){
            System.out.println(data);
        }
    }

    public static void printIntegerTwice(Number number){
        if(number instanceof Integer data)
            System.out.println(data.intValue());
        // System.out.println(data.intValue());     -> DOES NOT COMPILE
    }

}

/**
 *
 * 1. "Pattern Matching" ile kodu kısaltmak.
 * 2. Java 16 ile birlikte instanceOf operatörü ile if bloğunda pattern matching yapısını kullanabiliyoruz.
 * 3. Pattern Matching boiler plate kodu azaltmak için kullanılır.
 * 4. Pattern variable ı yeniden atama yapabiliriz ancak bu durum kötü bir kod yaklaşımı olacaktır. Yinede kodumuz derlenecektir.
 * 5. Pattern Variables And Expressions
 * 6. Pattern Variable ın türü, ifadenin sol tarafındaki değişkenin bir alt türü olması gerekmektedir. Aynı tipte olamaz. Geleneksel instanceOf operatöründe yoktur.
 * 7. Flow Scoping: Derleyici Pattern Matching ile çalışırken flow scoping i uygular.
 * 8. Compiler tam olarak değişkenin tipini belirleyebildiği zaman bu değişkenin scope da yani yaşam alanında olması demektir.
 *
 */
