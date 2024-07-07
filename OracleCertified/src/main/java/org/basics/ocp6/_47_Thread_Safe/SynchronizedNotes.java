package org.basics.ocp6._47_Thread_Safe;

public class SynchronizedNotes {



}

/**
 *
 * "synchronized" javada bir keyword dur.
 * "synchronized" anahtar kelmesi methodlarda yada blocklarda kullanılabilir.
 * java da senkronizasyon mekanizması lock / kilit mekanizması ile çalışır.
 * java da her nesnenin bir kilidi / lock ı vardır.
 * monitor lock, intrinsic (esas / asil) lock olarak ifade edilir.
 * her nesne için sadece bir tek kilit / lock vardır.
 * synchronized bir methoda thread girdiği zaman nesnenin kilidini ele geçirir alır.
 * bir thread bir nesnenin kilidini ele geçirdikten sonra bırakana kadar
 * bir başka thread bu nesnenin kilidini alamaz.
 *
 * aynı nesne üzerinde çalışan "N" tane thread için:
 * her nesnenin bir tek kilidi vardır.
 * bir thread N tane kilidi ele geçirebilir.
 * bir thread, ilgili nesnenin kilidini bırakmadan bir başka thread bu nesnenin kilidini ele geçiremez.
 * yani thread in işi bitmeden bir başka thread synchronized methoda giremez.
 *
 *
 */
