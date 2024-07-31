package org.basics.ocp8._13_Exception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest03 {

    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("file.txt");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            }catch (IOException e){

            }
        }

        /**
         *  trw - with resource
         *  close methodunu çağırmak genellikle unutulabilir.
         *  try-with resource yaklaşımı kullanıldığında arka planda otomatik olarak close işlemi yapılır.
         */
        try (FileWriter fw2 = new FileWriter("file2.txt")){
            fw2.write("test");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
