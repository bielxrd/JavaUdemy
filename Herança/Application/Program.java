package Herança.Application;

import Herança.Entities.Account;
import Herança.Entities.BusinessAccount;
import Herança.Entities.SavingAccounts;

public class Program {
    public static void main(String[] args) {

      /*  Upcasting:
        Definição: Converter uma referência de uma classe filha para a classe pai.
                Exemplo: Pai obj = new Filha();

        Downcasting:
        Definição: Converter uma referência de uma classe pai para a classe filha.
                Exemplo: Filha obj = (Filha) paiObj; */

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);


        // Upcasting
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003, "Roberto", 300.0, 1000.0);
        Account acc3 = new SavingAccounts(1004, "Anna", 0.0, 0.01);

        // Downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        SavingAccounts acc5 = (SavingAccounts) acc;

        BusinessAccount acc6 = (BusinessAccount) acc3; // Operacao nao permitida, acc3 na verdade é um SavingAccounts

        


    }
}
