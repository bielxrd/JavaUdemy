package Herança.Entities;

public final class SavingAccounts extends Account { // final na hora de definir a classe serve para que nao seja possivel ter subclasses de Saving Acoounts
    private Double interestRate;

    public SavingAccounts(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public SavingAccounts() {
        super();
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount) { // Final no metodo restringe a sobrescrita deste metodo.
        balance -= amount;
    }

    // Vantagens da palavra final na classe ou metodo:

    // - Seguranca

    // - Perfomance: Atributos de tipo de uma classe final sao analisados de forma mais rapido em tempo de execucao

    // Geralmente, convem acrescentar o final em metodos sobrepostos, pois muitas sobreposicoes podem ser uma porta de entrada para inconsistencias

}
