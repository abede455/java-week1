package com.bootcamp.quis.day4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(listFriday13th(2013, 2015));

    }

    public static List<LocalDate> listFriday13th(int startYear, int endYear) {
        List<LocalDate> result = new ArrayList<>();
        for (int year = startYear; year <= endYear; year++) {
            for (int month = 1; month <= 12; month++) {
                LocalDate localDate = LocalDate.of(year, month, 13);
                if (localDate.getDayOfWeek().getValue() == 5) {
                    result.add(localDate);
                }
            }
        }

        return result;
    }
}
