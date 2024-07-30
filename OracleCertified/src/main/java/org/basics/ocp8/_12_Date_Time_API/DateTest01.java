package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class DateTest01 {

    public static void main(String[] args) {

        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        System.out.println(date);
        System.out.println(localDate);

        LocalDate date1 = LocalDate.of(2019, Month.APRIL, 20);
        LocalDate date2 = LocalDate.of(2019, 2, 20);
        System.out.println(date1);
        System.out.println(date2);

    }

}
