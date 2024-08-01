package org.basics.ocp8._15_Nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Nio2Test15 {

    public static void main(String[] args) throws IOException {

        /* ---------------- BiPredicate ---------------*/
        // Burada "BiPredicate" kullanılarak: İlgili dosyalar sayfalar arasından bir süzme yapılmaktadır. regular file olmaso ve class uzantılı dosyaların olması istenmektedir.
        BiPredicate<Path, BasicFileAttributes> matcher = (path, attribute) -> attribute.isRegularFile() && path.toString().endsWith("class");

        // "8" derinlikteki class ları bulup getirmektedir.
        try(Stream<Path> stream = Files.find(Paths.get("."), 8, matcher)){
            stream.forEach(System.out::println);
        }
    }

}
