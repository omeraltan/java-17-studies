package org.basics.ocp8._16_Concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModifyingList {

    public static void main(String[] args) {

        List<String> aList = new ArrayList<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        Iterator listIter = aList.iterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
            aList.add("four"); // ConcurrentModificationException
        }

    }

}

/**
 *
 * Bir iterator işleminde listenin elemanlarını dönerken listeye ekleme yapmaya çalıştığımızda hata verecektir (ConcurrentModificationException).
 *
 *
 */
