package org.basics.ocp17.chapter08;

public class _05_Using_Method_References {

    public static void main(String[] args) {

        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        System.out.println(methodRef.check("Zoo"));
        System.out.println(lambda.check("Zoo"));

        System.out.println("--------------------");

        StringTwoParameterChecker methodRef2 = String::startsWith;
        StringTwoParameterChecker lambda2 = (s, p) -> s.startsWith(p);

        System.out.println(methodRef2.check("Zoo", "A"));
        System.out.println(lambda2.check("Zoo","A"));

    }

}

interface StringParameterChecker{
    boolean check(String text);
}

interface  StringTwoParameterChecker{
    boolean check(String text, String prefix);
}

/**
 *
 * ----- Calling Instance method on a Parameter -----
 *
 *
 */
