package org.basics.ocp8._15_Nio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Test10 {

    public static void main(String[] args) throws IOException {

        /* ------------ BufferedWriter And BufferedReader --------------*/
        // "BufferedWriter" ile ilgili sayfaya yazma işlemi, "BufferedReader" ile ilgili sayfayı okuma işlemi yapılmaktadır.

        Path p1 = Paths.get("buffered.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(p1)){
            bw.write("line1\nline2\nline3");
        }
        try(BufferedReader br = Files.newBufferedReader(p1)){
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }

    }

}
