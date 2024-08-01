package org.basics.ocp8._15_Nio2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Test02 {

    public static void main(String[] args) {

        Path path1 = Paths.get("/folder/folder2/folder3/test.txt");
        System.out.println(path1.getFileName());
        System.out.println(path1.getRoot());
        System.out.println(path1.getParent());
        System.out.println(path1.getNameCount());
        System.out.println(path1.getName(2)); // -> Index yapısı sıfırdan başladığı için "folder3" ü gösterecektir.
        /*
            0 -> folder
            1 -> folder2
            2 -> folder3
            3 -> text.txt
         */
        System.out.println(path1.getClass());
        System.out.println(path1.isAbsolute());
        System.out.println(path1.subpath(1,3)); // -> 1'inci dahil 3'üncü dahil değildir (0'dan başlar).
        System.out.println(path1.getFileName());

        // File to Path <----> Path to File

        File file1 = path1.toFile();        // -> Path to File
        Path pathToPath = file1.toPath();   // -> File to Path



    }

}

/**
 *
 * path : absolute, relative
 * absolute path'ler unix sistemler için "/" ile başlar.
 * windows için c:\\ veya d:\\ şeklinde olabilir.
 *
 *
 */
