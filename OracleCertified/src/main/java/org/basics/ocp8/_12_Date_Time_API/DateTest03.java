package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;

public class DateTest03 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        date.plusDays(10);
        System.out.println(date);
        date = date.plusMonths(2).plusWeeks(5).plusYears(3);
        System.out.println(date);

    }

}
