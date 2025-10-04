package org.basics.ocp17.chapter10;

public class _03_Using_Streams {

    public static void main(String[] args) {



    }

}

/**
 *
 * -------------------- Using Streams --------------------
 * Stream: Second of Date olarak ifade edilir. Yani birbiri ardına gelen bir veri kümesidir.
 * Stream pipeline, bir sonuç üretmek için Stream üzerinde yürütülen çeşşitli işlemlerden oluşur.
 * -------------------- Understanding The Pipeline Flow --------------------
 * Java Stream API: Hayvanat Bahçesi Montaj Hattı Benzetmesi
 * Java'da Stream API'yi anlamak için en etkili yöntemlerden biri, onu gerçek hayattaki bir montaj hattıyla karşılaştırmaktır.
 * Hayvanat bahçesi tabela yapım hattı, bu kavramı mükemmel bir şekilde açıklar.
 * Düşünün ki bir hayvanat bahçesinde farklı hayvan sergileri için tabelalar hazırlanıyor.
 * Bu süreçte dört işçi çalışıyor: ilk işçi kutudan boş tabelaları çıkarıyor, ikinci işçi onları boyuyor, üçüncü işçi hayvanın adını yazıyor ve son işçi tamamlanmış tabelayı doğru sergiye götürülmek üzere yığına koyuyor.
 * Bu süreçte her işçi bir önceki işçinin işini bitirmesini beklemek zorunda - boyacı, tabela çıkarılmadan hiçbir şey yapamaz.
 *
 * Stream API'deki veri akışı da tam olarak böyle çalışır. Veri kaynağından başlayarak, ara işlemlerden geçerek terminal işlemle sona erer.
 * Tıpkı montaj hattındaki tabelalar gibi, veri de tek yönlü akar ve bir kez işlendikten sonra geri dönmez.
 * En önemli özellik ise "lazy evaluation" (tembel değerlendirme) kavramıdır. Montaj hattındaki işçiler, ustabaşının "başla" emri gelene kadar çalışmazlar.
 * Stream API'de de ara işlemler, terminal işlem çağrılana kadar çalışmaz, sadece tanımlanır. Bu sayede gereksiz hesaplamalardan kaçınılır ve performans artırılır.
 * Örneğin, 10 hayvan arasından sadece kedigiller için tabela yapmak istiyorsanız, Stream API sadece kedigilleri işler, diğerlerine dokunmaz.
 * Bu, programlamada veri işleme süreçlerini optimize etmenin en etkili yollarından biridir.
 *
 * -------------------- Intermediate vs. Termianl Operations --------------------
 * Scenario                                 Intermediate operation Terminal operation
 * -------------------------------------------------------------------------------
 * Required part of useful pipeline?        No                      Yes                 -> Stream pipeline'ın geçerli olmasını sağlayan şey nedir? Terminal operationdır çünü terminal olmadan çalışmazlar. Pipeline için terminal operation zorunludur.
 * Can exist multiple times in pipeline?    Yes                     No                  -> Birden fazla oepration yeralabilir. Terminal operation bir tanedir.
 * Return type is stream type?              Yes                     No                  -> Intermadiate operation lar stream olarak döner. Terminal operation geriye stream dönmez (Collection, Boolean. Primitive vb. dönebilir.).
 * Executed upon method call?               No                      Yes                 -> Terminal operation olmadan 10 tane dahi zincirleme method çağırsak (intermediate operation da) çalışmayacaktır.
 * Stream valid after call?                 Yes                     No                  -> Bu methodlar çağırıldıktan sonra Stream ler geçerli olur mu: Intermadiate operation lar için evet ama terminal operation lar için hayır.
 *
 * JAVA STREAM API ÇALIŞMA MANTIGI
 * ==================================================
 *
 * 1. VERİ KAYNAĞI (Data Source)
 *    ┌─────────────────────────────────────┐
 *    │ List<String> names =                │
 *    │   ["Ali", "Ayşe", "Mehmet", "Fatma"]│
 *    └─────────────────────────────────────┘
 *                     │
 *                     ▼
 *    ┌─────────────────────────────────────┐
 *    │         .stream()                   │
 *    │     (Stream oluşturma)              │
 *    └─────────────────────────────────────┘
 *                     │
 *                     ▼
 *
 * 2. ARA İŞLEMLER (Intermediate Operations)
 *    ┌─────────────────────────────────────┐
 *    │         .filter()                   │
 *    │     (Filtreleme - Stream döndürür)  │
 *    └─────────────────────────────────────┘
 *                     │
 *                     ▼
 *    ┌─────────────────────────────────────┐
 *    │          .map()                     │
 *    │    (Dönüştürme - Stream döndürür)   │
 *    └─────────────────────────────────────┘
 *                     │
 *                     ▼
 *    ┌─────────────────────────────────────┐
 *    │         .distinct()                 │
 *    │   (Tekrar edenleri çıkar - Stream)  │
 *    └─────────────────────────────────────┘
 *                     │
 *                     ▼
 *
 * 3. SON İŞLEM (Terminal Operation)
 *    ┌─────────────────────────────────────┐
 *    │        .collect()                   │
 *    │   (Toplama - Gerçek sonuç üretir)   │
 *    └─────────────────────────────────────┘
 *                     │
 *                     ▼
 *    ┌─────────────────────────────────────┐
 *    │      List<String> result            │
 *    │   (İşlenmiş veri - Kullanılabilir)  │
 *    └─────────────────────────────────────┘
 *
 * ÖRNEK KOD VE AKIŞ:
 * ==================
 *
 * List<String> names = Arrays.asList("Ali", "Ayşe", "Mehmet", "Fatma");
 *
 * // ADIM ADIM AKIŞ:
 * // 1. Stream oluştur:    ["Ali", "Ayşe", "Mehmet", "Fatma"]
 * // 2. Filter (A>3):      ["Mehmet", "Fatma"]
 * // 3. Map (toUpperCase): ["MEHMET", "FATMA"]
 * // 4. Collect:           ["MEHMET", "FATMA"]
 *
 * List<String> result = names.stream()           // 1. Stream oluştur
 *     .filter(name -> name.length() > 3)         // 2. Ara işlem
 *     .map(String::toUpperCase)                  // 3. Ara işlem
 *     .collect(Collectors.toList());             // 4. Son işlem
 *
 * STREAM'İN 3 ANA BÖLÜMÜ:
 * =======================
 *
 * ┌─────────────────────────────────────────────────────────────────┐
 * │                     STREAM PIPELINE                             │
 * ├─────────────────────────────────────────────────────────────────┤
 * │ 1. STREAM OLUŞTURMA    │ 2. ARA İŞLEMLER      │ 3. SON İŞLEM    │
 * │                        │                      │                 │
 * │ .stream()              │ .filter()            │ .collect()      │
 * │ .parallelStream()      │ .map()               │ .forEach()      │
 * │                        │ .distinct()          │ .reduce()       │
 * │                        │ .sorted()            │ .count()        │
 * │                        │ .limit()             │ .anyMatch()     │
 * │                        │ .skip()              │ .findFirst()    │
 * │                        │ .peek()              │ .toArray()      │
 * └─────────────────────────────────────────────────────────────────┘
 *
 * LAZY EVALUATION (TEMBEL DEĞERLENDİRME):
 * ========================================
 *
 * ┌─────────────────────────────────────────────────────────────────┐
 * │  Ara işlemler HEMEN çalışmaz, sadece "plan" oluşturur           │
 * │                                                                 │
 * │  Stream<Integer> stream = numbers.stream()                      │
 * │      .filter(x -> x > 2)  ← Henüz çalışmaz                      │
 * │      .map(x -> x * 2);    ← Henüz çalışmaz                      │
 * │                                                                 │
 * │  Son işlem çağrıldığında TÜM pipeline çalışır:                  │
 * │                                                                 │
 * │  List<Integer> result = stream.collect(Collectors.toList());    │
 * │                           ↑ Bu noktada hepsi çalışır            │
 * └─────────────────────────────────────────────────────────────────┘
 *
 * STREAM'İN ÖZELLİKLERİ:
 * ======================
 *
 * LAZY (Tembel)            : Ara işlemler son işlem çağrılana kadar çalışmaz
 * FUNCTIONAL (Fonksiyonel) : Veri değiştirilmez, yeni veri üretilir
 * PIPELINE (Boru Hattı)    : İşlemler zincirleme yapılır
 * IMMUTABLE (Değişmez)     : Orijinal veri korunur
 * SINGLE-USE (Tek Kullanım): Stream bir kez tüketilir
 *
 */
