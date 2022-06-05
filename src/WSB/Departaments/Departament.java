package WSB.Departaments;

import java.util.ArrayList;

public abstract class Departament {
    private Integer numberOfStaff;
    private Double balance;
    private ArrayList<Object> vehicleList;
    public Departament (Integer numberOfStaff, Double balance, ArrayList<Object> carList) {
        this.numberOfStaff=numberOfStaff;
        this.balance=balance;
        this.vehicleList =carList;
    }
}
