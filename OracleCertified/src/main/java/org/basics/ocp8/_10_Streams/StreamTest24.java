package org.basics.ocp8._10_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest24 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Double d = list.stream().collect(Collectors.averagingDouble(x->x));
        System.out.println(d);
    }

}
