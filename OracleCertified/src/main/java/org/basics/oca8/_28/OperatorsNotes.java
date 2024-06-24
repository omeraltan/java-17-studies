package org.basics.oca8._28;

interface Speedy{

}

class Car{

}

class Ford extends Car implements Speedy{

}

class Honda extends Car{

}

public class OperatorsNotes {

    public static void main(String[] args) {

        Ford ford = new Ford();
        System.out.println(ford instanceof Car);
        System.out.println(ford instanceof Ford);
        System.out.println(ford instanceof Speedy);
        // System.out.println(ford instanceof Honda);

        int x = 10;
        System.out.println("number: " + x + 3);

        int i = 10;
        int j = 10;
        System.out.println(i++);
        System.out.println(++j);

        int point = 80;
        String result = point < 45 ? "Yes" : "No";
        System.out.println(result);
        String result2 = point < 45 ? "Yes" : point > 95 ? "No" : "Yes";
        System.out.println(result2);



    }


    public static void getExamples(){
        int number = 10;
        number += 20;
        System.out.println(number);

        int x = 3;
        x *= 2 + 5;
        System.out.println(x);


        boolean b = false;

        if (b=true){
            System.out.println("if works");
        }else {
            System.out.println("else works");
        }

        if (b){
            System.out.println("if works");
        }
        else {
            System.out.println("else works");
        }

        int d = 10;
        if (d > 5){
            System.out.println("if works");
        }
    }

}

/**
 *
 * Assignment Operator (Atama Operatörü)
 *
 * Compound Assignment Operator
 * ++ == += /*
 *
 * Equality & Relational Operatorler
 * < <= > >=
 * boolean değişkenler için == kullanmak hataya neden olabilir.
 *
 * Type Corporation Operator (instance of)
 *
 * Arithmetic Operator
 * + - * /
 *
 * Increment / Decrement@
 * ++ --
 *
 * Conditional Operator (ternary Operator)
 * x = (boolean expression) ? if true : if false
 *
 * Bitwise Operator
 * & | ^
 *
 * BitShifting Opearator
 * >> <<
 *
 * Logical Operator
 * && || !
 *
 */
