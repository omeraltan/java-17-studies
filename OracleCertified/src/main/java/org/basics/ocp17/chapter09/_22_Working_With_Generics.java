package org.basics.ocp17.chapter09;

import java.util.ArrayList;
import java.util.List;

public class _22_Working_With_Generics {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();
        strings.add("twwet");

        List<Object> objects = new ArrayList<Object>();
        objects.add("deneme");

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(10);

        List<CharSequence> charSequences = new ArrayList<>();
        charSequences.add("char");

        addSound(strings);
        addSound(objects);
        // addSound(integers);      DOES NOT COMPILE (Integer sınıfı String sınıfının super'i olmadığı için compile-time hatası alınır.)
        addSound(charSequences);    // CharSequence, String sınıfının super'i olduğu için bu gönderim sorun olmaz.

        System.out.println("-------------------------");

        // List<? super IOException> exception1 = new ArrayList<FileNotFoundException>();   DOES NOT COMPILE (Sağ tarafında üst tipini veya kendisini bekliyor.)
        // List<? extends IOException> exception2 = new ArrayList<Exception>();             DOES NOT COMPILE (Sağ tarafında alt tipini veya kendisini bekliyor.)

    }

    // Buradaki "? super String" ifadesinin anlamı, gelecek parametre için; String ve String sınıfının super'i olabilir demektedir.
    private static void addSound(List<? super String> list){
        list.add("quack");
    }

}

/**
 *
 * --------------- Creating Lower-Bounded Wildcards --------------------------------------------------------------------------------------------
 * Upper-Bounded yapıda bir listeye sadece null değer eklenebiliyor ve bununda aslında bir işlevi bulunmamaktadır.
 * ---------------------------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------- Why We Need A Lower Bound --------------------------------------------------------------------------
 * static void addSound(........ list)      Method compiles                             Can pass a                                  Can pass a
 * {list.add("quack");}                                                                 List<String>                                List<Object>
 * ---------------------------------------------------------------------------------------------------------------------------------------------
 * List<?>                                  No (unbounded generics are immutable)       Yes                                         Yes
 * List<? extends Object>                   No (upper-bounded generics are immutable)   Yes                                         Yes
 * List<Object>                             Yes                                         No (with generics, must pass exact match)   Yes
 * List<? super String>                     Yes                                         Yes                                         Yes
 * ---------------------------------------------------------------------------------------------------------------------------------------------
 * List<?> kullanıldığında (static void addSound(List<?> list) methodunda bu şekilde), bu durumda ekleme işlemi yapılamaz ancak String ve Object parametre olarak geçirilebilir (Birinci satır için konuşuyorum).
 * List<? extends Object> kullanıldığında (static void addSound(List<? extends Object> list) methodunda bu şekilde), bu durumda da ekleme işlemi yapılamaz ancak String ve Object parametre olarak geçirilebilir .
 * List<Object> kullanıldığında (static void addSound(List<Object> list) methodunda bu şekilde), bu durumda eleman eklenebilir ancak String gönderilemez, Object gönderilebilir.
 * List<? super String> kullanıldığında (static void addSound(List<? super String> list) methodunda bu şekilde), bu durumda eleman eklenebilir, List<String> veya List<Object> eleman olarak geçirilebilir.
 * Yukarıdaki super'li yapıya lower-bounded kullanımı denilir.
 *
 * -------------------- Understanding Generic supertypes ---------------------
 * List<? super IOException> exceptions = new ArrayList<Exception>();
 * Ykarıdaki ifadenin sağ tarafı ya super sınıfı yada kendisi olabilir. Örneğin:
 * List<? super IOException> exceptions = new ArrayList<IOException>();
 * List<? super Exception> exceptions = new ArrayList<Exception>();
 * Yukarıdaki ifadeler sorun çıkarmaz
 *
 * List<? super IOException> exceptions = new ArrayList<Exception>(); ifadesine exceptions.add(new Exception()); ifadesini ekleyemeyiz.
 * kendisini ekleyelibilir veya sub class'ını ekleyebilir. Aşağıdaki gibi:
 * exceptions.add(new IOException());
 * exceptions.add(new FileNotFoundException());
 *
 */
