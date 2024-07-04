package org.basics.ocp6._34_File;

import java.io.*;

public class InputOutputStreamExample {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("bufferedOutput.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("convert byte array".getBytes());
        bos.close();

        FileInputStream fis = new FileInputStream("bufferedOutput.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        while (bis.available() > 0) {
            bos.write(bis.read());
        }

    }

}

/**
 *
 *
 *
 */
