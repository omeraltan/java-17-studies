package org.basics.ocp17.chapter04;

import java.util.Arrays;

public class Example7 {

    public static void main(String[] args) {

        System.out.println(Arrays.compare(new int[]{1}, new int[]{2}));
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1}));
        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{2}));

        System.out.println();

        System.out.println(Arrays.compare(new int[]{1,2}, new int[]{1,2}));

        System.out.println();

        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"aa"}));
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"A"}));
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"Z"}));

    }

}
