package org.basics.ocp8._12_Date_Time_API;

import java.time.Instant;
import java.time.LocalDateTime;

public class DateTest11 {

    public static void main(String[] args) {

        // Instant yapısı GMT'yi her zaman sıfırdan başlatır.
        Instant instant = Instant.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(instant);
        System.out.println(ldt);
        System.out.println(Instant.EPOCH);

    }

}
