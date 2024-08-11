package org.basics.ocp17.chapter13;

public class _07_Thread_Example {

    private static int counter = 0;

    public static void main(String[] args) {

        final var mainThread = Thread.currentThread();
        new Thread(() -> {
           for(int i = 0; i < 1_000_000; i++){
               counter++;
           }
           mainThread.interrupt();
        }).start();
        while(counter < 1_000_000){
            System.out.println("Not reached yet");
            try{
                Thread.sleep(1_000);
            }catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        System.out.println("Reached : " + counter);
    }

}

/**
 *
 * Bu program, bir thread'in başka bir thread'i nasıl kesebileceğini ve interrupt() metodunun nasıl çalıştığını gösterir.
 * İşte bu kodun nasıl çalıştığının adım adım açıklaması:
 *
 * 1. counter Değişkeni                 : counter adında bir statik değişken tanımlanmış ve bu, tüm thread'ler tarafından paylaşılan bir sayacın değerini tutar.
 * 2. mainThread Referansı              : Thread.currentThread() metodu, şu anda çalışmakta olan thread'i (yani main thread'i) döndürür ve bu referans mainThread değişkenine atanır.
 * 3. Yeni Bir Thread Başlatma          : new Thread(() -> {...}).start(); ile yeni bir thread oluşturuluyor ve başlatılıyor.
 *    Bu yeni thread, bir for döngüsü içinde counter değişkenini 1.000.000 kez artırır.
 *    Döngü tamamlandıktan sonra, mainThread.interrupt(); metodu çağrılır, bu da main thread'e bir kesilme isteği gönderir.
 * 4. while Döngüsü                     : main thread, while(counter < 1_000_000) koşulunu kontrol eder.
 *    Bu koşul, counter 1.000.000'a ulaşana kadar true döner.
 *    Bu süreçte, her döngüde "Not reached yet" mesajı yazdırılır ve main thread 1 saniye (Thread.sleep(1000);) uyutulur.
 * 5. InterruptedException Yakalama     : Eğer mainThread.interrupt() çağrısı yapıldıysa ve main thread Thread.sleep(1000); ile uyutulmuşsa, InterruptedException fırlatılır.
 *    Bu durumda, catch bloğu çalışır ve "Interrupted" mesajı yazdırılır.
 * 6. counter 1.000.000'a ulaştığında   : counter değeri 1.000.000'a ulaştığında, while döngüsü sona erer ve "Reached : " + counter mesajı yazdırılır.
 * Özet:
 *  Başlangıçta yeni bir thread, counter değerini 1.000.000'a kadar artırmaya başlar.
 *  main thread, bu süre zarfında belirli aralıklarla counter'ı kontrol eder ve bu sırada uyutulur.
 *  Yeni thread işini tamamladığında, main thread'i keser (interrupt), bu da main thread'in uyanmasına ve InterruptedException fırlatılmasına neden olur.
 *  Sonuç olarak, main thread, counter 1.000.000 olduğunda döngüden çıkar ve sonucu yazdırır.
 *  Bu kod, interrupt() ve InterruptedException kavramlarını pratik bir örnek üzerinden gösterir.
 *
 */
