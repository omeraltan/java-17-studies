package org.basics.ocp17.chapter13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task2 implements Runnable {
    private final int taskId;

    public Task2(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Görev " + taskId + " çalışıyor: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);  // Görev işlemi 2 saniye sürüyor
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Görev " + taskId + " tamamlandı: " + Thread.currentThread().getName());
    }
}

public class _20_Thread_Pools_Example {

    public static void main(String[] args) {
        // 3 thread'li bir sabit thread havuzu oluştur
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 10 görev oluştur ve thread havuzuna gönder
        for (int i = 1; i <= 10; i++) {
            Runnable task = new Task2(i);
            executorService.execute(task);
        }

        // Yeni görev kabul etme ve mevcut görevlerin bitmesini bekleme
        executorService.shutdown();
    }

}
