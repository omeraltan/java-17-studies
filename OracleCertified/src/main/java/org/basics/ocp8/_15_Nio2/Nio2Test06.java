package org.basics.ocp8._15_Nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Test06 {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("folder");

        if (!Files.exists(path1)){
            Files.createDirectory(path1);
        }

        Path path2 = Paths.get("dir1/dir2"); // -> iç içe iki ayrı dosya oluşturulmaya çalışıldığı için patlar (NoSuchFileException)
        if (!Files.exists(path2)){
            //Files.createDirectory(path2); // -> Bu kod patlar çünkü iç içe iki ayrı dosya yapısı vardır.
            Files.createDirectories(path2); // -> Bu kod patlamaz
        }

    }

}
