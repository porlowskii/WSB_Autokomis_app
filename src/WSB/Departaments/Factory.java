package WSB.Departaments;

import WSB.Vehicle.Cars.PickUp;
import WSB.Vehicle.Cars.SUV;
import WSB.Vehicle.Cars.SuperCar;
import WSB.Vehicle.Motorcycle;
import WSB.Vehicle.Trailer;
public class Factory extends Departament{
    public Factory(Integer numberOfStaff, Double balance) {
        super(numberOfStaff, balance);
    }

    public void createSUV (String model, String producer, String engineType , Double clearance) {
        SUV temp = new SUV(model, producer, today, engineType, SUVprice, clearance);
        dbf.addVehicle(1,1,temp);
        withdraw(SUVprice);
    }

    public void createSuperCar (String model, String producer, String engineType, Integer horsePower) {
        SuperCar temp = new SuperCar(model, producer,today,engineType,superCarPrice,horsePower);
        dbf.addVehicle(1,2,temp);
        withdraw(superCarPrice);
    }

    public void createPickUp (String model, String producer, String engineType, Double capacity) {
        PickUp temp = new PickUp(model,producer,today,engineType,pickUpPrice,capacity);
        dbf.addVehicle(1,3,temp);
        withdraw(pickUpPrice);
    }

    public void createMotorcycle (String model, String producer , String type, Integer engineCap) {
        Motorcycle temp = new Motorcycle(model,producer,today,motorcyclePrice,type,engineCap);
        dbf.addVehicle(2,1,temp);
        withdraw(motorcyclePrice);
    }

    public void createTrailer (String model, String producer , Integer numberOfAxes) {
        Trailer temp = new Trailer(model,producer,today,trailerPrice,numberOfAxes);
        dbf.addVehicle(3,1,temp);
        withdraw(trailerPrice);
    }

    public void tempInput() {
        createSUV("Kodiaq", "Skoda", "diesel", 35.0);
        createSUV("Kamiq", "Skoda", "benzine", 20.0);
        createSUV("Rav4", "Toyota", "hybrid", 20.0);
        createSUV("Karoq", "Skoda", "benzine", 20.0);
        createSUV("X5", "BMW", "diesel", 35.0);
        createSuperCar("911", "Porshe", "benzine", 350);
        createSuperCar("Supra", "Toyota", "benzine", 200);
        createPickUp("Ranger", "Ford", "diesel", 1500.0);
        createPickUp("Hilux", "Toyota", "diesel", 2000.0);
        createMotorcycle("R6", "Yamaha", "Scigacz", 1000);
        createMotorcycle("Varadero", "Honda", "Turystyczny", 1000);
        createMotorcycle("RS125", "Aprilia", "Scigacz", 125);
        createTrailer("Cargo", "Przyczepix", 1);
        createTrailer("SuperCargo", "przyczepix", 2);
    }
}
