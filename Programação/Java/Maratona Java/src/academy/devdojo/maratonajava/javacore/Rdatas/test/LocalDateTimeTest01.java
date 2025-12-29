package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2026-01-01");
        LocalTime time = LocalTime.parse("09:45:00");
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);

        LocalDateTime localDateTime1 = date.atTime(time);

        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = time.atDate(date);

        System.out.println(localDateTime2);
    }
}
