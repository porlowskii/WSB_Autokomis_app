package WSB.Departaments;

import WSB.Database.Database;

public class Workshop extends Departament implements Actions{
    Database workshop = new Database();

    public Workshop(Integer numberOfStaff, Double balance) {
        super(numberOfStaff, balance);
    }


    @Override
    public void addVehicle(Integer type, Integer position, Integer numberOnList) {
        workshop.addVehicle(type, position, dbf.getObjectVehicle(type, position, numberOnList));
    }

    @Override
    public void removeVehicle(Integer type, Integer position, Integer numberOnList) {
        workshop.removeVehicle(type,position,numberOnList);
    }

    @Override
    public Database showAllVehicles() {
        return workshop;
    }
}
