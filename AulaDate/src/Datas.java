import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date(); //data com horario atual
        Date x2 = new Date(System.currentTimeMillis()); //data com horario atual com outro comando
        Date x3 = new Date(0L); //
        Date x4 = new Date(1000L * 60 * 60 * 5L);

        Date y1 = sdf1.parse("25/06/2018"); //serve para receber uma data com iso br
        Date y2 = sdf2.parse("25/06/2018 15:42:07"); //serve para receber uma data hora com iso br
        Date y3 = Date.from(Instant.parse("2018-06-15T15:42:07Z")); //padrao ISO 8601

        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        System.out.println("x3 = "+x3);
        System.out.println("x4 = "+x4);
        System.out.println("y1 = "+y1);
        System.out.println("y2 = "+y2);
        System.out.println("y3 = "+y3);
        System.out.println("-----------------------");
        System.out.println("x1 = "+sdf2.format(x1));
        System.out.println("x2 = "+sdf2.format(x2));
        System.out.println("x3 = "+sdf2.format(x3));
        System.out.println("x4 = "+sdf2.format(x4));
        System.out.println("y1 = "+sdf1.format(y1));
        System.out.println("y2 = "+sdf2.format(y2));
        System.out.println("y3 = "+sdf2.format(y3));
        System.out.println("-----------------------");
        System.out.println("x1 = "+sdf3.format(x1));
        System.out.println("x2 = "+sdf3.format(x2));
        System.out.println("x3 = "+sdf3.format(x3));
        System.out.println("x4 = "+sdf3.format(x4));
        System.out.println("y1 = "+sdf3.format(y1));
        System.out.println("y2 = "+sdf3.format(y2));
        System.out.println("y3 = "+sdf3.format(y3));



    }
}
