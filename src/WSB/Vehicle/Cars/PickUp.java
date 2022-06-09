package WSB.Vehicle.Cars;

import WSB.Vehicle.Car;

public class PickUp extends Car {
    private Double capacity;
    public PickUp(String model, String producer, Integer dateOfProduction, String engineType, Double price, Double capacity) {
        super(model, producer, dateOfProduction, price, engineType);
        this.capacity=capacity;
    }
    @Override
    public String toString() {
        return "Model: "+ super.getModel()+", Producent: "+super.getProducer()+", Data produkcji: "+super.getYearOfProduction()+", Rodzaj silnika: "+super.getEngineType()+", Cena: "+super.getPrice()+", Ladowność: "+String.valueOf(capacity);
    }
}
