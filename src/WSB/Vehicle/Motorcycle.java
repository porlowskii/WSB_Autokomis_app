package WSB.Vehicle;

import java.util.ArrayList;
import java.util.Date;

public class Motorcycle extends Vehicle implements Service{
    private String type;
    private Integer engineCap;
    private ArrayList<Equipment> equipments;

    public Motorcycle(String model, String producer, Date dateOfProduction, Double price, String type, Integer engineCap, ArrayList<Equipment> equipment) {
        super(model, producer, dateOfProduction, price);
        this.type = type;
        this.engineCap = engineCap;
        this.equipments = equipment;
    }
    @Override
    public String clean() {
        return "Lśni jak nigdy";
    }

    @Override
    public String refuel() {
        return "Do pełna raz!";
    }
    @Override
    public void tuning(Equipment equipment) {
        equipments.add(equipment);
    }
}