package org.basics.ocp6._34_File;

import java.io.*;

public class BufferedWriterReaderNotes {

    public static void main(String[] args) throws IOException {

        File file = new File("buffered.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("This is a test");
        bw.newLine();
        bw.write("This is another test");

        bw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String lineContent = null;

        int line = 1;
        while ((lineContent = br.readLine()) != null) {
            System.out.println(line + " " + lineContent);
            line++;
        }
    }

}

/**
 *
 *
 *
 */
