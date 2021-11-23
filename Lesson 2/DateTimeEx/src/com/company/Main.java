package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate today = LocalDate.now();
        System.out.println(today);

     LocalDate current = LocalDate.of(2020, 12, 17);
        System.out.println(current);

      LocalDate date = LocalDate.of(2020, Month.AUGUST, 12);
        System.out.println(date);

        System.out.println(" tomorrow " +today.plusDays(1));
        System.out.println(" the day before " +today.minusDays(1));
        System.out.println(" lấy ngày hôm nay " +today.getDayOfMonth());
        System.out.println(" lấy thứ hôm nay " +today.getDayOfWeek());
        System.out.println(" lấy ngày theo năm " +today.getDayOfYear());
        System.out.println(" lấy tháng hiện tại " +today.getMonthValue());

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime time = LocalTime.of(10, 2 );
        System.out.println(time);
        System.out.println(now.getHour());

        LocalDateTime m = LocalDateTime.now();
        System.out.println(m);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(current.format(myFormat));

        DateTimeFormatter myFormatDateTime = DateTimeFormatter.ofPattern("hh:mm, dd/MM/yyyy");
        System.out.println();



    }
}
