package org.basics.oca8._35;

import java.util.Date;

public class DaneNotes {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        // January 1, 1970, 00:00:00 GMT
        // tarihinden bugüne geçen milisecond
        long time = date.getTime();
        System.out.println(time);

    }

}

/**
 *
 * java.util.Date
 * java.util.Calendar
 * Artık yeni LocalDate, Java Time/Date API kullanılması önerilmektedir.
 */
