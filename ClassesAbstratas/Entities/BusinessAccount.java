package ClassesAbstratas.Entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= getLoanLimit())
            balance += amount - 10.0;
        else System.out.println("Cannot make the loan");
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
