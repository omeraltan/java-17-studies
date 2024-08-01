package org.basics.ocp8._15_Nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Test09 {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("myFolder");

        if (!Files.exists(p1)){
            Files.createDirectory(p1);
        }

        // move() methodu ile bir dosyanın ismi başka bir dosyanın ismi ile değiştirilebilir.
        Path p2 = Paths.get("renamedFolder");
        Files.move(p1, p2);

    }

}
