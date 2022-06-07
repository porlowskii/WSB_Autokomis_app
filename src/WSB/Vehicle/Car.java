package WSB.Vehicle;

public abstract class Car extends Vehicle implements Service{
    private String engineType;
    private String fuel;

    public Car(String model, String producer, Integer dateOfProduction,Double price, String engineType) {
        super(model, producer, dateOfProduction, price);
        this.engineType=engineType;

        switch (this.engineType) {
            case "benzine": this.fuel = "PB95";
            case "diesel": this.fuel = "ON";
            case "hybrid": this.fuel = "PB95";
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

}
