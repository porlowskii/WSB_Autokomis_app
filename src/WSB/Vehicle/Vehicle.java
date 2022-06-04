package WSB.Vehicle;

import java.util.Date;

public abstract class Vehicle {
    private String model;
    private String producer;
    private Date dateOfProduction;
    private Double price;

    public Vehicle(String model, String producer, Date dateOfProduction, Double price) {
        this.model = model;
        this.producer = producer;
        this.dateOfProduction = dateOfProduction;
        this.price = price;
    }

}