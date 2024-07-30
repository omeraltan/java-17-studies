package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest20 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));
        System.out.println(formatter.format(date));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(timeFormatter.format(time));

    }

}
