package org.basics.ocp17.chapter13;

public class _10_Concurrency_Example {

    public static void main(String[] args) {



    }

}

/**
 *
 * Java, thread leri yönetme konusundaki karmaşıklığı gidermek için "java.util.concurrency" paketinde yer alan "Concurrency API" yi kullanmaktadır.
 * Concurrency API, thread leri oluşturan ve yöneten Concurrency Executor interface ine sahiptir.
 * Öncelikle Executor Service interface inin bir instance ını alırız. Sonrasında process edilecek taskları servise göndeririz.
 * Bunun için "execute()" methodunu kullanabiliriz. Concurreny API, thread pooling, scheduling gibi bir çok yararlı özelliğe sahiptir.
 * Sadece tekbir thread oluşturup yönetmemiz gerekse bile Concurrency API kullanılması önerilmektedir.
 * Gerçek uygulamalarında doğrudan thread nesneleryle çalışmak yerine Concurreny API kullanmak daha iyi bir sonuç verecektir.
 * Concurreny API ile karmaşık etkileşimleri yönetmek kolaydır.
 *
 */
