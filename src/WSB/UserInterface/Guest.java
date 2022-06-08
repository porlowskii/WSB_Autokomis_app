package WSB.UserInterface;

import WSB.Database.DatabaseFactoring;

import java.util.Locale;
import java.util.Scanner;

public class Guest {
    Scanner scan = new Scanner(System.in);
    DatabaseFactoring dbf = new DatabaseFactoring();

    public Guest() {
    }

    public void start() {

        while (true) {
            System.out.println("Wybierz rodzaj pojazdu:");
            System.out.println("1: Samochód");
            System.out.println("2: Motocykl");
            System.out.println("3: Przyczepa");
            System.out.println("0: Powrót");
            System.out.println("X: Wyjście z programu");
            String inputSalon = scan.nextLine();
            if (inputSalon.toLowerCase(Locale.ROOT).equals("x")) {
                System.exit(0);
            }
            Integer targetSalon;
            try {
                targetSalon = Integer.valueOf(inputSalon);
            } catch (Exception e) {
                System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                continue;
            }
            if (targetSalon == 0) {
                break;
            }
            if (targetSalon == 1) {
                System.out.println("Jaki typ samochodu?");
                System.out.println("1: SUV");
                System.out.println("2: SuperCar");
                System.out.println("3: PickUp");
                System.out.println("X: Wyjście z programu");
                String inputCar = scan.nextLine();
                if (inputCar.toLowerCase(Locale.ROOT).equals("x")) {
                    System.exit(0);
                }
                Integer targetCar;
                try {
                    targetCar = Integer.valueOf(inputCar);
                } catch (Exception e) {
                    System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                    continue;
                }
                System.out.println("Lista pojazdów:");
                for (int i = 0; i < dbf.getAllVehicles(targetSalon, targetCar).size(); i++) {
                    System.out.println(i + 1 + ": " + dbf.getAllVehicles(targetSalon, targetCar).get(i).toString());
                }
            }
            if (targetSalon == 2 || targetSalon == 3) {
                System.out.println("Lista pojazdów:");
                for (int i = 0; i < dbf.getAllVehicles(targetSalon, 1).size(); i++) {
                    System.out.println(i + 1 + ": " + dbf.getAllVehicles(targetSalon, 1).get(i).toString());
                }
            }
        }
    }
}
