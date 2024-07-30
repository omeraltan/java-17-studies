package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTest19 {

    public static void main(String[] args) {

        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(customFormat.format(LocalDate.of(2016, Month.JANUARY, 01)));

    }

}
