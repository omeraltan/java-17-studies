package org.basics.ocp8._11_Optional;

import java.util.Optional;

public class OptionalTest03 {

    public static void main(String[] args) {

        Optional<String> opt = Optional.of(" Hello ");

        // --------- short form with ifPresent() ----------
        opt.ifPresent(System.out::println); // -> This expression is very short

        // --------- long form with isPresent() -----------
        if (opt.isPresent()) {              // -> This expression is long
            System.out.println(opt.get());
        }

    }

}
