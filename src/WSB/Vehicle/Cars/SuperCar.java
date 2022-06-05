package WSB.Vehicle.Cars;

import WSB.Vehicle.Car;
import WSB.Vehicle.Equipment;

import java.util.ArrayList;
import java.util.Date;

public class SuperCar extends Car {
    private Integer horsePower;

    public SuperCar(String model, String producer, Integer dateOfProduction, String engineType, Double price, ArrayList<Equipment> equipment, Integer horsePower) {
        super(model, producer, dateOfProduction, price, engineType, equipment);
        this.horsePower = horsePower;
    }
}
