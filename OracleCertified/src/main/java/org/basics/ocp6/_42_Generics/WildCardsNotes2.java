package org.basics.ocp6._42_Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardsNotes2 {

    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        List<Dogs> dogs = new ArrayList<>();
        List<Dogs> kangals = new ArrayList<>();
        List<Cats> cats = new ArrayList<>();

        listRulesV2(animals);
        listRulesV2(dogs);
        listRulesV2(kangals);
        // listRulesV2(cats); // compile error

        System.out.println(dogs.size());
        System.out.println(animals.size());
        System.out.println(kangals.size());

    }

    public static void listRulesV2(List<? super Kangals> list) {
        list.add(new Kangals());
        // list.add(new Animals());
        // list.add(new Dogs());
    }

}

/**
 *
 *
 *
 */
