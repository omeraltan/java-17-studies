package org.basics.ocp8._15_NIO2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Test04 {

    public static void main(String[] args) {

        Path path1 = Paths.get("../../test/sub/a/b.txt");
        System.out.println(path1.toAbsolutePath());                 // -> /Users/omeraltan/workspace/java-17-studies/../../test/sub/a/b.txt
        System.out.println(path1.toAbsolutePath().normalize());     // -> /Users/omeraltan/test/sub/a/b.txt

    }

}

/**
 *
 * "."  -> A reference to the current directory
 * ".." -> A reference to the parent of the current directory
 *
 */
