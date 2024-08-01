package org.basics.ocp8._15_Nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Nio2Test13 {

    public static void main(String[] args) throws IOException {

        // -> Proje içindeki ilgili dosyaların bilgilerini döner.
        try(Stream<Path> entries = Files.list(Paths.get("."))){
            entries.forEach(System.out::println);
        }

        System.out.println("----------");

        // -> Proje içindeki ilgili dosyaların bilgilerini getFileName() methodu ile döner.
        try(Stream<Path> entries = Files.list(Paths.get("."))){
            entries.forEach(p -> System.out.println(p.getFileName()));
        }

        System.out.println("----------");

        // -> Proje içindeki ilgili dosyaların absolute path bilgilerini toAbsolutePath() methodu ile döner.
        try(Stream<Path> entries = Files.list(Paths.get("."))){
            entries.forEach(p -> System.out.println(p.toAbsolutePath().normalize().toString()));
        }

    }

}
