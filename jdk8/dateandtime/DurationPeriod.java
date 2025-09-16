package com.corejava.jdk8.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class DurationPeriod {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2025,9,16);
        LocalDate end = LocalDate.of(2025,10,17);
        Period period = Period.between(start,end);
        System.out.println("Duration Between : "+"Year : "+period.getYears()+" Month : "+period.getMonths()+" Days : "+period.getDays());


    }
}
