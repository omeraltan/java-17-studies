package org.basics.ocp8._15_NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Test05 {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("test.txt");
        if (!Files.exists(path1)){
            // Eğer mevcut file/folder varsa xception atar (kontrol koymadığımızda -> java.nio.file.FileAlreadyExistsException)
            Files.createFile(path1);
        }

        Path path2 = Paths.get("test2.txt");
        if (!Files.exists(path2)){
            Files.createFile(path2);
        }

    }

}
