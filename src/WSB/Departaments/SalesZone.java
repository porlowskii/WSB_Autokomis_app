package WSB.Departaments;

public class SalesZone extends Departament{

    public SalesZone(Integer numberOfStaff, Double balance) {
        super(numberOfStaff, balance);
    }

    public void sellCar(Integer type, Integer producer, Integer positionOnList, Double gotowka, Double zarobki) {
        System.out.println("Wybrany pojazd:");
        System.out.println(dbf.getVehicle(type, producer, positionOnList).toString());
        Double cena = 0.0;
        if (type ==1) {
            if (producer ==1) {
                cena=getSUVprice();
            }
            if (producer ==2) {
                cena=getSuperCarPrice();
            }
            if (producer ==3) {
                cena=getPickUpPrice();
            }
        }
        if (type == 2) {
            cena = getMotorcyclePrice();
        }
        if (type == 3) {
            cena = getTrailerPrice();
        }
        System.out.println("Cena "+cena);
        if (sprawdzenie(cena,gotowka,zarobki)) {
            dbf.removeVehicle(type,producer,positionOnList);
            System.out.println("---");
            System.out.println("Pojazd sprzedany");
            System.out.println("---");
        }
    }
    public boolean sprawdzenie(Double cena, Double gotowka, Double zarobki) {
        if (cena <= gotowka) {
            System.out.println("Sprzedano za gotowke");
            return true;
        }
        if (cena > gotowka && (zarobki*120*0.33) >= cena) {
            System.out.println("Sprzedano na kredyt na 10 lat");
            return true;
        }
        return false;
    }
}
