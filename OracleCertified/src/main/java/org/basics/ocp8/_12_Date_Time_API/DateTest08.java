package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;

public class DateTest08 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int dayOfWeek = date.getDayOfWeek().getValue();
        System.out.println(dayOfWeek);
        int dayOfMonth = date.getDayOfMonth();
        System.out.println(dayOfMonth);
        int dayOfYear = date.getDayOfYear();
        System.out.println(dayOfYear);

    }

}
