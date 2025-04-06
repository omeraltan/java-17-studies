package org.basics.ocp17.chapter03;

import java.time.DayOfWeek;

/**
 *
 * Which statements, when inserted independently into the following blank, will cause the code to print 2 at runtime?
 * (Choose all that apply.)
 *
 * A. break BUNNY       -> 1
 * B. break RABBIT      -> 2
 * C. continue BUNNY    -> 2
 * D. continue RABBIT   -> 2
 * E. break             -> 2
 * F. continue          -> 5
 * G. None of the above, as the code contains a compiler error.
 *
 */
public class Examples1 {

    public static void main(String[] args) {
        int count = 0;
        BUNNY: for (int row = 1; row <= 3; row++) {
            RABBIT: for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    continue BUNNY;
                    count++;
            }
        }
        System.out.println(count);

        getWeekDay(3, 4);
    }

    private static DayOfWeek getWeekDay(int day, final int thursday){
        int otherDay = day;
        int Sunday = 0;

        switch (otherDay){
            default :
            // case 1: continue; // continue cannot be used inside a switch statement like this
            // case thursday: return DayOfWeek.SUNDAY; // Constant expression require
            case 2, 10: break;
            // case Sunday: return DayOfWeek.SUNDAY; // Constant expression require
            // case DayOfWeek.MONDAY: return DayOfWeek.MONDAY; // is not a int value
        }
        return DayOfWeek.FRIDAY;
    }

}


