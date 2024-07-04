package org.basics.ocp6._42_Generics;

import java.util.ArrayList;
import java.util.List;

class Animals{

}

class Dogs extends Animals{

}

class Kangals extends Dogs{

}

class Cats extends Animals{

}

interface Live{

}

public class WildCardsNotes {

    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        List<Dogs> dogs = new ArrayList<>();
        List<Cats> cats = new ArrayList<>();

        listRulesV2(animals);
        listRulesV2(dogs);
        listRulesV2(cats);
    }

    public static void listRulesV2(List<? extends Animals> animals) {
        // animals.add(new Animals()); -> yeni eleman eklemeye izin vermez (? extends Animals olduğunda).
        // animals.add(new Dogs());
        animals.add(null); // sadece "null" eklenebilir.
    }

    public static void listRulesV23(List<? extends Live> live){

    }

}

/**
 *
 * Generic yapısında ? extends
 * ? super
 * "? extends ..." yeni eleman eklenmesine izin vermez.
 * ? implements diye bir şey yoktur. Interface de olsa yine "?  extends ..." ifadesi kullanılır.
 *
 */
