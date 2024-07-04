package org.basics.ocp6._34_File;

import java.io.File;

public class FileExample3 {

    public static void main(String[] args) {

        File file = new File(".");
        String[] files = file.list();
        for (String fileName : files) {
            System.out.println(fileName);
        }

        System.out.println();

        File[] files2 = file.listFiles();
        for (File f : files2) {
            if (f.isDirectory()) {
                System.out.println("directory  : " + f.getAbsolutePath());
            } else if (f.isHidden()) {
                System.out.println("hidden : " + f.getAbsolutePath());
            }else {
                System.out.println("file : " + f.getAbsolutePath());
            }

        }

    }

}

/**
 *
 *
 *
 */
