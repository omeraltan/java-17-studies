package org.basics.ocp17.chapter04;

import java.util.Arrays;

public class Example6 {

    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(bugs.toString());
        System.out.println(Arrays.toString(bugs));

        String[] names = new String[4];
        for (String name : names){
            System.out.println(name);
        }

        int[] numbers = {1,5,20,3,4};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {1,5,20,3,4};
        System.out.println(numbers.equals(numbers2));
        System.out.println(Arrays.equals(numbers, numbers2));
    }

}
