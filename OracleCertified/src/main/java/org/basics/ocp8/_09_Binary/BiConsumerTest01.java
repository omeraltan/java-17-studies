package org.basics.ocp8._09_Binary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest01 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);
        BiConsumer<List<Integer>, Integer> bic1 = (List<Integer> list, Integer i) -> list.add(i);
        bic1.accept(numbers, 11);
        System.out.println(numbers);

        BiConsumer<List<Integer>, Integer> listAddElement = List::add;
        listAddElement.accept(numbers, 12);
        System.out.println(numbers);

    }

}
