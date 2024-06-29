package org.basics.oca8._42;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample1 {

    public static void main(String[] args) {

        List<Integer> genericList = new ArrayList<>(); // compile time
        // List genericList = new ArrayList();         // runtime da bu şekilde görünmektedir


        // collectionların elemanları objedir.
        // generic yapısı compile / derleme zamanında koruma sağlar.
        genericList.add(1);
        genericList.add(2);
        genericList.add(3);
        addElement(genericList);

        System.out.println(genericList);

        // java.lang.ClassCastException:
        for(Integer i : genericList){
            System.out.println(i);
        }
    }

    // Yeni methodlar kullandığınızda her zaman "Generic" yapıyı kullanın.
    public static void addElement(List nonGeneric) {
        nonGeneric.add("legal or illegal?");
    }

}


