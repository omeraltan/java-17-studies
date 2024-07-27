package org.basics.ocp8._10_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamNotes {

    public static void main(String[] args) {

        /* ---------------------- Source ----------------------- */

        IntStream.range(1,6); // Source

        IntStream.iterate(1,i->i+1).limit(5); // Source

        Stream.empty(); // Source

        Stream.of(1,2,3,4,5,6,7,8,9,10); // Source

        Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream(); // Source

        Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9,10}); // Source

        Stream.generate(Math::random).limit(5); // Source

        new Random().ints().limit(5); // Source

        /* --------------------- Intermediate ------------------- */


        //--------- Source ---------|------intermediate operations---------|-terminal operation-|
        Stream.of(1,2,3,4,5).peek(i -> System.out.println(i + " ")).count(); // peek methodu -> Consumer ile çalışır.
        // peek() methodu, intermediate operations lardandır. Lazy olarak çalışır. Yani terminal operation yoksa çalışmaz.
        // count() methodu, bir terminal operation'dır. Bir stream üzerinde terminal operation çalıştıktan sonra, bir başka terminal operation'ı çağıramayız.


    }

}

/**
 *
 * java.util.stream paketinde yer almaktadır.
 * java.util.stream.Stream bir interfacedir.
 * Stream interface'i BaseStream interface'ini extend eder. "public interface Stream<T> extends BaseStream<T, Stream<T>>"
 * Bir Stream Java'da datanın sequence'idir.
 * Bir Stream'deki işlem sırası şu şekildedir: "Source -> Intermediate Operations -> Terminal Operation"
 *  a. Source                 : Kaynak data / row data
 *  b. Intermediate Operation : transform data, intermediate operationlar geriye Stream dönerler.
 *  c. Terminal Operation     : Sonuç üretene methodlar terminal operation da bulunurlar.
 *
 * For Example :
 * Stream Source            : IntStream.range(), Arrays.stream
 * Intermediate Operations  : map(), filter(), distinct(), sorted()
 * Terminal Operation       : sum(), collect(), forEach(), reduce()
 *
 */
