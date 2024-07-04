package org.basics.ocp6._42_Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardsNotes3 {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        listRuleV5(numbers);
        // listRuleV6(numbers); // compile error

        listRuleV5(objects);
        listRuleV6(objects);
    }

    // <?> -> <? extends Object> aynı anlama gelir
    public static void listRuleV5(List<?> list){
        // bu methodda list'e yeni eleman eklenemez.
    }

    public static void listRuleV6(List<Object> list){
        list.add(100);
        list.add("key");
    }

}
