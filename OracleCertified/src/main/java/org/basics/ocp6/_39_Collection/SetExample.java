package org.basics.ocp6._39_Collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> keys = new HashSet<>();
        keys.add("A");
        keys.add("A");
        keys.add("B");
        keys.add("B");
        keys.add("C");
        keys.add("C");
        keys.add("D");
        keys.add("D");
        System.out.println(keys.size());

        // duplicate elemana izin vermez.

        for (String key : keys) {
            System.out.println(key);
        }
    }

}


