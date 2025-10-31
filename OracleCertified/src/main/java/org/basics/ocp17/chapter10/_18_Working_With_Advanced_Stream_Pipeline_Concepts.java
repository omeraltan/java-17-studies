package org.basics.ocp17.chapter10;

import java.util.ArrayList;

public class _18_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());

        System.out.println("--------------------");

    }

}

/**
 *
 * -------------------- Linking Streams To The Underlying Data --------------------
 *
 *
 */
