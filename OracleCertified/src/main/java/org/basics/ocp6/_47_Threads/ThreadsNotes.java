package org.basics.ocp6._47_Threads;

public class ThreadsNotes {



}

/**
 *
 * java.lang.Thread
 * 1 - Thread dediğimizde aklımıza gelecek olan şey java.lang.Thread gelmelidir.
 * 2 - Thread dediğimizde aklımıza çalışan iş parçacığı / lightweight process gelmelidir.
 * 1.noktadam baktığımızda (class, obje açısından) thread nesneleri diğer java nesnelerinde olduğu gibi heapte yaşayacaktır.
 * 2.noktadan baktığımızda kendi stack alanına sahiptir (lightweight process).
 * process : OS in temel görevleri; kaynak paylaşımı yapmaktır. / kaynakları yönetmektir (RAM / memory, cpu...).
 * process kavramı OS(operating system / işletim sistemi) açısından  çalışan programlar / uygulamalar anlamına gelir.
 * Bir process bir yada daha fazla thread'e sahiptir.
 * --------------------------------------------------
 * Javada her thread çalıştığında kendi stack alanı oluşur.
 * Javada basit bir "hello world" örneğinde bile main thread i çalışacaktır (Örnek: ThreadExample).
 * --------------------------------------------------
 * Javada treadlerin yönetiminden jvm (Java Virtual Machine) sorumludur.
 * JVM mini bir OS gibi çalışır. GC mekanizması, thread mekanizması vs. bunları yönetir.
 * --------------------------------------------------
 * Yeni bir Thread oluşturmak için iki yaklaşım vardır.
 * 1 - java.lang.Thread sınıfını kalıtmaktır (extends).
 * 2 - java.lang.Runnable interface ini uygulamaktır (implemenets).
 * Bir class N tane interface i implement edebilir. Herhangi bir kısıtlamaya neden olmaz.
 * Interface ler class hiyerarşisinde yer almazlar. Bağımsız olarak herhangi bir class tarafından kullanılabilirler.
 * İlgili class ları kısıtlamamak için genellikle Runnable interface ini kullanmayı tercih ederiz.
 *
 */
