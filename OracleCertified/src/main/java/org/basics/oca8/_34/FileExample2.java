package org.basics.oca8._34;

import java.io.File;
import java.io.IOException;

public class FileExample2 {

    public static void main(String[] args) throws IOException {

        File file = new File("old_name.txt");
        file.createNewFile();

        File fileNewName = new File("new_name.txt");
        file.renameTo(fileNewName);
    }

}


