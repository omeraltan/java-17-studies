package org.basics.ocp17.chapter10;

public class _28_Summary { }

/**
 *
 * ----- Write code that uses Optional -----
 * Optional kullanımı   : Optional.empty() veya Optional.of().
 * Değer alma           : isPresent() ve get().
 * Alternatif           : ifPresent() ve orElseGet().
 *
 * ----- Recognize which operations cause a stream pipeline to execute -----
 * Ara işlemler (intermediate) terminal işlem çağrılana kadar çalışmaz.
 * Terminal işlem yoksa Stream döner ama çalışmaz.
 * Terminal işlemler: collect(), forEach(), min(), reduce().
 *
 * ----- Determine which terminal operations are reductions -----
 * Reduction’lar sonuç için stream’in tüm elemanlarını kullanır.
 * Bilmeniz gerekenler: collect(), count(), max(), min(), reduce().
 * Mutable reduction aynı nesneye toplar. collect() bir mutable reduction’dır.
 *
 * ----- Write code for common intermediate operations -----
 * filter() → Stream<T> döner, Predicate<T> ile filtreler.
 * map() → Stream döner, Function<T,R> ile her T elemanını R’ye dönüştürür.
 * flatMap() → iç içe stream’leri tek seviyeye indirir ve boş stream’leri çıkarır.
 *
 * ----- Compare primitive streams to Stream<T> -----
 * Primitive stream’ler sayısal işlemler ve istatistikler (average(), sum() vb.) için kullanışlıdır.
 * Üç tip: DoubleStream, IntStream, LongStream.
 * Üç primitive Optional: OptionalDouble, OptionalInt, OptionalLong.
 * BooleanSupplier hariç, hepsi double, int, ya da long kullanır.
 *
 * ----- Convert primitive stream types to other primitive stream types -----
 * Normalde map() kullanılır.
 * Stream sınıfı değiştirilirken başka metotlar gerekir: Stream → mapToObj(), DoubleStream → mapToDouble(), IntStream → mapToInt(), LongStream → mapToLong().
 *
 * ----- Use peek() to inspect the stream -----
 * peek() bir ara işlemdir; sıklıkla debug için kullanılır.
 * Input üzerinde lambda/method reference çalıştırır ve aynı input’u pipeline’da bir sonraki operatöre iletir.
 * Stream’de belirli bir noktadan geçen değerleri yazdırmak için kullanışlıdır.
 *
 * ----- Search a stream -----
 * findFirst() ve findAny() → Optional içinde tek bir eleman döner.
 * anyMatch(), allMatch(), noneMatch() → boolean döner.
 * Dikkat: Bu üçü bazı verilerle sonsuz stream üzerinde çağrılırsa takılabilir. Hepsi terminal işlemdir.
 *
 * ----- Sort a stream -----
 * sorted() bir ara işlemdir. İki versiyonu vardır:
 * Parametresiz → doğal sıralama
 * Tek parametreli → verilen Comparator ile sıralama
 *
 * ----- Compare groupingBy() and partitioningBy() -----
 * groupingBy() → bir Map oluşturan terminal işlem. Anahtarlar ve dönüş tipleri geçirilen parametrelere bağlıdır. Map’teki değerler, o anahtara eşlenen tüm girişler için bir Collection’dır.
 * partitioningBy() → bir Map döner. Anahtarlar true ve false’dur. Değerler yine bir Collection’dır. O boolean için eşleşme yoksa Collection boştur.
 *
 */
