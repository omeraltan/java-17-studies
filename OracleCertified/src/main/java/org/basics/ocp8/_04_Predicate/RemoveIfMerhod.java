package org.basics.ocp8._04_Predicate;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfMerhod {

    public static void main(String[] args) {
        List<String> greeting =new ArrayList<>();
        greeting.add("John");
        greeting.add("Mary");
        greeting.add("Bob");
        greeting.add("Jane");
        greeting.add("Jack");
        greeting.removeIf(str -> str.startsWith("M"));
        greeting.forEach(System.out::println);
    }

}
