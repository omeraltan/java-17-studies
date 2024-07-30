package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;
import java.time.Period;

public class DateTest14 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        Period p1 = Period.ofMonths(2);
        date = date.plus(p1);
        System.out.println(date);

    }

}
