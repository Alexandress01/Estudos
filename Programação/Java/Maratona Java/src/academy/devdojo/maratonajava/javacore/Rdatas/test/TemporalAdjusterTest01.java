package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class obterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int adicionarDia;

        switch (dayOfWeek) {
            case THURSDAY:
                adicionarDia = 4;
                break;
            case FRIDAY:
                adicionarDia = 3;
                break;
            case SATURDAY:
                adicionarDia = 2;
                break;
            default:
                adicionarDia = 1;
        }
        return temporal.plus(adicionarDia, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().withDayOfMonth(25).with(new obterProximoDiaUtil());

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().withDayOfMonth(27).with(new obterProximoDiaUtil());

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().withDayOfMonth(26).with(new obterProximoDiaUtil());

        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
