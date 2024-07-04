package org.basics.ocp6._34_File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderNotes {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("file1.txt");
        fw.write("This is a test");
        fw.write("\n");
        fw.write("This is another test1");
        fw.write("\n");
        fw.write("This is another test2");
        fw.write("\n");
        fw.write("This is another test3");
        fw.close();

        FileReader fr = new FileReader("file1.txt");
        char[] buf = new char[100];
        fr.read(buf, 0, 100);
        for(char c : buf){
            System.out.print(c);
        }

    }

}

/**
 *
 * Reader / Writer / Stream
 *
 *
 */
