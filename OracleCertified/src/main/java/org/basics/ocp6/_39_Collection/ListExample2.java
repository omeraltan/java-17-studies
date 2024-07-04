package org.basics.ocp6._39_Collection;

import java.util.Arrays;
import java.util.List;

public class ListExample2 {

    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E", "F"};
        List list = Arrays.asList(array);
        System.out.println(list);

        // list.add("element5);
        // java.lang.UnsupportedOperationException
        // Arrays.asList ile bir arrayden List oluşturduğumuzda eleman eklememize izin vermez!
        list.set(1, "element2_new");

        List list2 = Arrays.asList("e1","e2","e3","e4","e5","e6");
        System.out.println(list2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for(Object o : list2){
            System.out.print(o);
        }
    }

}

/**
 *
 *
 *
 */
