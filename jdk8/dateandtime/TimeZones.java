package com.corejava.jdk8.dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {

    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println("Current Zone Now : " + zone);
        ZonedDateTime specific = ZonedDateTime.of(2025, 9, 16, 11, 41, 0, 0, ZoneId.of("Asia/Kolkata"));
        System.out.println("Specific date-time (IST): " + specific);
        System.out.println("Get Zone : "+zone.getZone());

    }

}
