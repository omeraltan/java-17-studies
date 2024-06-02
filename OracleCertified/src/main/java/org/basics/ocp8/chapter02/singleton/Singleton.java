package org.basics.ocp8.chapter02.singleton;

public class Singleton {

    // Özel statik değişken, sınıfın tek örneğini tutar
    private static Singleton instance;

    // Özel yapıcı metod, dışarıdan örnek oluşturulmasını engeller
    private Singleton() {

    }

    // Singleton örneğini döndüren global erişim yöntemi
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

