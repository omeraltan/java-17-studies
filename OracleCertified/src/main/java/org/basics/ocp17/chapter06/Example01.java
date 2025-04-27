package org.basics.ocp17.chapter06;

public class Example01 {
}

class MutableCounter{
    private int count = 0;
    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

class MutableCounterTest{
    public static void main(String[] args) throws InterruptedException{
        MutableCounter counter = new MutableCounter();

        Runnable task = () ->{
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count (Mutable): " + counter.getCount());
    }
}

final class ImmutableCounter {
    private final int count;

    public ImmutableCounter(int count) {
        this.count = count;
    }

    public ImmutableCounter increment() {
        return new ImmutableCounter(count + 1);
    }

    public int getCount() {
        return count;
    }
}

class ImmutableCounterTest {

    public static void main(String[] args) throws InterruptedException {
        ImmutableCounter[] counter = { new ImmutableCounter(0) }; // Array içinde tutuyoruz (değişken referansını değiştirmek için)

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (counter) {  // Çünkü nesne değişiyor (yeni nesne dönüyor), referansı korumak lazım
                    counter[0] = counter[0].increment();
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count (Immutable): " + counter[0].getCount());
    }

}


