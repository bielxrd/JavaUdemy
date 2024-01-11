package ClassesAbstratas.Entities;

public abstract class Account {
 // Pq utilizar classes abstratas?

 /*
 Uma forma de garantir heranca total, somente subclasses podem ser instanciadas, nao pode instanciar classes abstratas

 Garante o Reuso

 Polimorfismo: A superclasse generica nos permite tratar de forma facil e uniforme todos os tipos de conta, inclusive com polimorfismo
  */
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }




}
