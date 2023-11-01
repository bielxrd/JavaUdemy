package Aplication;

import java.time.LocalDate;

import Entities.Pedido;
import enums.OrderStatus;

public class Program {
    
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido(1080, LocalDate.now(), OrderStatus.PENDING_PAYMENT); 

        System.out.println(pedido);
        OrderStatus os1 = OrderStatus.DELIVERED; //Instanciando um enum

        OrderStatus os2 = OrderStatus.valueOf("SHIPPED"); //Transforma uma String em enum

        System.out.println(os1);
        System.out.println(os2);

        String teste = OrderStatus.PROCESSING.toString(); //Transforma o enum em String

        System.out.println(teste); 

        //ver o typeof de os2
        System.out.println(os2.getClass().getSimpleName()); //getClass().getSimpleName() retorna o tipo da variavel
    }
    
}
