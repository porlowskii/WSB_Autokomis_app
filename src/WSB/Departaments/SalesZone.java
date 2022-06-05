package WSB.Departaments;

import java.util.ArrayList;

public class SalesZone extends Departament implements Actions{
    public SalesZone(Integer numberOfStaff, Double balance, ArrayList<Object> vehicleList) {
        super(numberOfStaff, balance, vehicleList);
    }

    @Override
    public String checkCar(Object object) {
        return null;
    }

    @Override
    public void destroyCar() {

    }
}
