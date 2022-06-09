package WSB.UserInterface;

import WSB.Departaments.Factory;

import java.util.Scanner;

public class UserInterface {
    public UserInterface() {}
    Employee employee = new Employee();
    Guest guest = new Guest();
    Factory factory = new Factory(0,0.0);
    public void start() {
        factory.tempInput();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj cel wizyty [wpisz liczbę] :");
            System.out.println("1: Lista pojazdów na sprzedaż");
            System.out.println("2: Praca");
            System.out.println("0: Opuść program");
            String input = scan.nextLine();
            Integer target;
            try {
                target = Integer.valueOf(input);
            } catch (Exception e) {
                System.out.println("Nieprawidłowy format, podaj jedynie liczbę");
                continue;
            }
            if (target == 0) {
                break;
            }
            if (target == 1) {
                guest.start();
            }
            if (target == 2) {
                employee.start();
            }
        }
    }
}
