package WSB;

import WSB.Database.Database;
import WSB.UserInterface.UserInterface;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Database db = new Database();
        db.start();
        UserInterface UI = new UserInterface();
        UI.start();
//        Factory factory = new Factory(10,1000.0);
//        factory.createPickUp("Tesla", "Teslowy", "diesel",1250.50);
//        factory.createTrailer("Przyczep", "Ciagniety",  2);
//        System.out.println(db.getAllVehicles(1,3).toString());
    }
}
