package Composicao.Exercicio.Application;

import Composicao.Exercicio.Entities.Department;
import Composicao.Exercicio.Entities.HourContract;
import Composicao.Exercicio.Entities.Worker;
import Composicao.Exercicio.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner ler = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = ler.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name:");
        String workerName = ler.nextLine();
        System.out.print("Level:");
        String workerLevel = ler.nextLine();
        System.out.print("Base salary:");
        double baseSalary = ler.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker ?");
        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(ler.next());
            System.out.print("Value per hour: ");
            double valuePerHour = ler.nextDouble();
            System.out.print("Duration(hours): ");
            int hours = ler.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);

            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calcule income (MM/yyyy): ");
        String monthAndYear = ler.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+ ": " + String.format("%.2f", worker.income(year, month)));


        ler.close();
    }
}
