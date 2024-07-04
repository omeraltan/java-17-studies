package org.basics.ocp6._42_Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsNotes {

    public static void main(String[] args) {

        // Rule - 1
        List<Integer> numbers = new ArrayList<>();
        // numbers.add("compile error");
        Integer numberGet = numbers.get(0);

        // Rule - 2
        List nonGeneric = new ArrayList();
        nonGeneric.add(200);
        Integer numberGeneric = (Integer) nonGeneric.get(0);

        // Rule - 3




    }

}

/**
 *
 * Generic lerin sağlamış olduğu avantajlar:
 * 1 - derleme / compile time da güçlü bir type check/tip kokntrolü sağlar
 * 2 - generic yapıyı kullandığımızda casting işlemine gerek kalmaz.
 * 3 - generic yapısı genel bir implemantasyon sağlar.
 *
 */
