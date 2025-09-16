package com.corejava.jdk8.dateandtime;

import java.time.LocalDate;

public class ManipulatingDateTimes {
    public static void main(String[] args) {
        System.out.println("------- Manipulating Dates & Times -------");
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date : "+localDate);
        LocalDate addDays = localDate.plusDays(10);
        System.out.println("Add 10 Days : "+addDays);
        LocalDate minusMonth = localDate.minusMonths(2);
        System.out.println("Minus 2 Months : "+minusMonth);
        LocalDate addYear =localDate.plusYears(2);
        System.out.println("Add 2 Year : "+addYear);
        LocalDate newYear = localDate.withYear(2026);
        System.out.println("Date with year 2026 : "+newYear);

    }
}
