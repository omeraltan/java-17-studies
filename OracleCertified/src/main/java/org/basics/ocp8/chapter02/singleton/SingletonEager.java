package org.basics.ocp8.chapter02.singleton;

public class SingletonEager {

    // Özel statik değişken, sınıfın tek örneğini tutar
    private static final SingletonEager instance = new SingletonEager();

    // Özel yapıcı metod, dışarıdan örnek oluşturulmasını engeller
    private SingletonEager() {

    }

    // Singleton örneğini döndüren global erişim yöntemi
    public static SingletonEager getInstance() {
        return instance;
    }
}
