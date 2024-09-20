package org.basics.ocp17.chapter13;

public class _12_Concurrency_Example {

    public static void main(String[] args) {



    }

}

/**
 *
 *         ---------- Shutting Down a Thread Executor ----------
 * 1. Thread Executor kullandıktan sonra shutdown() methodunun çağrılması önemlidir.
 * 2. Bir thread executor, execute edilen ilk görevde non-daemon bir görev oluşturacaktır.
 * 3. Bu nedenle shotdown() methodunun çağrılmaması, uygulamamızın hiçbir zaman sonlandırılmamasına neden olacaktır.
 * 4. shutdown süreci executor a gönderilen tüm yeni görevlerin reddedilmesi ve daha önce gönderilen taskların yürütülmesi, tamamlanması şeklinde olmaktadır.
 *
 *
 *
 *      "new executor service" -->  Active -->  shutdown()  --> Shutting down --> All tasks Finished --> Shutdown
 *                                   |                              |                                       |
 *                              (Accepts new tasks)           (Rejects new tasks)                        Rejects new tasks
 *                              (Execute tasks)               (Executes tasks)                           No tasks running
 *                              isShutdown()    false         isShutdown()   true                        isShutdown()   true
 *                              isTerminated()  false         isTerminated() false                       isTerminated() true
 *
 * 5. shutdown methodu, thread executor a verilen taskları, görevleri durdurmayacaktır.Yeni görevleri ise reject edecektir.
 * 6. Eğer çalışan bütün görevleri kapatmak istiyorsak. ExecutroService deki shotdownNow() methodu kullanılabilir.
 * 7. Bu method çalışan bütün taskları durdurmaya çalışacaktır. Yeni gönderilen tasklarıda reject edecektir.
 * 8. Bu methodun bir garantisi yoktur. Sadece bu methodları kapatmayı deneyecektir.
 * 9.
 *
 */
