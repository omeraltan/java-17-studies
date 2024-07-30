package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTest07 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(ldt);

    }

}
