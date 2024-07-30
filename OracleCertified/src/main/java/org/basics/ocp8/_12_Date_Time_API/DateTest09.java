package org.basics.ocp8._12_Date_Time_API;

import java.time.ZoneId;
import java.util.Set;

public class DateTest09 {

    public static void main(String[] args) {

        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println(defaultZone);
        System.out.println("----------");
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.forEach(System.out::println);

    }

}
