package org.basics.oca8._34;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException {

        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory,"file.txt");
        file.createNewFile();

        System.out.println(directory.isDirectory());
        System.out.println(directory.getAbsolutePath());

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(directory.delete()); // directory dolu iken silmez.
        System.out.println(file.delete());

    }

}

/**
 *
 *
 *
 */
