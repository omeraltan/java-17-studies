package org.basics.ocp8._15_Nio2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Nio2Test12 {

    public static void main(String[] args) throws IOException {

        /* --------------- BasicFileAttributes ---------------*/
        // "BasicFileAttributes" ile ilgili sayfanın bilgilerine detayları ile ulaşılabilir. Birçok methodu mevcuttur.

        Path p1 = Paths.get("original/file.txt");
        BasicFileAttributes attributes = Files.readAttributes(p1, BasicFileAttributes.class);
        System.out.println(attributes.creationTime());
        System.out.println(attributes.lastModifiedTime());
        System.out.println(attributes.lastAccessTime());
        System.out.println(attributes.isRegularFile());
        System.out.println(attributes.isDirectory());
        System.out.println(attributes.isSymbolicLink());
        System.out.println(attributes.isOther());
        System.out.println(attributes.size());

    }

}
