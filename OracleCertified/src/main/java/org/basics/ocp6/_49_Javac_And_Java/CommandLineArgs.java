package org.basics.ocp6._49_Javac_And_Java;

import java.util.Arrays;

public class CommandLineArgs {

    public static void main(String[] args) {
        Arrays.asList(args).forEach(System.out::println);
    }

}
