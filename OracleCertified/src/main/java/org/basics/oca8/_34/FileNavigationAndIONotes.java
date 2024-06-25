package org.basics.oca8._34;

import java.io.File;
import java.io.IOException;

public class FileNavigationAndIONotes {

    public static void main(String[] args) {

        File file = new File("test.txt");
        // File nesnesi olşur. Hardiskte yeni bir dosya oluşmaz.
        try {
            System.out.println(file.exists());
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

/**
 *
 * Bu sınıflar java.io paketinde yer alırlar
 * File : File sınıfı hem folder(dizin -> dizin/directory/folder) hemde directory(file) gösterebilir.
 * Bu sınıf dosyadan veri okumak yazmak için kullanılmaz.
 * Bu sınıf yeni bir boş dosya oluşturmak, klasör oluşturmak, dosya silmek, isim değiştirme işlemleri için kullanabiliriz.
 *
 */
