package org.basics.ocp6._47_Thread_Safe;

public class SyncTest {

    public void doStuff(){
        // Bu kısma aynı nesne (SyncTest) üzerinden N tane thread girebilir.
        System.out.println("not synchronized");

        synchronized (this){
            // // Bu ksıma aynı nesne (SyncTest) üzerinden sadece 1 tane thread girebilir.
            System.out.println("synchronized");
        }
    }

    public synchronized void doStuff2(){
        System.out.println("synchronized");
    }

    // static methodlar da synchronized olabilir.
    // her class a karşılık java.lang.Class tipinde bir instance yer almaktadır.
    // static methodlar için ilgili class a karşılık gelen instance ın lock'i kilidi kullanılır.
    public static synchronized int getCount(){
        // buraya aynı anda sadece bir tane thread girebilir.
        // farklı nesneler üzerinde threadler çalışsada
        // çünkü burada 1 tane lock vardır.
        return 0;
    }

}
