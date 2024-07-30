package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;
import java.time.Period;

public class DateTest12 {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(1984, 8, 24);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println(period);

        /**
         *
         * output : P39Y11M6D
         * P -> Period
         * Y -> Year
         * M -> Month
         * D -> Day
         *
         */

    }

}
