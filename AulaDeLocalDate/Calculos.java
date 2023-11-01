package AulaDeLocalDate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {
    public static void main(String[] args) {
        // Calculos com data hora local e data local

        LocalDate d04 = LocalDate.parse("2004-03-19");
        LocalDateTime d05 = LocalDateTime.parse("2004-03-19T01:30:26");
        Instant d06 = Instant.parse("2004-03-19T01:30:26Z");

        LocalDate pastWeek = d04.minusWeeks(1); // SUBTRAIR 1 SEMANA

        System.out.println("pastWeek = " + pastWeek);

        pastWeek = pastWeek.minusDays(3); // SUBTRAIR 3 DIAS

        System.out.println("pastWeek = " + pastWeek);

        LocalDate nextWeek = d04.plusDays(7); // ADICIONAR 7 DIAS

        System.out.println("nextWeek = " + nextWeek);
        System.out.println("nextYear = " + d04.plusYears(2)); // ADICIONAR 2 ANOS

        // LocalDateTime

        LocalDateTime pastWeekTime = d05.minusWeeks(1); // SUBTRAIR 1 SEMANA

        System.out.println("pastWeekTime = " + pastWeekTime);

        LocalDateTime nextWeekTime = d05.plusHours(24); // 24 horas depois

        System.out.println("nextWeekTime = " + nextWeekTime);

        // Instant

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // sempre que for querer adicionar ou retirar horas,
                                                                 // dias etc de um instant, usar o ChronoUnit

        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // ADICIONAR 7 DIAS EM UM INSTANT

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekTime, d05); // Duration entre LocalDateTime

        System.out.println("Duration t1 = " + t1.toDays());

        Duration t2 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay()); // Sempre que for calcular uma duration
                                                                                 // entre dois LocalDate, necessario
                                                                                 // usar a funcao atTime ou atStartOfDay e definir o
                                                                                 // horario

        System.out.println("Duraton LocalDate t2 = " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println("Duration Instant t3 = " + t3.toDays());

        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("Duration Instant t4 = "+t4.toDays());

        



    }

}
