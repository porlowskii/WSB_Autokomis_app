package WSB.Vehicle;

public class Trailer extends Vehicle{
    private Integer numberOfAxes;
    public Trailer(String model, String producer, Integer dateOfProduction, Double price, Integer numberOfAxes) {
        super(model, producer, dateOfProduction, price);
        this.numberOfAxes=numberOfAxes;
        dbf.addVehicle(3,1,this);
    }
    @Override
    public String toString() {
        return "Model: "+ super.getModel()+", Producent: "+super.getProducer()+", Data produkcji: "+super.getYearOfProduction()+", Cena: "+super.getPrice()+", Liczba osi: "+String.valueOf(numberOfAxes);
    }
}
