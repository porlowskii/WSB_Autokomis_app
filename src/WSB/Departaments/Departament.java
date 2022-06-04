package WSB.Departaments;

public abstract class Departament {
    private Integer numberOfStaff;
    private Double balance;
    public Departament (Integer numberOfStaff, Double balance) {
        this.numberOfStaff=numberOfStaff;
        this.balance=balance;
    }
}
