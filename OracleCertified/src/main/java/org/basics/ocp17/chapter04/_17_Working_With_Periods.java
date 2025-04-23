package org.basics.ocp17.chapter04;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class _17_Working_With_Periods {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 4, 20);

        Period period = Period.between(startDate, endDate);

        System.out.println("Year : " + period.getYears());
        System.out.println("Month : " + period.getMonths());
        System.out.println("Day: " + period.getDays());

        System.out.println("---------------");

        var annually = Period.ofYears(1);
        var quarterly = Period.ofMonths(3);
        var everyThreeWeeks = Period.ofWeeks(3);
        var everyOtherDay = Period.ofDays(2);
        var everyYearAndAWeek = Period.of(1,0,7);

        System.out.println(annually);
        System.out.println(quarterly);
        System.out.println(everyThreeWeeks);
        System.out.println(everyOtherDay);
        System.out.println(everyYearAndAWeek);

        System.out.println("---------------");

        var wrong = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong);

        System.out.println("---------------");

        Period newPeriod = Period.of(0,1,5);
        System.out.println(newPeriod);
        System.out.println("Days : " + newPeriod.getDays());
        System.out.println("Months : " + newPeriod.getMonths());
        System.out.println("Years : " + newPeriod.getYears());
        System.out.println("ChronoUnit.DAYS : " + newPeriod.get(ChronoUnit.DAYS));
        System.out.println("Units : " + newPeriod.getUnits());

        System.out.println("---------------");

        Period period2 = Period.ofDays(-5);
        System.out.println(period2);
        System.out.println(period2.negated());
        System.out.println("IsNegative : " + period2.isNegative());
        LocalDate localDate = LocalDate.of(2023,1,1);
        System.out.println(localDate.plus(period2));
        System.out.println(localDate.minus(period2));

        System.out.println("---------------");

        Period positivePeriod = Period.of(1,2,3);
        Period negatedPeriod = positivePeriod.negated();

        System.out.println("Pozitif Period: " + positivePeriod);
        System.out.println("Negatif Period: " + negatedPeriod);


    }
}

/**
 *
 * Period sınıfı yardımı ile yıl, ay, gün şeklinde bir zaman periyodunu oluşturup bunu LocaDate, LocalTime vb. sınıflarımızda kullanabiliriz.
 * Java'da Period sınıfı, iki tarih arasındaki farkı yıl, ay ve gün cinsinden temsil eder. java.time paketinde bulunur ve genellikle LocalDate ile birlikte kullanılır.
 * Chaning işlemlerinde (period larda) en sondaki geçerlidir.
 * Period işlemleri LocaTime ile kullanılamaz çünkü gün, ay ve yıl bilgisi ile çalışır.
 *
 */
