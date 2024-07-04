package org.basics.ocp6._39_Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Collection ların elemanları primitive olmaz, hepsi obje tipindedir.

        List subList = list.subList(0,2);
        System.out.println(subList);

        Object[] array = new Integer[list.size()];
        array = list.toArray(array);

        for(Object o : array){
            System.out.println(o);
        }
    }

}


