package org.basics.ocp17.chapter10;

import java.util.ArrayList;

public class _18_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        /**
         * Bu kod, Java Stream API'nin tembel değerlendirme (lazy evaluation) özelliğini gösterir.
         * Açıklama:
         * cats.stream() bir stream oluşturur, henüz tarama yapılmaz.
         * Stream tembel (lazy) olduğu için kaynak listeyi o anda taramaz.
         * cats.add("KC") sonrası kaynakta 3 eleman vardır.
         * stream.count() stream'i taramaya başlar (eager) ve count döner.
         * Stream, sayma anında kaynağı okur; bu nedenle 3 döner.
         * Önemli Nokta:
         * Stream kaynağına referans tutar; sayma anında geçerli durumu okur.
         * Yalnızca terminal işleminde (örn: count(), collect(), forEach()) tarama gerçekleşir.
         * Sonuç: 3 yazdırılır.
         * Not: Stream oluşturulduktan sonra kaynak listeye eklenen "KC" de sayıma dahildir; akış, terminal işlemi sırasında güncel veriyi kullanır.
         */

        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());

        System.out.println("--------------------");



    }

}

/**
 *
 * -------------------- Linking Streams To The Underlying Data --------------------
 *
 *
 */
