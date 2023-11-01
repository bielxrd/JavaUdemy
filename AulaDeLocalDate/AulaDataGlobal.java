package AulaDeLocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AulaDataGlobal {
    public static void main(String[] args) {

        // Data hora global

        Instant d01 = Instant.now(); // Data hora global, mostrata o horario de londres
        Instant d02 = Instant.parse("2004-03-19T01:30:26Z"); // Data hora global especificando um horario, no caso,
                                                             // 16:05:30 no horario de londres
        Instant d03 = Instant.parse("2004-03-19T01:30:26-03:00"); // data hora global com fuso horario( Printara
                                                                  // 19:05:30, esta sendo especificado que o horario é
                                                                  // -3 em relacao a Londres)

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Formatar
                                                                                                                   // Data
                                                                                                                   // hora
                                                                                                                   // global
                                                                                                                   // usando
                                                                                                                   // o
                                                                                                                   // horario
                                                                                                                   // default
                                                                                                                   // do
                                                                                                                   // sistema
                                                                                                                   // do
                                                                                                                   // pc
        DateTimeFormatter fmt2 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());

        System.out.println("d01 formatado = " + fmt1.format(d01));

        System.out.println("Instant usando ISO d02 = " + fmt2.format(d02));

        // CONVERTER DATA HORA GLOBAL PARA LOCAL:
        System.out.println("Converter data hora global para data local");

        LocalDate r1 = LocalDate.ofInstant(d02, ZoneId.systemDefault()); // Converter instant para LocalDate, usando o
                                                                         // horario padrao do sistema

        System.out.println("Primeira conversao r1 = " + r1.toString());

        LocalDate r2 = LocalDate.ofInstant(d02, ZoneId.of("Portugal")); // Converter instant para LocalDate usando o
                                                                        // horario de Portugal
        System.out.println("Segunda conversao usando um pais r2 = " + r2.toString());

        LocalDateTime r3 = LocalDateTime.ofInstant(d02, ZoneId.systemDefault()); // Converter Instant para LocalDateTime
                                                                                 // para o padrao do sistema
                                                                                 
        LocalDateTime r4 = LocalDateTime.ofInstant(d02, ZoneId.of("Europe/Moscow")); // Converter Instant para
                                                                                     // LocalDateTime para o padrao da
                                                                                     // Russia Moscow

        System.out.println("Conversao de Instant para LocalDateTime no sistema local r3 = " + r3.toString());
        System.out.println("Conversao de Instant para LocalDateTime para moscow na russia r4 = " + r4.toString());

        

    }

}
