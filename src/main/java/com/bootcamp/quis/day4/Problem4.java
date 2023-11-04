package com.bootcamp.quis.day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Problem4 {
    public static void main(String[] args) {
        timeArrives(
                "Asia/Jayapura",
                "Asia/Jakarta",
                "12/10/2023 01:10:00 PM",
                "11:50");

    }

    public static void timeArrives(String sourceCity, String destinationCity, String dateTime, String duration) {
        String[] durationStrings = duration.split(":");
        int hour = Integer.parseInt(durationStrings[0]);
        int minute = Integer.parseInt(durationStrings[1]);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        ZoneId zonaAsal = ZoneId.of(sourceCity);
        ZonedDateTime zonedDateTimeSource = ZonedDateTime.of(LocalDateTime.parse(dateTime, dateTimeFormatter),
                zonaAsal);
        System.out.println("Waktu Berangkat : " + zonedDateTimeSource.toLocalDateTime().format(dateTimeFormatter));
        System.out.println("Kota Asal : " + zonaAsal.toString());
        System.out.println("=========================================");
        zonedDateTimeSource = zonedDateTimeSource.plusHours(hour);
        zonedDateTimeSource = zonedDateTimeSource.plusMinutes(minute);
        ZoneId zonaTujuan = ZoneId.of(destinationCity);
        ZonedDateTime zonedDateTimeDestination = zonedDateTimeSource.withZoneSameInstant(zonaTujuan);
        System.out.println("Waktu Tiba : " + zonedDateTimeDestination.toLocalDateTime().format(dateTimeFormatter));
        System.out.println("Kota Tujuan : " + zonaTujuan.toString());

    }
}
