package AulaDeLocalDate;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class AulaLocalDate {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formatter de dia/mes/ano
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formatter de dia/mes/ano //
                                                                                  // hora/minutos
        //DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE;

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Formatter de
                                                                                     // dia/mes/ano/hora/minutos/segundos

        // LocalDate apenas.

        LocalDate d01 = LocalDate.now(); // Data local atual
        LocalDateTime d02 = LocalDateTime.now(); // Data hora local atual
        LocalDate d03 = LocalDate.parse("2004-03-19"); // Data local com parametro enviado
        LocalDateTime d04 = LocalDateTime.parse("2004-03-19T16:05:30"); // Data hora local com parametro enviado
        LocalDate d05 = LocalDate.parse("19/03/2004", fmt1); // Data local para receber valores especificos sem ser o padrao do java (padrao BR utilizado)
        LocalDateTime d06 = LocalDateTime.parse("19/03/2004 01:30", fmt2); // Data hora local para receber valores especificos sem ser o padrao do java (padrao BR utilizado)
        LocalDate d07 = LocalDate.of(2004, 03, 19); // data local com parametros especificos usando of
        LocalDateTime d08 = LocalDateTime.of(2004, 03, 19, 01, 30, 56);// data hora local com parametros especificos
                                                                       // usando of

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d06 = " + d06.format(fmt2));
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());

        System.out.println();
        System.out.println("d07 formatado = " + d07.format(fmt1));
        System.out.println("d08 formatado = " + d08.format(fmt4));

        // OBTER DADOS DE UMA DATA LOCAL

        System.out.println();

        System.out.println("Obter dados de uma data  local");

        int dia = d03.getDayOfMonth(); //Pegar data do mes
        int mes = d03.getMonthValue(); //Pegar numero do mes
        int ano = d03.getYear(); //Pegar numero do ano

        System.out.println("dia d03 = " + dia + "\nmes d03 = " + mes + "\nano d03 = " + ano);

        // OBTER DADOS DE UMA DATA HORA LOCAL

        System.out.println();

        System.out.println("Obter dados de uma data hora local");

        int diaH = d08.getDayOfMonth(); //pegar dia do mes
        int mesH = d08.getMonthValue(); //pegar numero do mes
        int anoH = d08.getYear(); // pegar numero do ano
        int horaH = d08.getHour(); //pegar numero da hora (0-23)
        int minutes = d08.getMinute(); //pegar minute(0-59)
        int seconds = d08.getSecond(); //pegar segundo(0-59)
        int nano = d08.getNano(); 

        System.out.println("diaH d08 = " + diaH + "\nmesH d08 = " + mesH + "\nanoH d08 = " + anoH + "\nhoraH d08 = "
                + horaH + "\nminuto d08 = " + minutes + "\nsegundos d08 = " + seconds);

        Month teste = d08.getMonth();

        System.out.println(teste);

    }

}
