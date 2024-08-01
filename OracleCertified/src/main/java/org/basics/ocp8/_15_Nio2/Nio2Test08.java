package org.basics.ocp8._15_Nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Nio2Test08 {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("original/file.txt");
        System.out.println(path1);
        Path path2 = Paths.get("copied/copied.txt");
        if (!Files.exists(path2)){
            Files.createDirectories(path2.getParent());
        }
        // copy methodu ile ilgili dosyanın içindeki file ın içindeki bilgiler yeni file a taşınır, kopyalanır.
        Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING); // -> Eğer ilgili file oluşturulmuş ise tekrar oluşturulmasını engeller, hata almaz (StandardCopyOption.REPLACE_EXISTING).

    }

}
