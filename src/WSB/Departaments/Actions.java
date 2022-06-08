package WSB.Departaments;

import WSB.Database.Database;

public interface Actions {

    public void addVehicle(Integer type, Integer position, Integer numberOnList);

    public void removeVehicle(Integer type, Integer position, Integer numberOnList);

    public Database showAllVehicles();
}
