package WSB.Vehicle.Cars;

import WSB.Vehicle.Car;

public class SUV extends Car {
    private Double clearance;
    public SUV(String model, String producer, Integer dateOfProduction, String engineType, Double price, Double clearance) {
        super(model, producer, dateOfProduction, price, engineType);
        this.clearance=clearance;
        dbf.addVehicle(1,1,this);
    }
}
