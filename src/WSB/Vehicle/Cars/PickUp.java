package WSB.Vehicle.Cars;

import WSB.Vehicle.Car;
import WSB.Vehicle.Equipment;

import java.util.ArrayList;
import java.util.Date;

public class PickUp extends Car {
    private Double capacity;
    public PickUp(String model, String producer, Integer dateOfProduction, String engineType, Double price, ArrayList<Equipment> equipment, Double capacity) {
        super(model, producer, dateOfProduction, price, engineType, equipment);
        this.capacity=capacity;
    }
}
