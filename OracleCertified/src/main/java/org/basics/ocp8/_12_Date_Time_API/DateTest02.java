package org.basics.ocp8._12_Date_Time_API;

import java.time.LocalDate;

public class DateTest02 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.ofYearDay(2018, 50); // -> 2018n yılının ellinci günü manasına gelmektedir.
        System.out.println(localDate); // output : 2018-02-19

        LocalDate epoch = LocalDate.ofEpochDay(1000); // epoch zamanı : 1970 1 January 00.00.00.000 -> Bu tarih epoch tarihi olarak geçmektedir.
        System.out.println(epoch); // Bunun sonucu epoch tarihine 100 güne ekleyecek ve sonucu yıl, ay ve gün olarak verecektir. // output : 1972-09-27

    }

}
