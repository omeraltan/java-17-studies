package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalTime;

public class DateTest05 {

    public static void main(String[] args) {

        LocalTime parsed1 = LocalTime.parse("21:27");
        LocalTime parsed2 = LocalTime.parse("21:27:09");
        System.out.println(parsed1);
        System.out.println(parsed2);

    }

}
