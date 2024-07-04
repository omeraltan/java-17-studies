package org.basics.ocp6._34_File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterNotes {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("printWriter.txt");
        pw.println("Hello World");
        pw.println("Hello World2");
        pw.println("Hello World3");
        pw.close();
    }

}

/**
 *
 *
 *
 */
