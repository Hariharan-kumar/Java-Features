package com.corejava.jdk8.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreateandAccessDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate specifiedDate = LocalDate.of(2025, Month.SEPTEMBER,16);
        System.out.println("------- Date -------");
        System.out.println("Date - "+date);
        System.out.println("Month - "+date.getMonth());
        System.out.println("Year - "+date.getYear());
        System.out.println("Day of month - "+date.getDayOfMonth());
        System.out.println("Day of week - "+date.getDayOfWeek());
        System.out.println("Specified Date - "+specifiedDate);

        System.out.println("------ Time -------");
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime - "+localTime);
        System.out.println("Time is - " +localTime.getHour() + localTime.getMinute() +localTime.getMinute()+localTime.getSecond());
        System.out.println("Minus Hours"+localTime.minusHours(2));

        System.out.println("------ Local Date & Time ------ ");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date & Time - "+localDateTime);
        System.out.println(""+localDateTime.getDayOfYear()+localDateTime.getDayOfMonth()+localDateTime.getDayOfWeek()+localDateTime.getHour()+localDateTime.getMinute()+localDateTime.getSecond());

    }
}
