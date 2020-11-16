package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int currentYear = date.getYear();

    LocalDate laborDayTime = date.getMonthValue() < 5 ? LocalDate.of(currentYear + 0,5,1): LocalDate.of(currentYear+1,5,1);
    Period next = Period.between(date, laborDayTime);
    long day = ChronoUnit.DAYS.between(date,laborDayTime);
    return day;
  }
}
