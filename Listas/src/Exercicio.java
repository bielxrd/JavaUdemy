import java.util.*;
import Entities.Employee;

public class Exercicio {
    static Scanner ler = new Scanner(System.in);
    static List<Employee> list = new ArrayList<>();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("How many employees will be registered");
        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee: " + (i + 1));
            System.out.println("ID: ");
            Integer id = ler.nextInt();
            System.out.println("Name: ");
            ler.nextLine();
            String name = ler.nextLine();
            System.out.println("Salary: ");
            Double salary = ler.nextDouble();

            Employee employee = new Employee(name, id, salary);

            list.add(employee);

        }

        System.out.println("Enter the id that will have the salary increased");
        int id = ler.nextInt();
        System.out.println("Enter the percentage");
        double percentage = ler.nextDouble();

        for (Employee item : list) {
            if(item.getId()==id) {
                item.increaseSalary(percentage);
            }
            
        }

        for (Employee item: list) {
            System.out.println(item.getName()+" Salary: "+item.getSalary());
            
        }



    }

}
