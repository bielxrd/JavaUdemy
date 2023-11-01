import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.text.*;
import java.time.*;
public class ClasseCalendar {
    public static void main(String[] args) {

        System.out.println("Adicionar horas, dias em um tempo etc");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Formatter para ISO br
        
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //Data com paramentro de horario ZULU

        System.out.println(sdf.format(d)); //Sera formatado o horario passado no Instant porem com padrao do sistema.

        Calendar cal = Calendar.getInstance();
        cal.setTime(d); //para o calendar receber as informar do nosso date.
        cal.add(Calendar.HOUR_OF_DAY, 4); //adicionar 4 horas pelo cal
        d = cal.getTime(); //ennviar o valor alterado para nosso date original

        System.out.println(sdf.format(d));

        System.out.println("Obtendo uma unidade do tempo!");
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE); //pega o valor em minutos do nosso date

        System.out.println("Minutes = "+minutes); //printara 42 minutos

        int month = 1 + cal.get(Calendar.MONTH); //O mes para o calendar começa no valor 0, ou seja, como meu date é do mes 06, para ele é o valor 05. A solucao é colocar um +1, para começar em 1

        System.out.println("month = "+month); // ´printara 6



        
    }
    
}
