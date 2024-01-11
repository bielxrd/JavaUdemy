package ClassesAbstratas.Application;

import ClassesAbstratas.Entities.Account;
import ClassesAbstratas.Entities.BusinessAccount;
import ClassesAbstratas.Entities.SavingAccounts;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Account> lista = new ArrayList<>();

        lista.add(new SavingAccounts(1001, "Alex", 500.0, 0.01));
        lista.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        lista.add(new SavingAccounts(1003, "Bob", 300.0, 0.01));
        lista.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

        double sum = 0.0;


        // Exemplos de que torna mais facil de lidar todos os tipos de conta com uma super generica
        for (Account acc : lista) {
            sum += acc.getBalance();
        }
        System.out.println("Total balance = "+sum);

        for (Account item : lista) {
            item.deposit(10.0);
        }

        for (Account item : lista) {
            System.out.println("Updated balance: "+item.getBalance());
        }
    }
}
