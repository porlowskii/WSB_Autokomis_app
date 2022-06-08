package WSB.Departaments;

import WSB.Database.Database;

public class SalesZone extends Departament implements Actions{
    Database salon = new Database();

    public SalesZone(Integer numberOfStaff, Double balance) {
        super(numberOfStaff, balance);
    }


    @Override
    public void addVehicle(Integer type, Integer position, Integer numberOnList) {
        salon.addVehicle(type, position, dbf.getObjectVehicle(type, position, numberOnList));
    }

    @Override
    public void removeVehicle(Integer type, Integer position, Integer numberOnList) {
        salon.removeVehicle(type,position,numberOnList);
    }

    @Override
    public Database showAllVehicles() {
        return salon;
    }

}
