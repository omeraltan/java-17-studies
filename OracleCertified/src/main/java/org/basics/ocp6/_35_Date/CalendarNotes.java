package org.basics.ocp6._35_Date;

import java.util.Calendar;

public class CalendarNotes {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        System.out.println(cal.getTimeInMillis());
        System.out.println(cal.getTime());
        System.out.println(cal.get(1)); // magic number! bu tarz programlama yapma
        System.out.println(cal.get(Calendar.YEAR)); // public static final int YEAR = 1 // Doğru yaklaşım
        System.out.println(cal.get(Calendar.MONTH)); //

        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
    }

}

/**
 *
 * java.util.Calendar abstract sınıftır.
 *
 */
