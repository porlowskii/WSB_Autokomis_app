package WSB.Departaments;

import WSB.Database.DatabaseFactoring;

public abstract class Departament {
    private Integer numberOfStaff;
    private Double balance;
    DatabaseFactoring dbf = new DatabaseFactoring();
    public Departament (Integer numberOfStaff, Double balance) {
        this.numberOfStaff=numberOfStaff;
        this.balance=balance;
    }

    public void deposit(Double money) {
        balance=balance+money;
    }
    public void withdraw(Double money) {
        balance = balance-money;
    }
    public Double balance() {
        return balance;
    }
}
