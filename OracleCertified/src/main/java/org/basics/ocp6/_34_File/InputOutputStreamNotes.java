package org.basics.ocp6._34_File;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamNotes {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("fos.txt");
        String content = "content line1";
        fos.write(content.getBytes());
        fos.close();

    }

}

/**
 *
 * Writer / Reader              -> Character Oriented
 * InputSteam / OutputStream    -> Byte Oriented
 *
 */
