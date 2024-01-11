package Polimorfismo.Application;

import Polimorfismo.Entities.Employee;
import Polimorfismo.Entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Enter the number of employees ?");
        int n = ler.nextInt();

        LinkedList<Employee> funcionarios = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Outsorced Employee? (y/n)");
            String resp = ler.next();
            if (Objects.equals(resp, "y")) {
                System.out.println("Name? ");
                ler.nextLine();
                String name = ler.nextLine();
                System.out.println("Hours? ");
                Integer hours = ler.nextInt();
                System.out.println("Value per hours? ");
                Double valuePerHours = ler.nextDouble();
                System.out.println("Additional Charge ?");
                Double additionalCharge = ler.nextDouble();
                funcionarios.add(new OutsorcedEmployee(name, hours, valuePerHours, additionalCharge));
            } else {
                System.out.println("Name? ");
                ler.nextLine();
                String name = ler.nextLine();
                System.out.println("Hours? ");
                Integer hours = ler.nextInt();
                System.out.println("Value per hours? ");
                Double valuePerHours = ler.nextDouble();

                funcionarios.add(new Employee(name, hours, valuePerHours));

            }
        }

        System.out.println("Payments: ");
        for (Employee item : funcionarios) {
            System.out.println((item.getName()) + " - "+item.payment());
        }

    }
}
