package WSB.Vehicle.Cars;

import WSB.Vehicle.Car;

public class PickUp extends Car {
    private Double capacity;
    public PickUp(String model, String producer, Integer dateOfProduction, String engineType, Double price, Double capacity) {
        super(model, producer, dateOfProduction, price, engineType);
        this.capacity=capacity;
        dbf.addVehicle(1,3,this);
    }
}
