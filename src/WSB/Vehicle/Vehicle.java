package WSB.Vehicle;

import WSB.Database.DatabaseFactoring;

public abstract class Vehicle {
    private String model;
    private String producer;
    private Integer yearOfProduction;
    private Double price;
    public DatabaseFactoring dbf = new DatabaseFactoring();


    public Vehicle(String model, String producer, Integer yearOfProduction, Double price) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Double getPrice() {
        return price;
    }
}