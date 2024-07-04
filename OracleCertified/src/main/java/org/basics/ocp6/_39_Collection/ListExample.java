package org.basics.ocp6._39_Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        List numbers2 = new ArrayList();
        numbers2.addAll(numbers);
        System.out.println(numbers2);
        numbers2.add(0,200);
        System.out.println(numbers2);

    }

}

