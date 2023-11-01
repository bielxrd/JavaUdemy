
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();

        lista.add("Maria");
        lista.add("Marco");
        lista.add("Cavalo");
        lista.add("Ana");

        lista.add(1, "Rafael");

        System.out.println(lista.size());

      

        for (String i : lista) {
            System.out.println(i);
            
        }

        lista.removeIf(x -> x.charAt(0)== 'M');

        for (String i : lista) {
            System.out.println(i);
            
        }

        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.removeIf(n -> n % 2 == 0);

        System.out.println(list);

        List<String> result = new ArrayList<>();
        result = lista.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());

        System.out.println(result);

        String name = lista.stream().filter(x -> x.charAt(0)== 'R').findFirst().orElse(null);
        System.out.println(name);
    

        


    }

}
