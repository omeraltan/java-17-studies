package org.basics.ocp8._12_Date_Time_API;

import java.time.Duration;
import java.time.LocalTime;

public class DateTest16 {

    public static void main(String[] args) {

        LocalTime start = LocalTime.of(5, 20);
        LocalTime end = LocalTime.of(14, 28);

        Duration d1 = Duration.between(start, end);
        System.out.println(d1);

    }

}
