package WSB.Vehicle;

import java.util.ArrayList;

public class Motorcycle extends Vehicle implements Service{
    private String type;
    private Integer engineCap;
    private ArrayList<Equipment> equipments;

    public Motorcycle(String model, String producer, Integer dateOfProduction, Double price, String type, Integer engineCap) {
        super(model, producer, dateOfProduction, price);
        this.type = type;
        this.engineCap = engineCap;
        dbf.addVehicle(2,1,this);
    }

    @Override
    public String clean() {
        return "Lśni jak nigdy";
    }
    @Override
    public String refuel() {
        return "Do pełna raz!";
    }
}