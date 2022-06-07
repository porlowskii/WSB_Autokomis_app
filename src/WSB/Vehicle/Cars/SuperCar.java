package WSB.Vehicle.Cars;

import WSB.Vehicle.Car;

public class SuperCar extends Car {
    private Integer horsePower;

    public SuperCar(String model, String producer, Integer dateOfProduction, String engineType, Double price, Integer horsePower) {
        super(model, producer, dateOfProduction, price, engineType);
        this.horsePower = horsePower;
        dbf.addVehicle(1,2,this);
    }
}
