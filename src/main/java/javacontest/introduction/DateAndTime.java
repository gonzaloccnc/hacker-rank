package javacontest.introduction;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {

  public static void main(String[] args) {
    System.out.println(findDay(8, 14, 2017));
    System.out.println(Instant.now());
    var clock = Clock.systemDefaultZone();
    System.out.println(LocalTime.now(clock));
  }

  public static String findDay(int month, int day, int year) {
    LocalDate date = LocalDate.of(year, month, day);
    return date.getDayOfWeek().name();
  }

}
