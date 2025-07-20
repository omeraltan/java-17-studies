package org.basics.ocp17.chapter08;

public class _12_Checking_Functional_Interfaces {

    public static void main(String[] args) {



    }

}

/**
 *
 * What functional interface would you use in these three situations?
 *
 * 1. Returns a String without taking any parameters    -> Supplier ( T get(); )
 * 2. Returns a Boolean and takes a String              -> Function ( R apply (T t); ) (Predicate olmaz çünkü primitive boolean dönmektedir.)
 * 3. Returns an Integer and takes two Integers         -> BiFunction or BinaryOperator
 *
 */
