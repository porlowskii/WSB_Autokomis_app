package WSB.Vehicle;

import java.util.ArrayList;
import java.util.Date;

public abstract class Car extends Vehicle implements Service{
    private String engineType;
    private String fuel;
    private ArrayList<Equipment> equipments;

    public Car(String model, String producer, Date dateOfProduction,Double price, String engineType, ArrayList<Equipment> equipment ) {
        super(model, producer, dateOfProduction, price);
        this.engineType=engineType;
        this.equipments =equipment;

        switch (this.engineType) {
            case "benzine": this.fuel = "PB95";
            case "diesel": this.fuel = "ON";
            case "hybrid": this.fuel = "PB95";
            case "electric": this.fuel = "electricity";
        }
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
