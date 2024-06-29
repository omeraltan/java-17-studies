package org.basics.oca8._39;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample4 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        // list.add(10); compile time error, sadece String eklenebilir.
        // generic ifadede primitiveler kullanılamaz.
        // collectionların elemanları nesnedir. Primitive eleman tutmazlar.

        // Code to Interface : sol taraf interface -> Lİst sağ taraf ise implemente eden class -> ArrayList. Esneklik açısından doğru bir yaklaşımdır.
        List<Integer> numbers = new ArrayList<>();
        numbers = new LinkedList<>();
        // LinkedList IS-A List

    }

}

