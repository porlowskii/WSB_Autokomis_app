package WSB.Database;

import WSB.Vehicle.Cars.PickUp;
import WSB.Vehicle.Cars.SUV;
import WSB.Vehicle.Cars.SuperCar;
import WSB.Vehicle.Motorcycle;
import WSB.Vehicle.Trailer;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    private static HashMap<Integer, ArrayList> cars = new HashMap<>();
    private static HashMap<Integer, ArrayList> motorcycles = new HashMap<>();
    private static HashMap<Integer, ArrayList> trailers = new HashMap<>();
    private static HashMap<Integer, HashMap <Integer, ArrayList>> hashMap = new HashMap<>();
    public Database() {

    }

    public void start() {
        cars.put(1,new ArrayList<SUV>());
        cars.put(2, new ArrayList<SuperCar>());
        cars.put(3, new ArrayList<PickUp>());
        motorcycles.put(1, new ArrayList<Motorcycle>());
        trailers.put(1, new ArrayList<Trailer>());

        hashMap.put(1,cars);
        hashMap.put(2,motorcycles);
        hashMap.put(3, trailers);
    }
    public void addVehicle (Integer type, Integer position, Object object) {
        hashMap.get(type).get(position).add(object);
    }
    public String getVehicle (Integer type, Integer position, Integer numberOnList) {
        return hashMap.get(type).get(position).get(numberOnList).toString();
    }

    public Object getObjectVehicle (Integer type, Integer position, Integer numberOnList) {
        return hashMap.get(type).get(position).get(numberOnList);
    }

    public ArrayList getAllVehicles (Integer type, Integer position) {
        return hashMap.get(type).get(position);
    }

    public void removeVehicle(Integer type, Integer position, Integer numberOnList) {
        hashMap.get(type).get(position).remove(numberOnList);
    }

    public HashMap getAllDatabase() {
        return hashMap;
    }
}
