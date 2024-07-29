package org.basics.ocp8._11_Optional;

import java.util.Optional;

public class OptionalTest04 {

    public static void main(String[] args) {

        Optional<String> opt1 = Optional.empty();
        System.out.println(opt1.map(String::length).orElse(-1));
        opt1.map(String::length).orElseThrow(RuntimeException::new);

    }

}
