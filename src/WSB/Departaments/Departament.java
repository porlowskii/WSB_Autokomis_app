package WSB.Departaments;

import WSB.Database.DatabaseFactoring;

import java.time.LocalDateTime;

public abstract class Departament {
    private Integer numberOfStaff;
    private Double balance;
    DatabaseFactoring dbf = new DatabaseFactoring();
    Integer today = Integer.valueOf(LocalDateTime.now().getYear());
    Double SUVprice = Double.valueOf(today*50);
    Double superCarPrice = Double.valueOf(today*150);
    Double pickUpPrice = Double.valueOf(today*70);
    Double motorcyclePrice = Double.valueOf(today*20);
    Double trailerPrice = Double.valueOf(today*7);
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
    public Double getSUVprice() {
        return SUVprice;
    }

    public Double getSuperCarPrice() {
        return superCarPrice;
    }

    public Double getPickUpPrice() {
        return pickUpPrice;
    }

    public Double getMotorcyclePrice() {
        return motorcyclePrice;
    }

    public Double getTrailerPrice() {
        return trailerPrice;
    }
}
