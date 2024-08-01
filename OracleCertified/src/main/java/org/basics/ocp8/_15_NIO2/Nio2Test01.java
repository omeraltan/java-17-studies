package org.basics.ocp8._15_NIO2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Test01 {

    public static void main(String[] args) {

        Path path1 = Paths.get("/folder1/folder2");
        System.out.println(path1.getClass());
        System.out.println(path1);

        File file = new File("/folder1/folder2");


    }

}

/**
 *
 * java.nio.file.Path ile java.io.File aynı diyebiliriz.
 *
 */
