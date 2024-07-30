package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalTime;

public class DateTest04 {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime2 = LocalTime.of(20,50);
        LocalTime localTime3 = LocalTime.of(20, 40,50);
        LocalTime localTime4 = LocalTime.of(22, 30, 50,500);

        System.out.println(localTime2);
        System.out.println(localTime3);
        System.out.println(localTime4);

    }

}
