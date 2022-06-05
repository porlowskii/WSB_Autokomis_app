package WSB.Departaments;

import java.util.ArrayList;

public class Workshop extends Departament implements Actions{
    public Workshop(Integer numberOfStaff, Double balance, ArrayList<Object> vehicleList) {
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
