package WSB.Vehicle;

import java.util.Date;

public class Trailer extends Vehicle{
    private Integer numberOfAxes;
    public Trailer(String model, String producer, Integer dateOfProduction, Double price, Integer numberOfAxes) {
        super(model, producer, dateOfProduction, price);
        this.numberOfAxes=numberOfAxes;
    }
}
