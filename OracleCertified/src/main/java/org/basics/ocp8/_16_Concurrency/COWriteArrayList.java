package org.basics.ocp8._16_Concurrency;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWriteArrayList {

    public static void main(String[] args) {

        List<String> aList = new CopyOnWriteArrayList<>();
        aList.add("A");
        aList.add("B");
        aList.add("C");

        Iterator listIterator = aList.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            aList.add("D");
        }
        System.out.println(aList);
    }

}

/**
 *
 * liste bilgisini dönmemiz esnasında ekleme yapmamıza izin veren yapı burada "CopyOnWriteArrayList" dir.
 * output :
 *  A
 *  B
 *  C
 *  [A, B, C, D, D, D]
 *
 *  Multiple Thread ler ile collection üzerinde çalıştığınızda her zaman concurrent collection ları kullanmalısınız.
 *
 */
