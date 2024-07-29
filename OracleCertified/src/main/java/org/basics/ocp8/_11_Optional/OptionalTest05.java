package org.basics.ocp8._11_Optional;

import java.util.Optional;

public class OptionalTest05 {

    public static void main(String[] args) {

        Optional<Integer> value = Optional.of(100);

        threeDigit(value);
        shortFormThreeDigit(value);

    }

    public static void threeDigit(Optional<Integer> optional) {
       if (optional.isPresent()) {          // outer if
           Integer num = optional.get();
           String string = num.toString();
           if (string.length() == 3) {      // inner if
               System.out.println(string);
           }
       }
    }

    public static void shortFormThreeDigit(Optional<Integer> optional) {
        optional.map(n -> n.toString()).filter(n -> n.length() == 3).ifPresent(System.out::println);
    }

}
