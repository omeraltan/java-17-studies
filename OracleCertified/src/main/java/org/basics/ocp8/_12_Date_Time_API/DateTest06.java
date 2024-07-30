package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalTime;

public class DateTest06 {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        localTime = localTime.plusHours(3).plusMinutes(40);
        System.out.println(localTime);

    }

}
