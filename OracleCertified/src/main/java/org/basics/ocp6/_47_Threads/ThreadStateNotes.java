package org.basics.ocp6._47_Threads;

class MyThreadNew extends Thread {

    @Override
    public void run() {
        System.out.println("My Job is running...");
    }

}

public class ThreadStateNotes {

    public static void main(String[] args) {
        MyThreadNew thread = new MyThreadNew(); // -> "NEW" state

    }

}

/**
 *
 * java.lang.Thread sınıfında bulunur
 * public enum State{} yer alır.
 *
 * 1 - NEW :
 * Thread objesini oluşturduğumuzda fakat henüz start methodunu çağırmadığımızda thread in durumu "NEW" dir.
 * Thread nesnesi mevcutta var olur ("NEW" ile).
 *
 * 2 - RUNNABLE :
 * İlk olarak start methodunu çağırdığımızda ilgili thread "RUNNABLE" durumuna geçer
 * block / sleeping / waiting gibi durumlardan tekrar "RUNNABLE" durumuna geçer.
 * RUNNABLE durumu, bir thread in, JVM(Java Virtual Machine) / Thread Scheduler, tarafından seçilmeye uygun hale geldiği durumdur.
 * Yani çalışması için seçilmeye uygun hale geldiği durumdur (eligible).
 *
 * 3 - RUNNING : (Böyle bir state yoktur. Enumlar arasında yer almaz.)
 * Bunun anlamı o anda çalışan thread demektir.
 * Çalışan bir thread blocked / waiting / sleeping gibi durumlara geçebilir.
 * yada t süresi kadar çalışır durur. Runnable duruma geçer.
 *
 * 4 - WAITING :
 * Bu durumda thread çalışmaya uygun halde değildir. Thread alive durumdadır.
 * WAITING durumundaki bir thread, thread scheduler tarafından  seçilmeye uygun halde değildir.
 * Sadece RUNNABLE durumundaki threadler, thread scheduler tarafından  seçilebilir.
 * wait(); ve join(); methodları thread leri bekleme durumuna sokarlar.
 * "WAITING" durumunda bir thread başka bir thread in işini yapmasını bekliyor demektir.
 *
 * 5 - TIMED_WAITING :
 * Bu durumda thread çalışmaya uygun değildir. Belirtilen bir zaman kadar beklenildiği senaryolardır.
 * join(); methodunun overloaded versiyonları vardır.
 *
 * 6 - BLOCKED :
 * Bir thread, başka bir thread i block ladığı zaman ortaya çıkan durumdur.
 * synchronized, javada bir keyword tür, methodlarda ve blocklarda kullanılabilir.
 * javada nesnelerin kilitleri (lock) vardır.
 *
 * Örneğin; 2 tane thread aynı nesne üzerinden method1() i çağırdığını düşünürsek eğer
 * Thread-1 geldi ve method1() e girdi, nesnenin kilidini alır.
 * method1() deki işlemleri bitene kadar başka bir thread bu methoda giriş yapamaz
 * Bu durumda bekleyen thread ler "BLOCKED" durumdadır.
 * 7 - TERMINATED :
 * Threadin çalışmasının sonlandığı yani run(); methodunun tamamlandığı durumdur.
 * Bir thread tamamlandığında tekrar RUNNABLE a geçemez.
 *
 *
 */
