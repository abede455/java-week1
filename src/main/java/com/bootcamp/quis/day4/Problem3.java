package com.bootcamp.quis.day4;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(payDay(Month.OCTOBER));
        System.out.println(payDay(Month.SEPTEMBER));
        System.out.println(payDay(Month.DECEMBER));

    }

    public static String payDay(Month month) {
        int yearNow = LocalDate.now().getYear();
        LocalDate payDate = LocalDate.of(yearNow, month, month.maxLength());
        int day = payDate.getDayOfWeek().getValue();
        while (day == 6 || day == 7) {
            payDate = payDate.minusDays(1);
            day = payDate.getDayOfWeek().getValue();
        }
        return formatDate(payDate);

    }

    public static String formatDate(LocalDate localDate) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return localDate.format(format);
    }
}
