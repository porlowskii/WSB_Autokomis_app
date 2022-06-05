package WSB.Vehicle.Cars;

import WSB.Vehicle.Car;
import WSB.Vehicle.Equipment;

import java.util.ArrayList;
import java.util.Date;

public class SUV extends Car {
    private Double clearance;
    public SUV(String model, String producer, Integer dateOfProduction, String engineType, Double price, ArrayList<Equipment> equipment, Double clearance) {
        super(model, producer, dateOfProduction, price, engineType, equipment);
        this.clearance=clearance;
    }
}
