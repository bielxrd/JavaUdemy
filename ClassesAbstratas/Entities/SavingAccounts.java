package ClassesAbstratas.Entities;

public class SavingAccounts extends Account {
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
}
