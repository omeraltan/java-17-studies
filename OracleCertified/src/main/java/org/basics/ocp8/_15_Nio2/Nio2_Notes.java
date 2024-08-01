package org.basics.ocp8._15_Nio2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2_Notes {

    public static void main(String[] args) {

        // Burada sadece File objesi oluşur. Bu kod storage da yeni bir text.txt dosyası oluşturmaz.
        File file =  new File("text.txt");

        // Yukarıdaki durum path içinde geçerlidir.
        Path path = Paths.get("test.txt");

        System.out.println(path.getClass());
    }

}

/**
 *
 * ---------------------- NON BLOCKING INPUT / OUTPUT -------------------------
 * java.nio.file.Path -> interface, eski java.io.File a karşılık gelmektedir.
 * java 1.7 ile birlikte gelen bir özellik/interface
 *
 */
