package WSB.Vehicle;

public abstract class Vehicle {
    private String model;
    private String producer;
    private Integer yearOfProduction;
    private Double price;

    public Vehicle(String model, String producer, Integer yearOfProduction, Double price) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

}