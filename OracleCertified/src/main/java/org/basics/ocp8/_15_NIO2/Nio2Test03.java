package org.basics.ocp8._15_NIO2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Test03 {

    public static void main(String[] args) {

        Path path3 = Paths.get("folder1", "folder2", "zoodirector");
        System.out.println(path3);
        System.out.println(path3.isAbsolute());
        System.out.println(path3.toAbsolutePath());

    }

}
