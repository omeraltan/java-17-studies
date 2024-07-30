package org.basics.ocp8._12_Date_Time_API;

import java.time.Period;

public class DateTest13 {

    public static void main(String[] args) {

        Period p1 = Period.ofYears(2);
        Period p2 = Period.ofMonths(3);
        Period p3 = Period.ofMonths(12);
        Period p4 = Period.ofDays(25);
        Period p5 = Period.ofWeeks(4);

        // This chain is not true.
        Period p6 = Period.ofDays(6).ofYears(1).ofMonths(2).ofWeeks(1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);


    }

}
